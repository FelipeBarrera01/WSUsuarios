package com.politecnico.usuario.ws;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.politecnico.usuario.dto.ResponseDepartamento;
import com.politecnico.usuario.dto.ResponseFruta;
import com.politecnico.usuario.dto.ResponseUsuario;

@WebService
public interface IUsuario {
	public ResponseUsuario existeusuario( @WebParam(name="codusuario") String codusuario
										,@WebParam(name="clave") String clave);

	public ResponseUsuario consultausuario( @WebParam(name="codusuario") String codusuario
			,@WebParam(name="clave") String clave);
	
	public List<ResponseDepartamento> consultaDepartamento( @WebParam(name="coddepartamento") String coddepartamento);
	
	public List<ResponseFruta> consultafrutas(@WebParam(name="codfruta") String codfruta);
}
