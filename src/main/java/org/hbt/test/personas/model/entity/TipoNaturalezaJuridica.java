package org.hbt.test.personas.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TPER_TIPO_NATURJURIDICA")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoNaturalezaJuridica implements Serializable {
    private static final long serialVersionUID = -5902219645437849670L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "TPER_TIPO_NATURJURIDICA_IDTIPONATURALEZAJURIDICA_GENERATOR", sequenceName = "SEC_TPER_TIPO_NATURJURIDICA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_TIPO_NATURJURIDICA_IDTIPONATURALEZAJURIDICA_GENERATOR")
    @Column(name = "TNJID")
    private Long idTipoNaturalezaJuridica;

    @Column(name = "TNJFECREACION")
    private LocalDateTime fechaCreacion;

    @Column(name = "TNJCDUSUARIOCREACION")
    private String codigoUsuarioCreacion;

    @Column(name = "TNJCDUSUARIOMODIFICA")
    private String codigoUsuarioModifica;

    @Column(name = "TNJIDAFP")
    private Long idAfp;

    @Column(name = "TNJDSNOMBRENATURALEZAJURIDICA")
    private String nombreNaturalezaJuridica;

    @Column(name = "TNJFEMODIFICACION")
    private LocalDateTime fechaModificacion;

}
