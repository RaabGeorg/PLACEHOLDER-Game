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
    }
  
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