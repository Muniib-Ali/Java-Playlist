package uk.ac.aston.oop.javafx.assessed;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import uk.ac.aston.oop.javafx.assessed.model.Video;

public class CreateController {
	
	@FXML
	private TextField title;
	@FXML
	private TextField director;
	@FXML
	private CheckBox own;
	@FXML
	private Slider slider;
	@FXML
	private TextArea comment;
	
	private boolean confirmed = false;
	
	private Video videoCreated;
	
	@FXML
	public void createPressed() {
		videoCreated = new Video(title.getText(), director.getText(), (int)slider.getValue());
		videoCreated.setComment(comment.getText());
		videoCreated.setOwn(own.isSelected());
		Scene scene = title.getScene();
		Window window = scene.getWindow();
		window.hide();
		confirmed = true;
		
		
		
	}
	
	@FXML
	public void cancelPressed() {
		Scene scene = title.getScene();
		Window window = scene.getWindow();
		confirmed = false;
		window.hide();
		
	}
	
	public Video getCreatedVideo() {
		return videoCreated;
	}
	
	public boolean isConfirmed() {
		return confirmed;
	}
	
	
	
	

}
