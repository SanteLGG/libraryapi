package io.github.santelgg.libraryapi.controller.DTO;

import java.time.LocalDate;

public record AutorDTO( //DTO = Data Transfer Object
    String nome,
    LocalDate dataNascimento,
    String nacionalidade){
}
