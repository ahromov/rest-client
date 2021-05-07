package com.example.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalTime;

@Data
public class PosterOrderCookingTimeResponseDTO {

    @JsonProperty("minimumCookingTime")
    protected LocalTime minimumCookingTime;

    public PosterOrderCookingTimeResponseDTO(LocalTime minimumCookingTime) {
        this.minimumCookingTime = minimumCookingTime;
    }
}
