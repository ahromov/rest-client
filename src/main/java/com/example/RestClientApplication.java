package com.example;

import com.example.dto.request.ClientOrderRequestDTO;
import com.example.models.ApiPosterPartnersOrderResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@SpringBootApplication
public class RestClientApplication {

    private static RestTemplate restTemplate = new RestTemplate();
    private static long x ;
    private static long count = 0;

    @ExceptionHandler(RuntimeException.class)
    public static void main(String[] args) throws InterruptedException {
        SpringApplication springApplication = new SpringApplication(RestClientApplication.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);

        x = System.currentTimeMillis() / 1000;
        for (int i = 0; i < 1000; i++) {
            new RestThread().start();
        }
        long y = System.currentTimeMillis() / 1000;
        System.out.println(y - x);
        System.out.println(count);
    }

    static class RestThread extends Thread {

        ClientOrderRequestDTO clientOrderRequestDTO = ClientOrderRequestDTO.builder()
                .spotId("4449997a-d4e6-4f06-842e-c53f3320f7c6")
                .address("")
                .bonus(0)
                .comment("test")
                .firstName("test")
                .products(List.of(ClientOrderRequestDTO.OrdersProduct.builder()
                        .productId("5b78dd30-50ff-49b5-af7e-d767af35e25b")
                        .count(1)
                        .build()))
                .serviceMode(2)
                .selectedDeliveryInterval("2021-04-28T12:03")
                .sum(8000)
                .phone("55555555555")
                .build();

        @Override
        public void run() {
            ApiPosterPartnersOrderResultDTO apiPosterPartnersOrderResultDTO = restTemplate.postForObject("https://chebureck-api.unitbeandev.com/api/v1/order/create", clientOrderRequestDTO, ApiPosterPartnersOrderResultDTO.class);
            x += System.currentTimeMillis() / 1000;
            count++;
            log.info(apiPosterPartnersOrderResultDTO.toString());
        }
    }
}
