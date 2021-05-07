package com.example.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


@Data
public class PosterOrderResponseDTO {

    @JsonProperty("spot_id")
    protected Integer spotId;

    @JsonProperty("first_name")
    protected String firstName;

    @JsonProperty("last_name")
    protected String lastName;

    @JsonProperty("phone")
    protected String phone;

    @JsonProperty("email")
    protected String email;

    @JsonProperty("address")
    protected String address;

    @JsonProperty("comment")
    protected String comment;

    @JsonProperty("service_mode")
    protected Integer serviceMode;

    @JsonProperty("incoming_order_id")
    private Long incomingOrderId;

    @JsonProperty("client_id")
    private Long clientId;

    @JsonProperty("sex")
    private Integer sex;

    @JsonProperty("birthday")
    private String birthday;

    @JsonProperty("promotion")
    private String promotion;

    @JsonProperty("status")
    private String status;

    @JsonProperty("created_at")
    private String cteatedAt;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("delivery_price")
    private String deliveryPrice;

    @JsonProperty("payment_method_id")
    private String payment;

    @JsonProperty("type")
    private String type;

    @JsonProperty("transaction_id")
    private String transactionId;

    @JsonProperty("fiscal_spreading")
    private String fiscalSpreading;

    @JsonProperty("fiscal_method")
    private String fiscalMethod;

    @JsonProperty("products")
    private List<InOrderProduct> products;

    @Data
    public static class InOrderProduct {

        @JsonProperty("io_product_id")
        protected Long ioProductId;

        @JsonProperty("product_id")
        protected Long productId;

        @JsonProperty("count")
        protected Double count;

        @JsonProperty("modificator_id")
        private Integer modificatorId;

        @JsonProperty("incoming_order_id")
        private Integer incomingOrderId;

        @JsonProperty("created_at")
        private String createdAt;

        @JsonProperty("price")
        private Long price;
    }
}
