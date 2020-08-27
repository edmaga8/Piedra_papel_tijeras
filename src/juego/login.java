package juego;

import java.io.IOException;

import bbdd.Validation;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class login extends Application {

	String userl =null;
	String passl =null;
	String usert=null;
	String passt= null;

    @FXML
    private TextField cuadro1;

    @FXML
    private TextField cuadro2;

	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
		Scene scene= new Scene(root, 800,600);
		scene.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	
	/*public void cerrar() {
		
		ppt ppy= new ppt();
		
			//Platform.exit();
		asas
	*/
	public void presionado() {
		
		userl=cuadro1.getText();
		passl=cuadro2.getText();
		
		passt= Validation.get_pass(userl);
		if(passt.equals(passl))
			
		{	//Platform.exit();
		//primaryStage.close();
		ventana2 vnt= new ventana2();
		vnt.ventana(userl);
		}
	}
	
	public static void main(String []  args) {
		
		launch(args);
	}
	

}
