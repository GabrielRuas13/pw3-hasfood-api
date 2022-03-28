package br.com.gabriel.ruas.pw3hasfoodapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_AVALIACAO")

public class Avaliacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_AVALIACAO")
	private Long id;
	 
	@Column(name = "TX_COMENTARIO")
	private String nome;
	
	@Column(name = "TX_NOTA")
	private Integer nota;
	
	@Column(name = "ID_PEDIDO")
	private String pedido;
}
