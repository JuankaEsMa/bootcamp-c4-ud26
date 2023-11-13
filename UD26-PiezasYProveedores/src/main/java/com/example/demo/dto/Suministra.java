package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="suministra")
public class Suministra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
    @JoinColumn(name = "CodigoPieza")
	private int codigo_pieza;
	@ManyToOne
    @JoinColumn(name = "IdProveedor")
	private String codigo_proveedor;
	private int precio;
	public Suministra() {
		
	}
	public Suministra(int id, int codigo_pieza, String codigo_proveedor, int precio) {
		super();
		this.id = id;
		this.codigo_pieza = codigo_pieza;
		this.codigo_proveedor = codigo_proveedor;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigo_pieza() {
		return codigo_pieza;
	}
	public void setCodigo_pieza(int codigo_pieza) {
		this.codigo_pieza = codigo_pieza;
	}
	public String getCodigo_proveedor() {
		return codigo_proveedor;
	}
	public void setCodigo_proveedor(String codigo_proveedor) {
		this.codigo_proveedor = codigo_proveedor;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
