package org.hbt.test.personas.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TPER_TIPO_ESTADO_CIVIL")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoEstadoCivil implements Serializable {

    private static final long serialVersionUID = -1640590765869024344L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "TPER_TIPO_ESTADO_CIVIL_TECID_GENERATOR", sequenceName = "SEC_TPER_TIPO_ESTADO_CIVIL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_TIPO_ESTADO_CIVIL_TECID_GENERATOR")
    @Column(name = "TECID")
    private Long idTipoEstadoCivil;

    @Column(name = "TECCDUSUARIOCREACION")
    private String codigoUsuarioCreacion;

    @Column(name = "TECCDUSUARIOMODIFICA")
    private String codigoUsuarioModifica;

    @Column(name = "TECDSNOMBREESTADOCIVIL")
    private String descripcionNombreEstadoCivil;

    @Column(name = "TECFECREACION")
    private LocalDateTime fechaCreacion;

    @Column(name = "TECFEMODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "TECIDAFP")
    private Long idAfp;}
