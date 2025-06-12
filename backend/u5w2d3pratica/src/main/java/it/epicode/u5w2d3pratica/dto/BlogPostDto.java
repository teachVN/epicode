package it.epicode.u5w2d3pratica.dto;

import lombok.Data;

@Data
public class BlogPostDto {
    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempoDiLettura;
    private int autoreId;
}
