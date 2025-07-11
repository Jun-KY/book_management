package com.example.book_management.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookDto {
    private Integer id;

    @NotBlank(message = "Input Title")
    private String title;

    @NotNull(message = "Specify Author ID")
    private Integer authorId;
}
