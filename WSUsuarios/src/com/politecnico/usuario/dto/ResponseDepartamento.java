package com.politecnico.usuario.dto;

import java.io.Serializable;

public class ResponseDepartamento implements Serializable {

	private static final long serialVersionUID = 1L;
	private String codigo_dep;
	private String descripcion_dep;
	private String codigoResp;
	private String descripcionResp;
	public String getCodigo_dep() {
		return codigo_dep;
	}
	public void setCodigo_dep(String codigo_dep) {
		this.codigo_dep = codigo_dep;
	}
	public String getDescripcion_dep() {
		return descripcion_dep;
	}
	public void setDescripcion_dep(String descripcion_dep) {
		this.descripcion_dep = descripcion_dep;
	}
	public String getCodigoResp() {
		return codigoResp;
	}
	public void setCodigoResp(String codigoResp) {
		this.codigoResp = codigoResp;
	}
	public String getDescripcionResp() {
		return descripcionResp;
	}
	public void setDescripcionResp(String descripcionResp) {
		this.descripcionResp = descripcionResp;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
