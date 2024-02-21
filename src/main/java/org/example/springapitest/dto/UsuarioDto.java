package org.example.springapitest.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.IdGeneratorType;

@Getter
@Setter
public class UsuarioDto {
    private String name;
    private String lastname;
    private String email;
}
