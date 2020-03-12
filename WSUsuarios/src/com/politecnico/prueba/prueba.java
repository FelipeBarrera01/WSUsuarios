package com.politecnico.prueba;

import com.politecnico.usuario.dto.RequestUsuario;
import com.politecnico.usuario.dto.ResponseUsuario;
import com.politecnico.usuario.ws.ImplUsuario;

public class prueba {
	
	public static void main(String[] args) {
		ResponseUsuario resp = new ResponseUsuario();
		RequestUsuario req = new RequestUsuario();
		ImplUsuario i = new ImplUsuario();
		req.setCodigo_usuario("1198");
		resp = i.validausuarios(req);
		System.out.println(resp.getCodigo_respuesta());
		System.out.println(resp.getDescripcion_respuesta());
	}

}
