package com.algaworks.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.algaworks.algamoney.api.model.categoria;
public interface CategoriaRepository extends JpaRepository<categoria, Long> {
}
