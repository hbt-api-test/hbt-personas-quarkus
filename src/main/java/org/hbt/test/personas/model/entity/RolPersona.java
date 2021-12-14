package org.hbt.test.personas.model.entity;

import com.heinsohn.obl.personas.enums.EstadoRolPersonaEnum;
import com.heinsohn.obl.personas.enums.TipoPagoVentanillaEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TPER_ROL_PERSONA")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolPersona implements Serializable {

    private static final long serialVersionUID = -5023052947369338283L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "TPER_ROL_PERSONA_RTEID_GENERATOR", sequenceName = "SEC_TPER_ROL_PERSONA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_ROL_PERSONA_RTEID_GENERATOR")
    @Column(name = "TRSID")
    private Long idRolPersona;

    // uni-directional many-to-one association to Persona
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRSIDPERSONA")
    private Persona persona;

    // uni-directional many-to-one association to TipoPersona
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRSIDTIPOROLPERSONA")
    private TipoRol tipoRol;

    @Column(name = "TRSDSESTADOROLPERSONA")
    @Enumerated(value = EnumType.STRING)
    private EstadoRolPersonaEnum estadoRolPersonaEnum;

    @Column(name = "TRSFECREACION")
    private LocalDateTime fechaCreacion;

    @Column(name = "TRSCDUSUARIOCREACION")
    private String usuarioCreacion;

    @Column(name = "TRSFEMODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "TRSCDUSUARIOMODIFICA")
    private String usuarioModifica;

    @Column(name = "TRSIDAFP")
    private Long idAfp;

    @Column(name = "TRSCDENTIDADEXTERNA")
    private String codigoEntidadExterna;

    @Column(name = "TRSIDCAUSALINACTIVACIONROL")
    private Long idTipoCausalInactivacionRol;

    /**
     * Atributo que determina el id causal de eliminación, se almacena en el histórico.
     */
    @Column(name = "TRSIDCAUSALELIMINACION")
    private Long idCausalEliminacionRol;

    @Column(name = "TRSSNINDEXCLUAPORTREFOTRIB2017")
    private Boolean excluirAportesReformaTributaria2017;

    /**
     * Atributo que determina la referencia del proceso que creó el rol
     */
    @Column(name = "TRSCDREFERENCIA")
    private String referencia;

    @Column(name="TRSDSTIPOPAGOVENTANILLA")
    @Enumerated(value = EnumType.STRING)
    private TipoPagoVentanillaEnum tipoPagoVentanilla;

    @Version
    @Column(name = "TRSNMVERSION")
    private Long version = 0l;
}
