package com.example.placeholdergame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        try {

            //change to main screen:
            Parent root = FXMLLoader.load(getClass().getResource("1.1_intro_lexi.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
