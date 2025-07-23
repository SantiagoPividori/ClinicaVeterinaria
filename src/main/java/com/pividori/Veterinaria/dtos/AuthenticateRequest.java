package com.pividori.Veterinaria.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthenticateRequest {

    @NotNull(message = "The email is mandatory")
    @Email(message = "The given email does not match the pattern")
    private String email;
    @NotNull(message = "The password is mandatory")
    @Length(min = 5, message = "The password should be at least of 5 characters og length")
    private String password;

}
