package io.github.santelgg.libraryapi.controller;

import io.github.santelgg.libraryapi.controller.dto.AutorDTO;
import io.github.santelgg.libraryapi.model.Autor;
import io.github.santelgg.libraryapi.service.AutorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/autores")
@AllArgsConstructor
public class AutorController {

    public final AutorService service;

    @PostMapping
    public ResponseEntity<Autor> salvar(@RequestBody AutorDTO autorDTO) {

        Autor autorEntidade = autorDTO.mapearAutor();
        Autor autorSalvo = service.salvar(autorEntidade);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(autorSalvo.getId())
                .toUri();

        return ResponseEntity.created(uri).body(autorSalvo);
    }

    @GetMapping("{id}")
    public ResponseEntity<AutorDTO> obterPorId(@PathVariable("id") String id){
        var idAutor = UUID.fromString(id);
        Optional<Autor> autor = service.obterPorId(idAutor);
        if(autor.isPresent()){
            Autor entidade = autor.get();
            AutorDTO dto = new AutorDTO(
                    autor.get().getId(),
                    autor.get().getNome(),
                    autor.get().getDataNascimento(),
                    autor.get().getNacionalidade());
            return ResponseEntity.ok(dto);
        }
        return ResponseEntity.notFound().build();
    }

}
