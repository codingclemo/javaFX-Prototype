package gui;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MainMenu {
	MenuBar menuBar;
	
	public MainMenu(Stage stage) {
	    // Main screen -> User Overview
	    MenuItem myProfile = new MenuItem("My Profile");
	    MenuItem StickerExchange = new MenuItem("Sticker Exchange");
	
	    Menu completeMenu = new Menu("COMPLETE");
	    completeMenu.getItems().add(myProfile);
	    completeMenu.getItems().add(StickerExchange);
	
	    
	    
	    myProfile.setOnAction( e -> {
	    	stage.setScene(new RegisterScene(stage).getScene());
	    	System.out.println("Set scene My Profile");
	    });
	    
	    StickerExchange.setOnAction( e -> {
	    	stage.setScene(new UserOverview(stage).getScene());
	    	System.out.println("Set scene Sticker Exchange");
	    });
	    
	    // close the application
//	    exitItem.setOnAction(e -> {
//	    	Platform.exit();
//	        System.exit(0);
//	    });
	
	    menuBar = new MenuBar();
	    menuBar.getMenus().add(completeMenu);
	    menuBar.prefWidthProperty().bind(stage.widthProperty());
	}

	public MenuBar getMenuBar() {
		return menuBar;
	}

}
