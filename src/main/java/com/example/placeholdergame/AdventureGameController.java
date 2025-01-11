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

    //Lexi's Events start here:
    public void lexiEvent1OptionBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("1.1.2_going_back_lexi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void lexiEvent1OptionLeft(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("1.1.2_going_left_lexi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void lexiEvent1OptionRight(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("1.1.2_going_right_lexi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void lexiEvent2OptionRun(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("2.1_run_and_die_lexi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void lexiEvent2OptionHide(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("2.2_hide_lexi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void lexiEvent2OptionStay(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("2.3_stay_lexi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void lexiEvent3OptionWin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("3.1_level_complete_lexi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void lexiEvent3OptionAttack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("3.2_attack_and_die_lexi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void lexiEvent3OptionBreakFree(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("3.3_break_free_and_die_lexi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Georg's Events start here:
    public void georgEvent1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Event1_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void georgEvent1_Option1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Event1-Option1_SPACESHIP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}