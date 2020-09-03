package juego;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class P_inicial extends Application{
    @FXML
    private Text txt1;

    
    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;



	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("P_inicial.fxml"));
		Scene scene= new Scene(root, 800,600);
		scene.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public void usuario_reg() {
		
		Usuarios user= new Usuarios();
		user.registrado();
	}

	public void usuario_nuevo(){
		
	}
	
	public void invitado() {
		
		
	}
	public static void main(String [] args)
	{
		launch(args);
	}
	
}