package org.hbt.test.personas.model.repository;


import org.hbt.test.personas.model.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.inject.Singleton;

@Singleton
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    Persona findByIdPersona(Long  idPersona);
    Persona findByTipoIdentificacion_IdTipoIdentificacionAndNumeroIdentificacion(Long idTipoIdentificacion, String numeroIdentificacion);
}
