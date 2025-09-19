package io.github.santelgg.libraryapi.service;

import io.github.santelgg.libraryapi.model.Autor;
import io.github.santelgg.libraryapi.repository.AutorRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AutorService {

    private final AutorRepository autorRepository;


    public Autor salvar(Autor autor) {
        return autorRepository.save(autor);
    }

    public Optional<Autor> obterPorId(UUID id){
        return autorRepository.findById(id);
    }
}
