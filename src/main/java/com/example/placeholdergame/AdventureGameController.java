package com.example.placeholdergame;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class AdventureGameController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void Introduction_SPACESHIP(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Introduction_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void event1_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event1_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void event1_Option1_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event1-Option1_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event1_Option2_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event1-Option2_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event1_Option3_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event1-Option3_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event2_SPACEHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event2_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event2_Option1_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event2-Option1_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event2_Option2_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event2-Option2_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event2_Option3_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event2-Option3_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event3_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event3_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event3_Option1_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event3-Option1_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event3_Option2_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event3-Option2_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event3_Option3_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event3-Option3_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event4_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event4_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event4_Option1_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event4-Option1_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event4_Option2_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event4-Option2_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void event4_Option3_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event4-Option3_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void conclusion_SPACESHIP(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Conclusion_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}