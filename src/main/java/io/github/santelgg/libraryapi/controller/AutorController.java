package io.github.santelgg.libraryapi.controller;

import io.github.santelgg.libraryapi.controller.dto.AutorDTO;
import io.github.santelgg.libraryapi.model.Autor;
import io.github.santelgg.libraryapi.service.AutorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/autores")
@AllArgsConstructor
public class AutorController {

    public final AutorService service;

    @PostMapping
    public ResponseEntity salvar(@RequestBody AutorDTO autorDTO) {

        Autor autorEntidade = autorDTO.mapearAutor();
        Autor autorSalvo = service.salvar(autorEntidade);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(autorSalvo.getId())
                .toUri();

        return ResponseEntity.created(uri).body(autorSalvo);
    }
}
