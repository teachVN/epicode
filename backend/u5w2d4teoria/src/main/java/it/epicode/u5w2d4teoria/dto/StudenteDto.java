package it.epicode.u5w2d4teoria.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class StudenteDto {
    @NotEmpty(message = "Il nome non può essere nullo e vuoto")
    private String nome;
    @NotEmpty(message = "Il cognome non può essere nullo e vuoto")
    private String cognome;
    @NotNull(message = "La data di nascita non può essere nulla")
    private LocalDate dataNascita;
    private int universitaId;
}
