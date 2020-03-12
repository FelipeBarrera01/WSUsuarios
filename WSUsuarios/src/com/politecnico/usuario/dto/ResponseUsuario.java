package com.politecnico.usuario.dto;

import java.io.Serializable;

public class ResponseUsuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String codigo_respuesta;
	private String descripcion_respuesta;
	private String codigo_usuario;
	private String clave;
	private String descripcion_usuario;
	
	
	public String getCodigo_respuesta() {
		return codigo_respuesta;
	}
	public void setCodigo_respuesta(String codigo_respuesta) {
		this.codigo_respuesta = codigo_respuesta;
	}
	public String getDescripcion_respuesta() {
		return descripcion_respuesta;
	}
	public void setDescripcion_respuesta(String descripcion_respuesta) {
		this.descripcion_respuesta = descripcion_respuesta;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
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
