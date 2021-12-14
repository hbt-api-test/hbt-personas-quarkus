package org.hbt.test.personas.model.service;

import com.heinsohn.obl.personas.dto.ActualizacionEstadoRolPersonaInDTO;
import com.heinsohn.obl.personas.dto.CreacionPersonaOutDTO;
import com.heinsohn.obl.personas.dto.CrearPersonaInDTO;
import com.heinsohn.obl.personas.dto.PersonaDTO;
import com.heinsohn.obl.utils.common.dto.ResultadoDTO;
//import org.hbt.test.personas.model.entity.DTO.PersonaDTO;
import org.hbt.test.personas.model.entity.Persona;

import javax.ws.rs.NotFoundException;


public interface IPersonaService {

    Persona consultarPersonaPorTipoNumeroIdentificacion(Long idTipoIdentificacion, String numeroIdentificacion);
    CreacionPersonaOutDTO crearPersona(CrearPersonaInDTO crearPersonaInDTO);
    ResultadoDTO actualizarPersona(CrearPersonaInDTO crearPersonaInDTO);
    ResultadoDTO inactivarRolPersona(ActualizacionEstadoRolPersonaInDTO actualizacionEstadoRolPersonaInDTO);
    Boolean validarPersonaYaExiste(Long idTipoIdentificacion, String numeroIdentificacion);
    PersonaDTO consultarPersonaPorId(Long idPersona) throws NotFoundException;

}
