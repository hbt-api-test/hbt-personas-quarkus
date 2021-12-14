package org.hbt.test.personas.controller.mapper;



//import org.hbt.test.personas.model.entity.DTO.PersonaDTO;
import com.heinsohn.obl.personas.dto.PersonaDTO;
import org.hbt.test.personas.model.entity.Persona;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface PersonaMapper {
    @Mapping(target = "idPersona", source = "idPersona")
    @Mapping(target = "idTipoIdentificacion", source = "tipoIdentificacion.idTipoIdentificacion")
    @Mapping(target = "numeroIdentificacion", source = "numeroIdentificacion")
    @Mapping(target = "codigoTipoIdentificacion", source = "tipoIdentificacion.codigoTipoIdentificacion")
    @Mapping(target = "primerNombre", source = "primerNombre")
    @Mapping(target = "segundoNombre", source = "segundoNombre")
    @Mapping(target = "primerApellido", source = "primerApellido")
    @Mapping(target = "segundoApellido", source = "segundoApellido")
    @Mapping(target = "razonSocial", source = "razonSocial")
    @Mapping(target = "tipoPersona", source = "tipoPersonaEnum")
    @Mapping(target = "descripcionNivelSeguridad", source = "nivelSeguridad.descripcionNivelSeguridad")
    @Mapping(target = "digitoVerificacion", source = "digitoVerificacion")
    @Mapping(target = "estadoPersona", source = "estadoPersonaEnum")
    @Mapping(target = "nombreCompleto", expression = "java(persona.getPrimerNombre() + \" \" + persona.getSegundoNombre() + \" \" + persona.getPrimerApellido() + \" \" + persona.getSegundoApellido())")
    @Mapping(target = "sexo", source = "sexo")
    @Mapping(target = "siglaComercial", source = "siglaComercial")
    //@Mapping(target = "")
    PersonaDTO toPersonaDTO(Persona persona);
}
