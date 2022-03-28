package br.com.gabriel.ruas.pw3hasfoodapi.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_PEDIDO")

public class Pedido {
	@Id
	@Column(name = "ID_PEDIDO")
	private Long id;
	
	@Column(name = "DT_PEDIDO")
	private LocalDate data;
	
	@Column(name = "TX_STATUS")
	private String status;
	
	@Column(name = "ID_RESTAURANTE")
	private Integer restaurante;
}
