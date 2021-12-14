package org.hbt.test.personas.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TENE_TIPO_IDENTIFICACIONES")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoIdentificacion implements Serializable {
    private static final long serialVersionUID = 1494183131304762347L;
    @Id
    @SequenceGenerator(allocationSize = 1, name = "TENE_TIPO_IDENTIFICACIONES_IDTIPOIDENTIFICACION_GENERATOR", sequenceName = "SEC_TENE_TIPO_IDENTIFICACIONES")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TENE_TIPO_IDENTIFICACIONES_IDTIPOIDENTIFICACION_GENERATOR")
    @Column(name = "TIDID")
    private Long idTipoIdentificacion;

    @Column(name = "TIDCDCODIGO")
    private String codigoTipoIdentificacion;

    @Column(name = "TIDCDCODIGOHOMOLOGACION")
    private String codigoTipoIdentificacionHomologacion;

    @Column(name = "TIDDSDESCRIPCION")
    private String descripcionTipoIdentificacion;

    @Column(name = "TIDDSTIPOPERSONA")
    private String tipoPersonaEnum;

    @Column(name = "TIDCDDIAN")
    private String codigoDian;
}
