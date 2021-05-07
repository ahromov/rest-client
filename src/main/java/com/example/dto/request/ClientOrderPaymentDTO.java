package com.example.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClientOrderPaymentDTO {

    @JsonProperty("type")
    protected Integer type;

    @JsonProperty("sum")
    protected Integer sum ;

}
