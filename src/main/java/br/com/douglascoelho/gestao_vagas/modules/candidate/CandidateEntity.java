package br.com.douglascoelho.gestao_vagas.modules.candidate;

import java.util.UUID;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @Pattern(regexp = "^(?!\\s*$).+", message = "o campo [username] nao deve conter espaço")
    private String username;

    @Email(message = "o campo (email) de conter um e-mail valido")
    private String email;

    @Length(min = 10, max = 100)
    private String password;
    private String description;
    private String curriculum;

}
