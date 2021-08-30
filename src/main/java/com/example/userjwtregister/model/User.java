package com.example.userjwtregister.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull
    @NotEmpty
    @Length(min = 5)
    private String name;

    @NotNull
    @NotEmpty
    @Length(min = 5)
    private String surname;

    @NotNull
    @NotEmpty
    @Length(min = 10)
    private String email;

    @NotNull
    @NotEmpty
    @Length(min = 8)
    private String password;
}
