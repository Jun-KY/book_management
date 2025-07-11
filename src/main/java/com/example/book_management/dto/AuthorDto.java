package com.example.book_management.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthorDto {
    private Integer id;

    @NotBlank(message = "Input name")
    private String name;
}
