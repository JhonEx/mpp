package lesson6.labs.prob2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
	@FXML private Button countLetters;
	@FXML private Button reverseLetters;
	@FXML private Button removeDuplicates;
	@FXML private TextField inputText;
	@FXML private TextField outputText;
	    
	@FXML protected void handleCountLettersAction(ActionEvent event) {
		String input = inputText.getText();
		outputText.setText(input.length() + "");
	}

	@FXML protected void handleReverseLettersAction(ActionEvent event) {
		String input = inputText.getText();
		outputText.setText(reverse(input));
	}

	@FXML protected void handleRemoveDuplicatesAction(ActionEvent event) {
		String input = inputText.getText();
		outputText.setText(removeDuplicate(input));
	}
	
	private String reverse(String input){
		StringBuilder output = new StringBuilder();
		int length = input.length();
		for(int i = length - 1; i >= 0; i--){
			output.append(input.charAt(i));
		}
		return output.toString();
	}
	
	private String removeDuplicate(String input) {
		Map<String, String> charMap = new HashMap<String, String>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < input.length(); i++){
			if(!charMap.containsKey(input.charAt(i) + "")){
				sb.append(input.charAt(i));
			}
			charMap.put(input.charAt(i) + "", input.charAt(i) + "");
			
			
		}
		return sb.toString();
	}
}
