package io.github.santelgg.libraryapi.controller;

import io.github.santelgg.libraryapi.model.Autor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @PostMapping
    public Object salvar(){

    }
}
