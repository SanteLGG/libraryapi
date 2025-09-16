package io.github.santelgg.libraryapi.repository;

import io.github.santelgg.libraryapi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
