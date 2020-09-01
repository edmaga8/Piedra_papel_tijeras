package juego;
import java.io.FileInputStream;
import java.io.IOException;
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
import javafx.scene.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;


public class ventana2 {

	private TextField texto1;
	@FXML

	private TextField txt1;

	@FXML
	private TextField txt2;

	@FXML
	private TextField txt3;
	
	@FXML
	private TextField txt4;
	
	
	public void ventana(String x) {
		Stage second = new Stage();
		Parent root;
		
		try {
			root = FXMLLoader.load(getClass().getResource("game.fxml"));
			Scene scene= new Scene(root, 800,600);
			//txt2.setText("Bienvenido, " + x);
			second.setScene(scene);
			second.setResizable(false);
			second.show();
			//txt4.setVisible(true);
			//txt4.setText("Bienvenido");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		// Este evento se utilizará para pasar de una venta a otra.
			
		
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
		
	
		
		
}
