package io.github.santelgg.libraryapi.service;

import io.github.santelgg.libraryapi.model.Autor;
import io.github.santelgg.libraryapi.repository.AutorRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AutorService {

    private final AutorRepository autorRepository;


    public Autor salvar(Autor autor) {
        return autorRepository.save(autor);
    }
}
