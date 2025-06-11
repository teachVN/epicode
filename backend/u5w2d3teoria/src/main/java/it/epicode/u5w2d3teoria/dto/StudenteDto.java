package it.epicode.u5w2d3teoria.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudenteDto {
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private int universitaId;
}
