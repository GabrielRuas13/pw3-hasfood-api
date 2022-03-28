package br.com.gabriel.ruas.pw3hasfoodapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_PEDIDO")

public class Pedido {
	@Id
	private Long id;
	private Data data;
	private String status;
	private String restaurante;
}
