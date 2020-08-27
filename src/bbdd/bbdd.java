package bbdd;

import java.sql.*;

public class bbdd {

	public bbdd() {
		// TODO Auto-generated constructor stub
	}
	
	 static protected void consulta() {
		 try {
				Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_prostibulo", "root", "");
			 //https://shared12.hostgator.cl:2083/
			 	//Connection miConexion = DriverManager.getConnection("jdbc:mysql://www.sistemaseva.com:3306/siste122_gestion_prostibulo", "siste122", "0;Owb5sGD2-5hH");
			 	
			 	Statement miStatement = miConexion.createStatement();
				ResultSet miResultset = miStatement.executeQuery("SELECT * FROM trabajadoras");
			
				while( miResultset.next())
				{
					System.out.println(miResultset.getString("id_trabajadora")+ " "+ miResultset.getString("nombre")+ " ");
				}
			} catch (SQLException e) {
				System.out.println("Error 1");
			}
	 }
	 //era un void pero quiero devolver un String
	 
	 public static String player() {
		 Connection miConexion;
		 String y = null;
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppt", "root", "");
			Statement miStatement = miConexion.createStatement();
			String consulta= "UPDATE resultados SET Player= Player+1";
			 miStatement.execute(consulta);
			 
			 //Para obtener el puntaje del jugador:
			 
			Statement miStatement2 = miConexion.createStatement();
			ResultSet miResultset = miStatement2.executeQuery("SELECT player FROM resultados");
			while (miResultset.next()) {
			y= miResultset.getString("player");
			}
			//System.out.println(x);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error Set Player!");
		}
		return y;
	 }
	 //
	 public static void computer() {
		 Connection miConexion;
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppt", "root", "");
			Statement miStatement = miConexion.createStatement();
			String consulta= "UPDATE resultados SET Computer= Computer+1";
			 miStatement.execute(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error Set Computer!");
		}
	
	 }
	 
	  public static void tie() {
		 Connection miConexion;
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppt", "root", "");
			Statement miStatement = miConexion.createStatement();
			String consulta= "UPDATE resultados SET Tie= Tie+1";
			 miStatement.execute(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error Set Computer!");
		}
	
	 }
	 
	 public static void ResetScore() {
		 Connection miConexion;
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppt", "root", "");
			Statement miStatement = miConexion.createStatement();
			String consulta= "UPDATE resultados SET Player=0, Computer=0, Tie=0 ";
			 miStatement.execute(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error Set Computer!");
		}
	
	 }
	 
	 


}
