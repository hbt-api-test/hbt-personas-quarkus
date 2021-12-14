package org.hbt.test.personas.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * The persistent class for the TPER_CAMPANA_ACTUALIZACION database table.
 * 
 */
@Entity
@Table(name = "TPER_CAMPANA_ACTUALIZACION")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CampanaActualizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, name = "TPER_CAMPANA_ACTUALIZACION_CACID_GENERATOR", sequenceName = "SEC_TPER_CAMPANA_ACTUALIZACION")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_CAMPANA_ACTUALIZACION_CACID_GENERATOR")
	@Column(name = "CACID")
	private Long idCampanaActualizacion;

	@Column(name = "CACDSCAMPANAACTUALIZACION")
	private String descripcionCampanaActualizacion;

	@Column(name = "CACFECREACION")
	private LocalDateTime fechaCreacion;

	@Column(name = "CACCDUSUARIOCREACION")
	private String usuarioCreacion;

	@Column(name = "CACFEMODIFICACION")
	private LocalDateTime fechaModificacion;

	@Column(name = "CACCDUSUARIOMODIFICA")
	private String usuarioModifica;

	@Column(name = "CACIDAFP")
	private Long idAfp;

}