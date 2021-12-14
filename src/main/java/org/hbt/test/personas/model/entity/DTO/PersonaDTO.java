package org.hbt.test.personas.model.entity.DTO;

import com.heinsohn.obl.personas.enums.EstadoPersonaEnum;
import com.heinsohn.obl.personas.enums.TipoPersonaEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDTO {
    private Long idPersona;
    private Long idTipoIdentificacion;
    private String codigoTipoIdentificacion;
    private String numeroIdentificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String razonSocial;
    private String nombreCompleto;
    private Integer digitoVerificacion;
    private TipoPersonaEnum tipoPersona;
    private String siglaComercial;
    private EstadoPersonaEnum estadoPersona;
    private String sexo;
    private String descripcionNivelSeguridad;
}
