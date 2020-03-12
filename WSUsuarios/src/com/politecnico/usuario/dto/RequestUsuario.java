package com.politecnico.usuario.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RequestUsuario {
	@XmlElement(required = true)
	private String codigo_usuario;
	@XmlElement(required = true)
	private String clave;
	@XmlElement(required = true)
	private String descripcion_usuario;
	
	
	public String getCodigo_usuario() {
		return codigo_usuario;
	}
	public void setCodigo_usuario(String codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getDescripcion_usuario() {
		return descripcion_usuario;
	}
	public void setDescripcion_usuario(String descripcion_usuario) {
		this.descripcion_usuario = descripcion_usuario;
	}
	
	
	
}
