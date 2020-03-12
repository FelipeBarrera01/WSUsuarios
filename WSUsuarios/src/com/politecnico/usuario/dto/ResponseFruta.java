package com.politecnico.usuario.dto;

import java.io.Serializable;

public class ResponseFruta implements Serializable{
	private String codigo;
	private String descripcion;
	private String codigoResp;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigoResp() {
		return codigoResp;
	}
	public void setCodigoResp(String codigoResp) {
		this.codigoResp = codigoResp;
	}
	
}
