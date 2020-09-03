package juego;

import java.io.IOException;

import bbdd.Validation;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Usuarios {
	
	String userl =null;
	String passl =null;
	String usert=null;
	String passt= null;
	
    @FXML
    private Text txt1;
    

    @FXML
    private Button btn1;

    @FXML
    private TextField txt_user;

    @FXML
    private TextField txt_pass;

    
	public void registrado() {
		Stage second = new Stage();
		Parent root;
		
		try {
			root = FXMLLoader.load(getClass().getResource("Usuario_registrado.fxml"));
			Scene scene= new Scene(root, 800,600);
			second.setScene(scene);
			second.setResizable(false);
			second.show();
			//txt4.setVisible(true);
			//txt4.setText("Bienvenido");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void presionado() {
		
		userl=txt_user.getText();
		passl=txt_pass.getText();
		
		passt= Validation.get_pass(userl);
		if(passt.equals(passl) && !passl.isEmpty())
			
		{	//Platform.exit();
		//primaryStage.close();
		ventana2 vnt= new ventana2();
		vnt.ventana(userl);
		}
	}
	
	public void nuevo() {}
	
	public void invitado() {}

}
