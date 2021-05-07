package com.example.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.List;


@Data
public class PosterOrderRequestDTO implements Serializable {

    @JsonProperty("spot_id")
    protected Integer spotId;

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

    @JsonProperty("payment")
    protected PosterOrderPaymentDTO posterOrderPaymentDTO;

    @JsonProperty("products")
    private List<OrdersProduct> products;

    @Data
    public static class OrdersProduct {

        @JsonProperty("product_id")
        protected Long productId;

        @JsonProperty("count")
        protected Integer count;

    }
}
