package org.example.springapitest.document;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Usuario {
    @Id
    private String _id;
    private String name;
    private String lastname;
    private String email;
    private String password;
}
