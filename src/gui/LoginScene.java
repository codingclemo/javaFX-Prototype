package gui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginScene {
	private Scene scene;
	
	public LoginScene(Stage stage) {
		VBox rootPane = new VBox();
		scene = new Scene(rootPane);
		MenuBar menuBar = new MainMenu(stage).getMenuBar();
		((VBox) scene.getRoot()).getChildren().addAll(menuBar);
		
		rootPane.setBackground( new Background( new BackgroundFill(Color.CORNSILK, null, null)));
		
		Button button = new Button("Go to UserOverview");
		button.setOnAction(e -> {
			stage.setScene( new UserOverview(stage).getScene());
		});
		
		Button button2 = new Button("Go to Register");
		button2.setOnAction(e -> {
			stage.setScene( new RegisterScene(stage).getScene());
		});
		
		rootPane.getChildren().add(new Text("This is the Login stuff"));
		rootPane.getChildren().add(button);
		rootPane.getChildren().add(button2);
	}
	
	public Scene getScene() {
		return scene;
	}
}
