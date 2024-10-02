package com.br.zup.validations.controllers.dtos;

import jakarta.validation.constraints.*;

import java.time.Year;

public class UserRegisterDTO {
    @NotBlank(message = "O nome é obrigatório e não pode estar nulo")
    private String name;

    @NotNull(message = "A idade é obrigatória e não pode estar nulo")
    @Min(value = 18, message = "A idade mínima é de 18 anos, digite um valor válido")
    @Max(value = 109, message = "A idade máxima é de 110 anos, digite um valor válido")
    private int age;

    @NotNull(message = "Você precisa digitar um ano de nascimento válido")
    private Integer yearOfBirth;

    @NotBlank(message = "O email é obrigatório e não pode estar nulo")
    @Email(message = "O email deve estar em um formato válido.")
    private String email;

    public UserRegisterDTO() {
    }

    @AssertTrue(message = "O ano de nascimento é inválido.")
    public boolean isYearOfBirthValid() {
        int currentYear = Year.now().getValue();
        return (currentYear - yearOfBirth) < 110 &&
                yearOfBirth != currentYear &&
                yearOfBirth == (currentYear - age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
