package com.example.placeholdergame;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class GameManager {

    private String lastFxmlPath = null;
    private static GameManager instance;

    public static GameManager getInstance(){
        if (instance == null){
            instance = new GameManager();
        }
        return instance;
    }

    public void loadScene(ActionEvent event, String fxmlPath) throws IOException{
            System.out.println("loading fxml " + fxmlPath);
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            System.out.println("fxml path succesful");
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Feverdream");
            stage.show();

            if (!fxmlPath.equals("/com/example/placeholdergame/menu.fxml")) {
                this.lastFxmlPath = fxmlPath;
            }
    }

    public String getLastFxmlPath(){
        return this.lastFxmlPath;
    }

    public boolean returnLastScene(ActionEvent event) throws IOException{
        if(getLastFxmlPath() != null){
            loadScene(event, lastFxmlPath);
            return true;
        }else{
            return false;
        }
    }

}

