package com.politecnico.usuario.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	Connection  conexion= null;
	 public Connection  conectarbdmysql(){
	        
	        
	     //String url ="jdbc:mysql://127.0.0.1:3306/prueba?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		 String url ="jdbc:mysql://127.0.0.1:3306/prueba?characterEncoding=latin1&useConfigs=maxPerformance";
		
		 try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            conexion = DriverManager.getConnection(url, "root", "root");
	            System.out.println("conectado");
	        }
	        catch(Exception e){
	            System.out.println(e);
	        }
	        return conexion;        
	      
	    }
	 
	 public void cerrarconexion(){
		 try {
			conexion.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	 }
}
