package com.politecnico.usuario.bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.politecnico.usuario.dto.RequestDepartamento;
import com.politecnico.usuario.dto.RequestFruta;
import com.politecnico.usuario.dto.RequestUsuario;
import com.politecnico.usuario.dto.ResponseDepartamento;
import com.politecnico.usuario.dto.ResponseFruta;
import com.politecnico.usuario.dto.ResponseUsuario;


public class operacionesBD extends Conexion{
	ResponseUsuario resp = new ResponseUsuario();
	ResponseDepartamento respdep = new ResponseDepartamento();
	 public ResponseUsuario existeusuario(RequestUsuario req){
		   
		 	String sql = "SELECT * FROM usuarios "
		 			+ " WHERE codigo_usuario ='" + req.getCodigo_usuario() + "'"
		 			+ " AND contrasena = '" + req.getClave() + "'";
	        Statement statement;
	        try {
	            statement = conectarbdmysql().prepareStatement(sql);
	 
	            ResultSet result = statement.executeQuery(sql);
	
	            if (result.next()){
	            	
	            	resp.setCodigo_respuesta("1");
	            	resp.setDescripcion_respuesta("Usuario y/o clave correctas");
	            	
	            }
	            else{
	            	resp.setCodigo_respuesta("0");
	            	resp.setDescripcion_respuesta("Usuario y/o clave incorrectas");
	            	
	            }
	        } catch (SQLException ex) {
	            System.out.println(ex);
	        	resp.setCodigo_respuesta(""+ex.getErrorCode());
            	resp.setDescripcion_respuesta(ex.getMessage());
            
	        }
	        cerrarconexion();
	        return resp;
	    }
	 
	 public ResponseUsuario obtieneinfusuario(RequestUsuario req){
		   
		 	String sql = "SELECT * FROM usuarios "
		 			+ " WHERE codigo_usuario ='" + req.getCodigo_usuario() + "'"
		 			+ " AND contrasena = '" + req.getClave() + "'";
	        Statement statement;
	        try {
	            statement = conectarbdmysql().prepareStatement(sql);
	 
	            ResultSet result = statement.executeQuery(sql);
	
	            if (result.next()){
	            	
	            	resp.setCodigo_respuesta("1");
	            	resp.setDescripcion_respuesta("Consulta Exitosa");
	            	resp.setCodigo_usuario(result.getString("codigo_usuario"));
	            	resp.setClave(result.getString("contrasena"));
	            	resp.setDescripcion_usuario(result.getString("descripcion_usuario"));
	            }
	            else{
	            	resp.setCodigo_respuesta("0");
	            	resp.setDescripcion_respuesta("Consulta no exitosa");
	            	resp.setCodigo_usuario("sin informacion");
	            	resp.setClave("sin informacion");
	            	resp.setDescripcion_usuario("Sin informacion");
	            	
	            }
	        } catch (SQLException ex) {
	            System.out.println(ex);
	        	resp.setCodigo_respuesta(""+ex.getErrorCode());
	        	resp.setDescripcion_respuesta(ex.getMessage());
         
	        }
	        cerrarconexion();
	        return resp;
	    }

	 public List<ResponseDepartamento> consultadepartamento(RequestDepartamento req){
		 	List<ResponseDepartamento> departamento = new ArrayList<ResponseDepartamento>();
		 	String sql = "SELECT * FROM departamentos " ;
		 	if((req.getCodigo_dep()!=null) && (req.getCodigo_dep()!="")  ){
		 		sql= sql +  " WHERE codigo ='" + req.getCodigo_dep() + "'";
		 	}
		 			
		 	System.out.println(sql);
	        Statement statement;
	        try {
	            statement = conectarbdmysql().prepareStatement(sql);
	 
	            ResultSet result = statement.executeQuery(sql);
	
	            while (result.next()){
	            	ResponseDepartamento respdep = new ResponseDepartamento();
	            	respdep.setCodigo_dep(result.getString("codigo"));
	            	respdep.setDescripcion_dep(result.getString("descripcion"));
	            	respdep.setCodigoResp("0");
	            	respdep.setDescripcionResp("Consulta exitosa");
	            	departamento.add(respdep);
	            }
	            
	            	
	            
	        } catch (SQLException ex) {
	            System.out.println(ex);
	            respdep.setCodigoResp(""+ex.getErrorCode());
	            respdep.setDescripcionResp(ex.getMessage());
	            departamento.add(respdep);
      
	        }
	        cerrarconexion();
	        return departamento;
	    }

	 
	 public List<ResponseFruta> consultafrutas(RequestFruta req){
		 	List<ResponseFruta> frutas = new ArrayList<ResponseFruta>();
		 	String sql = "SELECT * FROM frutas " ;
		 	if((req.getCodigo()!=null) && (req.getCodigo()!="")  ){
		 		sql= sql +  " WHERE codigo ='" + req.getCodigo() + "'";
		 	}
		 			
		 	System.out.println(sql);
	        Statement statement;
	        try {
	            statement = conectarbdmysql().prepareStatement(sql);
	 
	            ResultSet result = statement.executeQuery(sql);
	
	            while (result.next()){
	            	ResponseFruta respfruta = new ResponseFruta();
	            	
	            	respfruta.setCodigo(result.getString("codigo"));
	            	respfruta.setDescripcion(result.getString("descripcion"));
	            	respfruta.setCodigoResp("1");
	            	
	            	frutas.add(respfruta);
	            }
	            
	            	
	            
	        } catch (SQLException ex) {
	            System.out.println(ex);
	     
   
	        }
	        cerrarconexion();
	        return frutas;
	    }
}
