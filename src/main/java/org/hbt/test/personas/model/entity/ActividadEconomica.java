package org.hbt.test.personas.model.entity;

import com.heinsohn.obl.personas.enums.EstadoActividadEconomicaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "TPER_ACTIVIDAD_ECONOMICA")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActividadEconomica implements Serializable {
    private static final long serialVersionUID = -8264243323035446927L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "TPER_ACTIVIDAD_ECONOMICA_ACTIVIDADECONOMICAID_GENERATOR", sequenceName = "SEC_TPER_ACTIVIDAD_ECONOMICA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_ACTIVIDAD_ECONOMICA_ACTIVIDADECONOMICAID_GENERATOR")
    @Column(name = "ACEID")
    private Long actividadEconomicaId;

    @NotNull
    @Column(name = "ACEDSNOMBREACTIVIDAD")
    private String nombreActividad;

    @NotNull
    @Column(name = "ACECDACTIVIDAD")
    private String codigoActividad;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACEIDSECTORECONOMICO")
    private SectorEconomico sectorEconomico;

    @Column(name = "ACEIDAFP")
    private Long idAfp;

    @Column(name = "ACEDSESTADOACTIVIDADECONOMICA")
    @Enumerated(value = EnumType.STRING)
    private EstadoActividadEconomicaEnum estadoActividadEconomica;



}
