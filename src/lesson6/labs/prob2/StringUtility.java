package lesson6.labs.prob2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StringUtility extends Application{

	public static void main(String[] args) {
		Application.launch(StringUtility.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		Parent root = FXMLLoader.load(getClass().getResource("StringUtility.fxml"));

        stage.setTitle("String Utility");
        stage.setScene(new Scene(root, 500, 275));
        stage.show();		
	}
	
	
}
