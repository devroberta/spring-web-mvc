package br.com.devroberta.springwebmvc.model;

import jakarta.validation.constraints.NotBlank;


public class Jedi {

    @NotBlank
    private String name;

    @NotBlank
    private String lastName;

    public Jedi() {
    }

    public Jedi(final String name, String lastname) {
        this.name = name;
        this.lastName = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
