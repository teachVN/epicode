package it.epicode.u5w2d3pratica.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiError {
    private String message;
    private LocalDateTime dataErrore;
}
