package pruebas;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

import bbdd.bbdd;

//import bbdd.bbdd;

public class pruebas extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bbdd.player();
		launch(args);
	}
	
	
public void press_player() {
	
	bbdd.player();
}

public void press_computer() {

	bbdd.computer();
}

public void press_tie() {
	
	bbdd.tie();
}

public void reset() {
	
	bbdd.ResetScore();
}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Parent root = (BorderPane)FXMLLoader.load(getClass().getResource("pruebas.fxml"));
		//setRoot();
	//Image fondo = new Image("C://Users//Ed//eclipse-workspace//ppt_bbdd//src//imgns//arcade.jpg");
		Scene scene = new Scene(root,600,400);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
	
		//scene.setFill(Color.RED);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}

}
