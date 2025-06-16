package it.epicode.u5w3d1pratica.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginDto {
    @NotEmpty(message = "L'email non può essere vuota")
    @Email(message = "L'email deve essere ben strutturata")
    private String email;
    @NotEmpty(message = "La password non può essere vuota")
    private String password;
}
