package org.hbt.test.personas.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="TPER_TIPO_OCUPACION")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoOcupacion implements Serializable {
    private static final long serialVersionUID = -5194491229357126998L;

    @Id
    @SequenceGenerator(allocationSize=1,name="TPER_TIPO_OCUPACION_TONID_GENERATOR", sequenceName="SEC_TPER_TIPO_OCUPACION")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TPER_TIPO_OCUPACION_TONID_GENERATOR")
    @Column(name="TONID")
    private Long idTipoOcupacion;

    @Column(name="TONCDUSUARIOCREACION")
    private String codigoUsuarioCreacion;

    @Column(name="TONCDUSUARIOMODIFICA")
    private String codigoUsuarioModifica;

    @Column(name="TONDSNOMBREOCUPACION")
    private String descripcionNombreOcupacion;

    @Column(name = "TONSNINDOCUPACIONESPECIAL")
    private Boolean indicadorProfesionEspecial;

    @Column(name="TONFECREACION")
    private LocalDateTime fechaCreacion;

    @Column(name="TONFEMODIFICACION")
    private LocalDateTime fechaModificacion;

}
