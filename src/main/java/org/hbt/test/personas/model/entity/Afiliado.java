package org.hbt.test.personas.model.entity;

import com.heinsohn.obl.general.enums.CanalAtencionEnum;
import com.heinsohn.obl.personas.enums.CausalExentoAfiliadoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * The persistent class for the TPER_AFILIADO database table.
 * 
 */
@Entity
@Table(name = "TPER_AFILIADO")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Afiliado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, name = "TPER_AFILIADO_AFIID_GENERATOR", sequenceName = "SEC_TPER_AFILIADO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_AFILIADO_AFIID_GENERATOR")
	@Column(name = "AFIID")
	private Long afiliadoId;

	@Column(name = "AFIFEFECHAVINCULACIONREGIMEN")
	private LocalDate fechaVinculacionRegimen;

	// uni-directional one-to-one association to Persona
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AFIIDPERSONA")
	private Persona persona;

	@Column(name = "AFIFECREACION")
	private LocalDateTime fechaCreacion;

	@Column(name = "AFICDUSUARIOCREACION")
	private String usuarioCreacion;

	@Column(name = "AFIFEMODIFICACION")
	private LocalDateTime fechaModificacion;

	@Column(name = "AFICDUSUARIOMODIFICA")
	private String usuarioModifica;

	// uni-directional one-to-one association to TipoSegmentoAfiliado
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AFIIDTIPOSEGMENTOAFILIADO")
	private TipoSegmentoAfiliado tipoSegmentoAfiliado;

	@Column(name = "AFIFEEXENCION")
	private LocalDate fechaExencion;

	@Column(name = "AFISNINDIAPLICATODOSAPORTES")
	private Boolean aplicaTodosAportes;

	@Column(name = "AFIDSCAUSALEXENCION")
	@Enumerated(value = EnumType.STRING)
	private CausalExentoAfiliadoEnum causalExentoAfiliadoEnum;

	@Column(name = "AFIDSCANALATENCION")
	@Enumerated(value = EnumType.STRING)
	private CanalAtencionEnum canalAtencionEnum;

	@Column(name = "AFIIDFUNCIONARIOGESTOR")
	private Long idFuncionarioGestor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AFIIDCAMPANAACTUALIZACION")
	private CampanaActualizacion campanaActualizacion;



}