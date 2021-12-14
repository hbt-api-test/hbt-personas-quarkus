package org.hbt.test.personas.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryPersona {

    private Long idTipoIdentificacion;
    private String numeroIdentificacion;

}
