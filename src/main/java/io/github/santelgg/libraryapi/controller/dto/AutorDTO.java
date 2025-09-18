package io.github.santelgg.libraryapi.controller.dto;

import io.github.santelgg.libraryapi.model.Autor;

import java.time.LocalDate;

public record AutorDTO( //DTO = Data Transfer Object
    String nome,
    LocalDate dataNascimento,
    String nacionalidade){

    public Autor mapearAutor(){
        Autor autor = new Autor();
        autor.setNome(this.nome);
        autor.setDataNascimento(this.dataNascimento);
        autor.setNacionalidade(this.nacionalidade);
        return autor;
    }
}
