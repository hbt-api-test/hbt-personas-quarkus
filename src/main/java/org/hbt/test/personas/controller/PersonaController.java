package org.hbt.test.personas.controller;


import com.heinsohn.obl.personas.dto.PersonaDTO;
import lombok.extern.slf4j.Slf4j;
import org.hbt.test.personas.controller.mapper.PersonaMapper;
//import org.hbt.test.personas.model.entity.DTO.PersonaDTO;
import org.hbt.test.personas.model.entity.Persona;
import org.hbt.test.personas.model.entity.QueryPersona;
import org.hbt.test.personas.model.service.IPersonaService;
import org.hbt.test.personas.model.service.IUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.ws.rs.NotFoundException;


@RestController
@RequestMapping("/ConsultasPersonasBean")
@Slf4j
public class PersonaController {

    @Inject
    IPersonaService service;

    @Autowired
    PersonaMapper mapper;

    @Inject
    IUtils utils;

    @GetMapping(value = "/consultarPersonaPorTipoNumeroIdentificacion",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonaDTO consultarPersonaPorTipoNumeroIdentificacion(
            @RequestBody QueryPersona persona
            ){
        log.info("Inicio del procesamiento de la API de personas, metodo consultarPersonaPorTipoNumeroIdentificacion");
        Persona personas = service.consultarPersonaPorTipoNumeroIdentificacion(persona.getIdTipoIdentificacion(), persona.getNumeroIdentificacion());
        return mapper.toPersonaDTO(personas);
    }

    @GetMapping(value = "/consultarPersonaPorId/{idPersona}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonaDTO consultarPersonaPorId(@PathVariable Long idPersona) throws NotFoundException {
        log.info("Inicio de busqueda de persona consultando por Id");
        return service.consultarPersonaPorId(idPersona);
    }





}
