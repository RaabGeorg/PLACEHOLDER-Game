package com.example.placeholdergame;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class GameManager {

    private String lastFxmlPath = null; // this variable is important so you can return to the game from the menu
    private static GameManager instance; //Singleton instance

    public static GameManager getInstance(){
        if (instance == null){ //checks if no instance has been created yet
            instance = new GameManager(); //creates a new object
        }
        return instance;
    }

    public void loadScene(ActionEvent event, String fxmlPath) throws IOException{
            System.out.println("loading fxml " + fxmlPath);
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath)); //loads the FXML file
            System.out.println("fxml path succesful");
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); //retrieves the current Stage from the UI element that triggered the event
            Scene scene = new Scene(root); //creates a new Scene using the loaded FXML root
            stage.setScene(scene); //sets the new Scene on the Stage
            stage.setTitle("Feverdream"); //sets the window title
            stage.show(); //displays the window

            System.out.println(fxmlPath);
            if (!fxmlPath.equals("/com/example/placeholdergame/menu.fxml")) { //if the given path is not menu.fxml, store this FXML path in the variable lastFxmlPath
                this.lastFxmlPath = fxmlPath;
            }
    }

    public String getLastFxmlPath(){
        return this.lastFxmlPath;
    }

    public boolean returnLastScene(ActionEvent event) throws IOException{
        if(getLastFxmlPath() != null){ //checks if lastFxmlPath has a value
            loadScene(event, lastFxmlPath); //if yes, load the previously saved scene
            return true;
        }else{
            return false; //if there's no previous path, return false; >> the continueMenu() method will handle the error message
        }
    }

}

