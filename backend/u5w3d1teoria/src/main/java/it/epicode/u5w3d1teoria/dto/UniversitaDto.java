package it.epicode.u5w3d1teoria.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UniversitaDto {
    @NotEmpty(message = "Il nome non può essere nullo e vuoto")
    private String nome;
    @NotEmpty(message = "La città non può essere nulla e vuota")
    private String citta;
}
