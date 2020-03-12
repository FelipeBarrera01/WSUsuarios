package com.politecnico.usuario.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.politecnico.usuario.dto.RequestDepartamento;
import com.politecnico.usuario.dto.RequestFruta;
import com.politecnico.usuario.dto.RequestUsuario;
import com.politecnico.usuario.dto.ResponseDepartamento;
import com.politecnico.usuario.dto.ResponseFruta;
import com.politecnico.usuario.dto.ResponseUsuario;

@WebService(serviceName="ServicioUsuario")
@SOAPBinding( style=SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL, parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)

public class UsuarioService implements IUsuario{

	ImplUsuario  impusuario = new ImplUsuario();
	RequestUsuario req = new RequestUsuario();
	RequestDepartamento reqdep = new RequestDepartamento();
	RequestFruta reqfruta = new RequestFruta();
	@WebMethod(operationName="existeusuario" , action="existeusuarioAction")
	@WebResult( name="existeusuarioResponse")
	public ResponseUsuario existeusuario(@WebParam(name="codusuario") String codusuario,
										@WebParam(name="clave") String clave) {
		 req.setCodigo_usuario(codusuario);
		 req.setClave(clave);
		 return impusuario.validausuarios(req);

	}
	@WebMethod(operationName="consultausuario" , action="consultausuarioAction")
	@WebResult( name="consultausuarioResponse")
	public ResponseUsuario consultausuario(@WebParam(name="codusuario") String codusuario,
			@WebParam(name="clave") String clave) {
	
		 req.setCodigo_usuario(codusuario);
		 req.setClave(clave);
		 return impusuario.consultausuarios(req);
	}
	@WebMethod(operationName="consultadepartamento" , action="consultadepartamentoAction")
	@WebResult( name="consultadepartamentoResponse")
	public List<ResponseDepartamento> consultaDepartamento(@WebParam(name="coddepartamento") String coddepartamento) {
		// TODO Auto-generated method stub
		reqdep.setCodigo_dep(coddepartamento);
		return impusuario.consultadepartamento(reqdep);
	}
	@WebMethod(operationName="consultafruta" , action="consultafrutaAction")
	@WebResult( name="consultafrutaResponse")
	public List<ResponseFruta> consultafrutas(@WebParam(name="codfruta") String codfruta) {
		// TODO Auto-generated method stub
		reqfruta.setCodigo(codfruta);
		return impusuario.consultarfrutas(reqfruta);
	}
	
	
	

}
