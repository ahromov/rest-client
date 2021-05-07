package com.example.models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class ApiPosterPartnersOrderResultDTO {

    private String id;
    private String partner_token;
    private Long incoming_order_id;
    private Long order_payment_number;
    private Integer spot_id;
    private Long client_id;
    private String first_name;
    private String last_name;
    private String phone;
    private String email;
    private Integer sex;
    private String birthday;
    private String address;
    private String comment;
    private String promotion;
    private Integer status;
    private String created_at;
    private String updated_at;
    private Integer service_mode;
    private Long delivery_price;
    private String payment;
    private Integer type;
    private String transaction_id;
    private Integer fiscal_spreading;
    private String fiscal_method;
    private Integer sum;
    private Integer bonus;
    private Long cookingTime;
    private List<ApiPosterOrderProductDTO> products = new ArrayList<>();

    @Data
    public static class ApiPosterOrderProductDTO {

        private Long io_product_id;
        private Long product_id;
        private Integer modificator_id;
        private Integer incoming_order_id;
        private Integer count;
        private LocalDateTime created_at;
        private Long price;
    }

    @Override
    public String toString() {
        return "ApiPosterPartnersOrderResultDTO{" +
                "id='" + id + '\'' +
                ", partner_token='" + partner_token + '\'' +
                ", incoming_order_id=" + incoming_order_id +
                ", order_payment_number=" + order_payment_number +
                ", spot_id=" + spot_id +
                ", client_id=" + client_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", comment='" + comment + '\'' +
                ", promotion='" + promotion + '\'' +
                ", status=" + status +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", service_mode=" + service_mode +
                ", delivery_price=" + delivery_price +
                ", payment='" + payment + '\'' +
                ", type=" + type +
                ", transaction_id='" + transaction_id + '\'' +
                ", fiscal_spreading=" + fiscal_spreading +
                ", fiscal_method='" + fiscal_method + '\'' +
                ", sum=" + sum +
                ", bonus=" + bonus +
                ", cookingTime=" + cookingTime +
                ", products=" + products +
                '}';
    }
}
