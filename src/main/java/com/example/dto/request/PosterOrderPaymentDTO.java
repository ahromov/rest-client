package com.example.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PosterOrderPaymentDTO {


    @JsonProperty("type")
    protected Integer type = 1;

    @JsonProperty("sum")
    protected Integer sum ;

    @JsonProperty("currency")
    protected String currency;

}
