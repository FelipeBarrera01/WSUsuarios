package com.politecnico.usuario.ws;

import java.util.List;

import com.politecnico.usuario.bd.operacionesBD;
import com.politecnico.usuario.dto.RequestUsuario;
import com.politecnico.usuario.dto.ResponseUsuario;
import com.politecnico.usuario.dto.ResponseDepartamento;
import com.politecnico.usuario.dto.ResponseFruta;
import com.politecnico.usuario.dto.RequestDepartamento;
import com.politecnico.usuario.dto.RequestFruta;

public class ImplUsuario  {
	
	operacionesBD obd = new operacionesBD();

	public ResponseUsuario validausuarios(RequestUsuario req){
		return obd.existeusuario(req);	
	}
	
	public ResponseUsuario consultausuarios(RequestUsuario req){
		return obd.obtieneinfusuario(req);
		
	}
	
	public List<ResponseDepartamento> consultadepartamento(RequestDepartamento req){
		return obd.consultadepartamento(req);
	}
	
	public List<ResponseFruta> consultarfrutas(RequestFruta req){
		return obd.consultafrutas(req);
	}

}
