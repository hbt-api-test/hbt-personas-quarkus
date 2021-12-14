package org.hbt.test.personas.model.entity;

import com.heinsohn.obl.personas.enums.CategoriaTipoRolEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TPER_TIPO_ROL")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoRol implements Serializable {

    private static final long serialVersionUID = 933598112062878975L;
    @Id
    @SequenceGenerator(allocationSize=1, name = "TPER_TIPO_ROL_TIPID_GENERATOR", sequenceName = "SEC_TPER_TIPO_ROL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_TIPO_ROL_TIPID_GENERATOR")
    @Column(name = "TRPID")
    private Long idTipoRol;

    @Column(name = "TRPDSNOMBRETIPO")
    private String descripcionNombreTipo;

    @Column(name = "TRPCDUSUARIOCREACION")
    private String codigoUsuarioCreacion;

    @Column(name = "TRPCDUSUARIOMODIFICA")
    private String codigoUsuarioModifica;

    @Column(name = "TRPFECREACION")
    private LocalDateTime fechaCreacion;

    @Column(name = "TRPFEMODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "TRPIDAFP")
    private Long idAfp;

    @Column(name="TRPSNINDICATERCERO")
    private Boolean indicadorTercero;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "TRPDSCATEGORIATIPOROL")
    private CategoriaTipoRolEnum categoriaTipoRolEnum;

    @Column(name = "TRPDSNOMBREASOCTIPOROL")
    private String nombreAsociadoTipoRol;
}
