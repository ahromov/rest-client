package com.example.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
@Builder
public class ClientOrderRequestDTO implements Serializable {

    @JsonProperty("spot_id")
    protected String spotId;

    @JsonProperty("phone")
    protected String phone;

    @JsonProperty("first_name")
    protected String firstName;

    @JsonProperty("address")
    protected String address;

    @JsonProperty("service_mode")
    protected Integer serviceMode;

    @JsonProperty("comment")
    protected String comment;

    @JsonProperty("selected_delivery_interval")
    protected String selectedDeliveryInterval;

    @JsonProperty("sum")
    protected Integer sum;

     @JsonProperty("bonus")
    protected Integer bonus;

    @JsonProperty("products")
    private List<OrdersProduct> products;

    @Data
    @Builder
    public static class OrdersProduct {

        @JsonProperty("product_id")
        protected String productId;

        @JsonProperty("count")
        protected Integer count;
    }
}
