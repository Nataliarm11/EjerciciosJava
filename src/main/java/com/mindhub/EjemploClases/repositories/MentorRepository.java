package com.mindhub.EjemploClases.repositories;

import com.mindhub.EjemploClases.models.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MentorRepository extends JpaRepository<Mentor, Long> {
}
