package org.hbt.test.personas.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TPER_PARAM_NIVELESEGURIDAD")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParametrizacionNivelSeguridad implements Serializable {
    private static final long serialVersionUID = 5308112012852371639L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "TPER_PARAM_NIVELESEGURIDAD_TNSID_GENERATOR", sequenceName = "SEC_TPER_PARAM_NIVELESEGURIDAD")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_PARAM_NIVELESEGURIDAD_TNSID_GENERATOR")
    @Column(name = "TNSID")
    private Long idParametrizacionNivelSeguridad;

    @Column(name = "TNSCDNIVELSEGURIDAD")
    private String codigoNivelSeguridad;

    @Column(name="TNSDSNIVELSEGURIDAD")
    private String descripcionNivelSeguridad;

    @Column(name = "TNSFECREACION")
    private LocalDateTime fechaCreacion;

    @Column(name = "TNSCDUSUARIOCREACION")
    private String usuarioCreacion;

    @Column(name = "TNSFEMODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "TNSCDUSUARIOMODIFICA")
    private String usuarioModifica;

    @Column(name = "TNSIDAFP")
    private Long idAfp;

}
