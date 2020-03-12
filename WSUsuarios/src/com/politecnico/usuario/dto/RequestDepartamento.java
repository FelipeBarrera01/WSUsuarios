package com.politecnico.usuario.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RequestDepartamento {
	@XmlElement(required = true)
	private String codigo_dep;
	@XmlElement(required = true)
	private String descripcion_dep;
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
	
}
