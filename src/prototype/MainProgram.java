package prototype;

import gui.LoginScene;
import javafx.application.Application;
import javafx.stage.Stage;


public class MainProgram extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception { 
    	
    	primaryStage.setScene(new LoginScene(primaryStage).getScene());
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(400);
        primaryStage.show();
 
    }

    public static void main(String[] args) {
        launch(args);
    }

}
