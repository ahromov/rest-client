package com.example.dto.response;

import lombok.Data;

@Data
public class PosterOrderResponseWrapper {

    private PosterOrderResponseDTO response;

    private String error;
    private String message;


}
