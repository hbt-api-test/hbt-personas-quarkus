package org.hbt.test.personas.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "TPER_SECTOR_ECONOMICO")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SectorEconomico implements Serializable {
    private static final long serialVersionUID = -3382484337745989116L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "TPER_SECTOR_ECONOMICO_SECTORECONOMICOID_GENERATOR", sequenceName = "SEC_TPER_SECTOR_ECONOMICO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_SECTOR_ECONOMICO_SECTORECONOMICOID_GENERATOR")
    @Column(name = "SECID")
    private Long sectorEconomicoId;

    @Column(name = "SECDSNOMBRESECTORECO")
    @NotNull
    private String nombreSectorEconomico;// campos para iteracion 15

    @Column(name = "SECCDSECTORECONOMICO")
    @NotNull
    private String codigoSectorEconomico;

    @Column(name = "SECFECREACION")
    private LocalDateTime fechaCreacion;

    @Column(name = "SECCDUSUARIOCREACION")
    private String usuarioCreacion;

    @Column(name = "SECFEMODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "SECCDUSUARIOMODIFICA")
    private String usuarioModifica;

    @Column(name = "SECIDAFP")
    private Long idAfp;

}
