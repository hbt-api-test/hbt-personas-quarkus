package org.hbt.test.personas.model.service.implement;



import com.heinsohn.obl.personas.dto.ActualizacionEstadoRolPersonaInDTO;
import com.heinsohn.obl.personas.dto.CreacionPersonaOutDTO;
import com.heinsohn.obl.personas.dto.CrearPersonaInDTO;
import com.heinsohn.obl.personas.dto.PersonaDTO;
import com.heinsohn.obl.utils.common.dto.ResultadoDTO;
import com.heinsohn.obl.utils.seguridad.AuthenticatedUser;
import com.heinsohn.obl.utils.seguridad.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.hbt.test.personas.controller.mapper.PersonaMapper;
import org.hbt.test.personas.model.entity.Persona;
import org.hbt.test.personas.model.repository.IPersonaRepository;
import org.hbt.test.personas.model.service.IPersonaService;
//import org.hbt.test.personas.model.entity.DTO.PersonaDTO;


import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.NotFoundException;

@Singleton
@Slf4j
public class PersonaService implements IPersonaService {


    @Inject
    IPersonaRepository repository;


    @Inject
    PersonaMapper mapper;

    @Inject
    @AuthenticatedUser
    private UserDTO userInfo;


    @Override
    public Persona consultarPersonaPorTipoNumeroIdentificacion(Long idTipoIdentificacion, String numeroIdentificacion) {
        return repository.findByTipoIdentificacion_IdTipoIdentificacionAndNumeroIdentificacion(idTipoIdentificacion, numeroIdentificacion);
    }

    @Override
    public CreacionPersonaOutDTO crearPersona(CrearPersonaInDTO crearPersonaInDTO) {
        log.info("Inicio del metodo crearPersona()");

        PersonaDTO personaDTO =crearPersonaInDTO.getPersonaDTO();
        CreacionPersonaOutDTO resultadoDTO = new CreacionPersonaOutDTO();
        resultadoDTO.setExitoso(true);

        Boolean permiteCrearPersonasCore = Boolean.FALSE;
        if(crearPersonaInDTO.getOmitirValidacionParametrizacionRolPersona() != null &&
            crearPersonaInDTO.getOmitirValidacionParametrizacionRolPersona()){
            permiteCrearPersonasCore = Boolean.TRUE;
        }else {
            //ParametrizacionAccionRolPersonaDTO parametrizacionAccionRolPersonaDTO =
        }


        return null;
    }

    @Override
    public ResultadoDTO actualizarPersona(CrearPersonaInDTO crearPersonaInDTO) {
        return null;
    }

    @Override
    public ResultadoDTO inactivarRolPersona(ActualizacionEstadoRolPersonaInDTO actualizacionEstadoRolPersonaInDTO) {
        return null;
    }

    @Override
    public Boolean validarPersonaYaExiste(Long idTipoIdentificacion, String numeroIdentificacion) {
        return null;
    }

    @Override
    public PersonaDTO consultarPersonaPorId(Long idPersona) throws NotFoundException {
        log.info("esta en el metodo consultarPersonaPorId: " + idPersona);
        try {
            Persona persona = repository.findByIdPersona(idPersona);
            return mapper.toPersonaDTO(persona);
        }catch (NotFoundException n){
            String msgError = "Recurso no encontrado: " + n.getLocalizedMessage() + " causa: " + n.getCause();
            log.error(msgError);
            throw new NotFoundException(msgError);
        }
    }
}
