package com.example.placeholdergame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class AdventureGameController {

    private EndingCountValues counter = EndingCountValues.getInstance();
    private GameManager gameManager = GameManager.getInstance();
    @FXML
    private Label errorMessage;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void openMenu(ActionEvent event) throws IOException{
        gameManager.loadScene(event, "/com/example/placeholdergame/menu.fxml");
    }

    @FXML
    public void continueMenu(ActionEvent event) throws IOException{
        boolean effective = gameManager.returnLastScene(event);
        if(!effective){
            showErrorMessage("No Savegame");
        }else{
            hideErrorMessage();
        }
    }

    @FXML
    public void showErrorMessage(String message){
        errorMessage.setText(message);
        errorMessage.setVisible(true);
    }
    @FXML
    public void hideErrorMessage(){
        errorMessage.setVisible(false);
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

    //Nicoletta's Events start here:
    @FXML
    public void N_intro(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_intro.fxml");
        System.out.println(gameManager.getDecisionCount());
    }
    @FXML
    public void N_intro_left(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_intro_left.fxml");
        System.out.println(gameManager.getDecisionCount());
    }
    @FXML
    public void N_intro_middle(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_intro_middle.fxml");
        System.out.println(gameManager.getDecisionCount());
    }
    @FXML
    public void N_intro_right(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_intro_right.fxml");
    }
    @FXML
    public void N_forest(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_forest.fxml");
        System.out.println(gameManager.getDecisionCount());
    }
    @FXML
    public void N_temple(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_temple.fxml");
    }
    @FXML
    public void N_temple_false(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_temple_false.fxml");
    }
    @FXML
    public void N_end(ActionEvent event) throws IOException{
        gameManager.loadScene(event, "/com/example/placeholdergame/N_files/N_end.fxml");
    }
    @FXML
    public void N_end_door(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_end_door.fxml");
    }
    @FXML
    public void N_end_ring(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_end_ring.fxml");
    }
    @FXML
    public void N_end_stone(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_end_stone.fxml");
    }

    //Georg's Events start here:
    @FXML
    public void Introduction_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/georg_files/Introduction_SPACESHIP.fxml");
    }
    @FXML
    public void event1_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/georg_files/Event1_SPACESHIP.fxml");
    }
    @FXML
    public void event1_Option1_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/georg_files/Event1-Option1_SPACESHIP.fxml");
        counter.good++;
    }
    @FXML
    public void event1_Option2_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/georg_files/Event1-Option2_SPACESHIP.fxml");
        counter.bad++;
    }
    @FXML
    public void event1_Option3_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event1-Option3_SPACESHIP.fxml");
        counter.neutral++;
    }
    @FXML
    public void event2_SPACEHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event2_SPACESHIP.fxml");
    }
    @FXML
    public void event2_Option1_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event2-Option1_SPACESHIP.fxml");
        counter.good++;
    }
    @FXML
    public void event2_Option2_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event2-Option2_SPACESHIP.fxml");
        counter.bad++;
    }
    @FXML
    public void event2_Option3_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event2-Option3_SPACESHIP.fxml");
        counter.neutral++;
    }
    @FXML
    public void event3_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event3_SPACESHIP.fxml");
    }
    @FXML
    public void event3_Option1_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event3-Option1_SPACESHIP.fxml");
        counter.good++;
    }
    @FXML
    public void event3_Option2_SPACESHIP(ActionEvent event) throws IOException {
       gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event3-Option2_SPACESHIP.fxml");
       counter.bad++;
    }
    @FXML
    public void event3_Option3_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event3-Option3_SPACESHIP.fxml");
        counter.neutral++;
    }
    @FXML
    public void event4_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event4_SPACESHIP.fxml");
    }
    @FXML
    public void event4_Option1_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event4-Option1_SPACESHIP.fxml");
        counter.good++;
    }
    @FXML
    public void event4_Option2_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event4-Option2_SPACESHIP.fxml");
        counter.bad++;
    }
    public void event4_Option3_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Event4-Option3_SPACESHIP.fxml");
        counter.neutral++;
    }
    @FXML
    public void conclusion_SPACESHIP(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/georg_files/Conclusion_SPACESHIP.fxml");
    }

    //David Story starts here

    public void davidIntro(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/placeholdergame/DavidFXML/DavidIntro.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void davidChoice1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/placeholdergame/DavidFXML/DavidChoice1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void davidChoice1x2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/placeholdergame/DavidFXML/DavidChoice1-2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void davidChoice3x1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/placeholdergame/DavidFXML/DavidChoice3-1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void davidChoice3x2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/placeholdergame/DavidFXML/DavidChoice3-2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void davidChoice3x3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/placeholdergame/DavidFXML/DavidChoice3-3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void davidChoice4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/placeholdergame/DavidFXML/DavidChoice4.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void davidQTE1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/placeholdergame/DavidFXML/DavidQTE1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void davidQTE2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/placeholdergame/DavidFXML/DavidQTE2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void davidQTE3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/placeholdergame/DavidFXML/DavidQTE3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void davidQTE4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/placeholdergame/DavidFXML/DavidQTE4.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void endingGood(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/endings_files/ending_good.fxml");
    }
    public void endingBad(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/endings_files/ending_bad.fxml");
    }
    public void endingNeutral(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/endings_files/ending_neutral.fxml");
    }

    public void selectEnding(ActionEvent event) throws IOException {
        System.out.println("good: " + counter.good + " bad: " + counter.bad + " neutral: " + counter.neutral);
        if (counter.good > counter.bad && counter.good > counter.neutral) {
            endingGood(event);
        } else if (counter.bad > counter.good && counter.bad > counter.neutral) {
            endingBad(event);
        }else{
            endingNeutral(event);
        }

    }


}