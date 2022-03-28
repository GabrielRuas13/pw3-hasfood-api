package br.com.gabriel.ruas.pw3hasfoodapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_ENTREGA")

public class Entrega {
	@Id
	@Column(name = "ID_ENTREGA")
	private Long id;
	 
	@Column(name = "TX_NOME_CLIENTE")
	private String nome;
	
	@Column(name = "TX_ENDERECO")
	private String endereco;
	
	@Column(name = "ID_PEDIDO")
	private String pedido;
}
