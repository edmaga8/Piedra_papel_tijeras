package juego;
//prueba
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import bbdd.bbdd;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class ppt extends Application{
    @FXML
    private TextField texto1;
    @FXML
    
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt3;
    

	public static void main(String[] args) {
		
		launch(args);
		//ResetScore();
	}
	
		/*public void Reseteado()
		{
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			texto1.setText("A la espera...");
		}*/

		/*public void ResetScore() {
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
		//texto1.setText("Reseteado");
		
		//texto1.clear();
		//texto1.setText("Waiting...");
		
	
	 }*/
	 
		
	
	// No me cuadra mucho, debe haber un método más eficiente pero lo ha´re así en principio:
	
	public void piedra()
	{
		System.out.println("Pressed!!");
		String res= "";
		String p = null,q,r = null;
		int pc= selecciones.pc_sel();
		// 0 = piedra
		// 1 = papel
		// 2 = tijera
		if(pc==0)
		{
			res= "Empate!";
			bbdd.tie();
			
		}
		else if(pc==1)
		{
			res= "Perdiste!";
			bbdd.computer();
		}
		
		else if(pc==2)
		{
			res ="Ganaste!";
			p= bbdd.player();
			
		}
		
		txt1.setText(p);
		
	}
	
	
	public void papel()
	{
		
		System.out.println("Pressed 2!!");
		String res= "";
		
		String p = null,q,r = null;
		int pc= selecciones.pc_sel();
		// 0 = piedra
		// 1 = papel
		// 2 = tijera
		if(pc==0)
		{
			res ="Ganaste!";
			p= bbdd.player();
			

			
		}
		else if(pc==1)
		{
			res= "Empate!";
			bbdd.tie();
			

		}
		
		else if(pc==2)
		{
			res= "Perdiste!";
			bbdd.computer();

		}
		
		txt1.setText(p);
		
		
		
	}
	
	public void tijeras()
	{
		System.out.println("Pressed 3!!");
		String res= "";
		String p = null,q,r = null;
		
		int pc= selecciones.pc_sel();
		// 0 = piedra
		// 1 = papel
		// 2 = tijera
		if(pc==0)
		{
			res= "Perdiste!";
			bbdd.computer();
			

			

			
		}
		else if(pc==1)
		{
			res ="Ganaste!";
			p= bbdd.player();
			

			

		}
		
		else if(pc==2)
		{
			res= "Empate!";
			bbdd.tie();

		}
		
		txt1.setText(p);
		//txt1.promptTextProperty();
		
	}
	
	

        
	/*private String piedrax() {
	
		String res= "";
		int pc= selecciones.pc_sel();
		// 0 = piedra
		// 1 = papel
		// 2 = tijera
		if(pc==0)
		{
			res= "Empate!";
			bbdd.tie();
			
		}
		else if(pc==1)
		{
			res= "Perdiste!";
			bbdd.computer();
		}
		
		else if(pc==2)
		{
			res ="Ganaste!";
			bbdd.player();
		}
		
		return res;
	}*/
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = (BorderPane)FXMLLoader.load(getClass().getResource("version2.fxml"));
		Scene scene = new Scene(root,600,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		//scene.setFill(Color.RED);
		//Image imagenx = new Image("C:/Users/Ed/eclipse-workspace/ppt_bbdd/src/imgns/arcade.jpg", true);
		//ImageView imv= new ImageView();
		///imv.setImage(imagenx);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}

}
