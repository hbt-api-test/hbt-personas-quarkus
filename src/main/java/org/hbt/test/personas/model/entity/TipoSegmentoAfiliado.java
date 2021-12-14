package org.hbt.test.personas.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "TPER_TIPO_SEGMENTOAFILIADO")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoSegmentoAfiliado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, name = "TPER_TIPO_SEGMENTOAFILIADO_TSGID_GENERATOR", sequenceName = "SEC_TPER_TIPO_SEGMENTOAFILIADO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_TIPO_SEGMENTOAFILIADO_TSGID_GENERATOR")
	@Column(name = "TSGID")
	private Long idTipoSegmentoAfiliado;

	@Column(name = "TSGDSTIPOSEGMENTO")
	private String descripcionTipoSegmento;

	@Column(name = "TSGFECREACION")
	private LocalDateTime fechaCreacion;

	@Column(name = "TSGCDUSUARIOCREACION")
	private String usuarioCreacion;

	@Column(name = "TSGFEMODIFICACION")
	private LocalDateTime fechaModificacion;

	@Column(name = "TSGCDUSUARIOMODIFICA")
	private String usuarioModifica;

	@Column(name = "TSGCDTIPOSEGMENTOAFILIADO")
	private String codigoTipoSegmento;


}