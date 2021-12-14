package org.hbt.test.personas.model.entity;

import com.heinsohn.obl.personas.enums.EstadoPersonaEnum;
import com.heinsohn.obl.personas.enums.IndicadorCreacionPersonaEnum;
import com.heinsohn.obl.personas.enums.OrigenAsignacionNivelSeguridadEnum;
import com.heinsohn.obl.personas.enums.TipoPersonaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Table(name = "TPER_PERSONA")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Persona implements Serializable {
    private static final long serialVersionUID = -4983063846819891899L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "TPER_PERSONA_ID_GENERATOR", sequenceName = "SEC_TPER_PERSONA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_PERSONA_ID_GENERATOR")
    @Column(name = "PERID")
    private Long idPersona;

    @Column(name = "PERCDNUMEROIDENTIFICACION")
    private String numeroIdentificacion;

    /**
     * Atributo que determina el dígito de verificación
     */
    @Column(name = "PERNMDIGITOVERIFICACION")
    private Integer digitoVerificacion;

    /**
     * Atributo que determina el primer nombre
     */
    @Column(name = "PERDSPRIMERNOMBRE")
    private String primerNombre;

    /**
     * Atributo que determina el segundo nombre
     */
    @Column(name = "PERDSSEGUNDONOMBRE")
    private String segundoNombre;

    /**
     * Atributo que determina el primer apellido
     */
    @Column(name = "PERDSPRIMERAPELLIDO")
    private String primerApellido;

    /**
     * Atributo que determina el segundo apellido
     */
    @Column(name = "PERDSSEGUNDOAPELLIDO")
    private String segundoApellido;


    /*@Column(name = "PERIDTIPOIDENTIFICACION")
    private Long idTipoIdentificacion;*/


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERIDTIPOIDENTIFICACION")
    private TipoIdentificacion tipoIdentificacion;

    /**
     * Atributo que determina la fecha de condición
     */
    @Column(name = "PERFEFECHACONDICION")
    private LocalDate fechaCondicion;


    @Column(name = "PERDSRAZONSOCIAL")
    private String razonSocial;


    @Column(name = "PERDSSIGLACOMERCIAL")
    private String siglaComercial;


    @Column(name = "PERFEFECHACONSTITUCIONJURIDICA")
    private LocalDate fechaConstitucionJuridica;

    @Column(name = "PERSNINDLISTAESPECIAL")
    private Boolean indicadorPersonaListaEspecial;


    @Enumerated(value = EnumType.STRING)
    @Column(name = "PERDSINDICADORMODIFICACION")
    private IndicadorCreacionPersonaEnum indicadorModificacionEnum;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "PERDSTIPOPERSONA")
    private TipoPersonaEnum tipoPersonaEnum;


    @Column(name = "PERFECONDICIONPERJURIDICA")
    private LocalDate fechaCondicionPersonaJuridica;


    @Enumerated(value = EnumType.STRING)
    @Column(name = "PERDSESTADOPERSONA")
    private EstadoPersonaEnum estadoPersonaEnum;


    @Column(name = "PERFEEXPEDICIONIDENTIFICA")
    private LocalDate fechaExpedicionIdentificacion;

    @Column(name = "PERFENACIMIENTO")
    private LocalDate fechaNacimiento;


    @Column(name = "PERFEFALLECIMIENTO")
    private LocalDate fechaFallecimiento;

    @Column(name = "PERFEVENCIMIENTOIDENTIFICACION")
    private LocalDate fechaVencimientoIdentificacion;

    @Column(name = "PERCDNUMEROCERTIFICADEFUNCION")
    private String numeroCertificadoDefuncion;

    @Column(name = "PERFECREACION")
    private LocalDateTime fechaCreacion;

    @Column(name = "PERCDUSUARIOCREACION")
    private String usuarioCreacion;

    @Column(name = "PERFEMODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "PERCDUSUARIOMODIFICA")
    private String usuarioModifica;

    @Column(name = "PERSNINDINFORMECOINCINOMBRE")
    private Boolean indicadorInformNombre;

    @Column(name = "PERSNINDICADORDECLARANTERENTA")
    private Boolean indicadorDeclaranteRenta;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERIDTIPOOCUPACION")
    private TipoOcupacion tipoOcupacion;

    @Column(name = "PERDSSEXO")
    private String sexo;

    @Column(name = "PERIDCIUDADEXPEDIIDENTIFICA")
    private Integer idCiudadExpedicion;

    @Column(name = "PERIDCIUDADNACIMIENTO")
    private Integer idCiudadNacimiento;

    @Column(name = "PERSNINDICARESIDENTE")
    private Integer residente;

    @Column(name = "PERCDNIT")
    private String nit;

    @Column(name = "PERIDCONDICIONPERSONANAT")
    private Integer condicionPersonaNatural;

    @Column(name = "PERIDCONDICIONPERSONAJUR")
    private Integer condicionPersonaJuridica;

    @Version
    @Column(name = "PERNMVERSION")
    private Long version = 0l;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERIDTIESTADOCIVIL")
    private TipoEstadoCivil tipoEstadoCivil;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERIDACTIVIDADECONOMICA")
    private ActividadEconomica actividadEconomica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERIDTIPONATURALEZAJURICA")
    private TipoNaturalezaJuridica tipoNaturalezaJuridica;

    @Column(name = "PERSNINDEXENTOCOBRORETEFUENTE")
    private Integer exentoCobroRetencionFuente;

    @Column(name = "PERSNINDICAEXCENTOCOBROGMF")
    private Integer exentoCobroGMF;

    @Column(name = "PERSNINDMANEJADIASCANJEFONDO")
    private Integer manejaDiasCanjeFondo;

    @Column(name = "PERNMCANTIDADDIASCANJE")
    private Integer cantidadDiasCanje;

    @Column(name = "PERIDTIPOINVERSIONISTA")
    private Integer perTipoInversionista;

    @Column(name = "PERSNPERMODIFTIPOPARTICIPAUTOM")
    private Integer permiteModificarTipoParticipaAuto;

    @Column(name = "PERDSTIPOSUJETOPASIVORETENCION")
    private String tipoPasivoRetencion;

    @Column(name = "PERIDNACIONALIDAD")
    private Long idTipoNacionalidad;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "PERDSINDICADORCREACION")
    private IndicadorCreacionPersonaEnum indicadorCreacion;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERIDPARAMNIVELSEGURIDAD")
    private ParametrizacionNivelSeguridad nivelSeguridad;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "PERDSORIGENASIGNANIVELSEGURI")
    private OrigenAsignacionNivelSeguridadEnum origenAsignacionNivelSeguridad;

/*    @OneToMany(mappedBy = "persona")
    private Set<RolPersona> rolesPersona;*/

}
