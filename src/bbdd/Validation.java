package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Validation {

	public static String get_pass(String x) {
		String res="";
		 Connection miConexion;
		 try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppt", "root", "");
			
			Statement miStatement = miConexion.createStatement();
			String consulta= "SELECT PASSWORD FROM `registro_jugadores` WHERE nombre_jugador = '" +x+"'";
			ResultSet miResultset=  miStatement.executeQuery(consulta);
			System.out.println(consulta);
			while (miResultset.next()) {
			res= miResultset.getString("Password");
			}
			/*String consulta= "SELECT password FROM registro_jugadores WHERE nombre_jugador = " + x;  // No puedo hacer esto porque debo leer datos
			 miStatement.execute(consulta);
			 */
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR CON LA BBDD!!!");
		}
		
		return res;
	}
}
