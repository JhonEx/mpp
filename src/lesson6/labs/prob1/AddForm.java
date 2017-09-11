package lesson6.labs.prob1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddForm   extends Application{
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Address Form");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.TOP_CENTER);
        	VBox vbox= new VBox();
        	vbox.setAlignment(Pos.TOP_LEFT);
	        Label name = new Label("Name");
	        TextField NameTextField = new TextField();
	        NameTextField.setPrefWidth(150);
		    vbox.getChildren().add(name);
		    vbox.getChildren().add(NameTextField);
	    
		    VBox vbox2= new VBox();
		    vbox.setAlignment(Pos.TOP_LEFT);
	        Label street = new Label("Street");
	        TextField StreetTextField = new TextField();
	        NameTextField.setPrefWidth(150);
	        vbox2.getChildren().add(street);
	        vbox2.getChildren().add(StreetTextField);
	        
	        VBox vbox3= new VBox();
		    vbox.setAlignment(Pos.TOP_LEFT);
	        Label city = new Label("City");
	        TextField CityTextField = new TextField();
	        NameTextField.setPrefWidth(150);
	        vbox3.getChildren().add(city);
	        vbox3.getChildren().add(CityTextField);
	        hBox.getChildren().add(vbox);
	        hBox.getChildren().add(vbox2);
	        hBox.getChildren().add(vbox3);
        
        HBox hBox1 = new HBox(10);
	        hBox1.setAlignment(Pos.CENTER);
	        	VBox vbox4= new VBox();
	        	vbox4.setAlignment(Pos.TOP_LEFT);
		        Label state = new Label("State");
		        TextField StateTextField = new TextField();
		        StateTextField.setPrefWidth(150);
			    vbox4.getChildren().add(state);
			    vbox4.getChildren().add(StateTextField);
		    
			    VBox vbox5= new VBox();
			    vbox4.setAlignment(Pos.TOP_LEFT);
		        Label zip = new Label("Zip");
		        TextField ZipTextField = new TextField();
		        StateTextField.setPrefWidth(150);
		        vbox5.getChildren().add(zip);
		        vbox5.getChildren().add(ZipTextField);
		    hBox1.getChildren().add(vbox4);
		    hBox1.getChildren().add(vbox5);
		
	    Button btnSubmit = new Button("Submit");
			HBox hBox2 = new HBox(10);
			hBox2.setAlignment(Pos.CENTER);
			hBox2.getChildren().add(btnSubmit);

        grid.add(hBox, 0,0);
        grid.add(hBox1, 0, 1);
        grid.add(hBox2, 0, 2);

        
        btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				  String content="";
	        	   content+=NameTextField.getText()+"\r\n"+StreetTextField.getText()+"\r\n"+CityTextField.getText()+", "+StateTextField.getText()+" "+ZipTextField.getText();
	        	   //actiontarget.setFill(Color.FIREBRICK);
	        	  // actiontarget.setText("Sign in button pressed");
	        	   System.out.println(content);}
		});
        
        
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
		
	}

}
