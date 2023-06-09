package com.mindhub.EjemploClases.repositories;

import com.mindhub.EjemploClases.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FraseRepository extends JpaRepository<Frase, Long> {
}
