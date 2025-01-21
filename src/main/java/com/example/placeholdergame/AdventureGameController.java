package com.example.placeholdergame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.IOException;
import javafx.scene.text.Text;

public class AdventureGameController {

    private EndingCountValues counter = EndingCountValues.getInstance();
    private GameManager gameManager = GameManager.getInstance(); //uses a singleton instance of GameManager
    @FXML
    private Label errorMessage; //this label is defined in menu.fxml and is used to display an error message

    @FXML
    public void openMenu(ActionEvent event) throws IOException{
        gameManager.loadScene(event, "/com/example/placeholdergame/menu.fxml"); //loads menu.fxml
    }

    @FXML
    public void continueMenu(ActionEvent event) throws IOException{
        boolean effective = gameManager.returnLastScene(event); //tries to load the last scene saved in GameManager
        if(!effective){ //if no scene was saved
            showErrorMessage("No Savegame"); //show this error message
        }else{
            hideErrorMessage(); //otherwise, hide the error message
        }
    }

    @FXML
    public void showErrorMessage(String message){ //sets the text of the error message Label and makes it visible
        errorMessage.setText(message);
        errorMessage.setVisible(true);
    }
    @FXML
    public void hideErrorMessage(){ //hides the error message Label
        errorMessage.setVisible(false);
    }




    @FXML
    private Text HealthCoinCounter;

    private Coin coin = Coin.getInstance();
    private Health health = Health.getInstance();

    @FXML
    public void initialize(){
        if(HealthCoinCounter != null){
            updateHealthCoinCounter(); // Update the text at initialization
        }

    }


    public void updateHealthCoinCounter() {
        HealthCoinCounter.setText("Health: " + health.getHealth() +" "+ "Coins: " + coin.getCoinCount());
    }





    //Lexi's Events start here:
    public void lexiIntro(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/tess_files/1.1_intro_lexi.fxml");
    }

    public void lexiEvent1OptionBack(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/tess_files/1.1.2_going_back_lexi.fxml");
        counter.neutral++;
    }

    public void lexiEvent1OptionLeft(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/tess_files/1.1.2_going_left_lexi.fxml");
        counter.good++;
    }

    public void lexiEvent1OptionRight(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/tess_files/1.1.2_going_right_lexi.fxml");
        counter.bad++;
    }

    public void lexiEvent2OptionRun(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/tess_files/2.1_run_and_die_lexi.fxml");
        counter.bad++;
    }

    public void lexiEvent2OptionHide(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/tess_files/2.2_hide_lexi.fxml");
        counter.neutral++;
    }

    public void lexiEvent2OptionStay(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/tess_files/2.3_stay_lexi.fxml");
        counter.good++;
    }

    public void lexiEvent3OptionWin(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/tess_files/3.1_level_complete_lexi.fxml");
        counter.good++;
    }

    public void lexiEvent3OptionAttack(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/tess_files/3.2_attack_and_die_lexi.fxml");
        counter.bad++;
    }

    public void lexiEvent3OptionBreakFree(ActionEvent event) throws IOException {
        gameManager.loadScene(event,"/com/example/placeholdergame/tess_files/3.2_break_free_and_die_lexi.fxml");
        counter.bad++;
    }

    //Nicoletta's Events start here:
    @FXML
    public void N_intro(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_intro.fxml");
    }
    @FXML
    public void N_intro_left(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_intro_left.fxml");
        counter.neutral++;
    }
    @FXML
    public void N_intro_middle(ActionEvent event) throws IOException{
        counter.good++;
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_intro_middle.fxml");

    }
    @FXML
    public void N_intro_right(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_intro_right.fxml");
        counter.bad++;
    }
    @FXML
    public void N_forest(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_forest.fxml");
    }
    @FXML
    public void N_temple(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_temple.fxml");
    }
    @FXML
    public void N_temple_false(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_temple_false.fxml");
        counter.neutral++;
    }
    @FXML
    public void N_end(ActionEvent event) throws IOException{
        gameManager.loadScene(event, "/com/example/placeholdergame/N_files/N_end.fxml");
        counter.good++;
    }
    @FXML
    public void N_end_door(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_end_door.fxml");
        counter.neutral++;
    }
    @FXML
    public void N_end_ring(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_end_ring.fxml");
        counter.neutral++;
    }
    @FXML
    public void N_end_stone(ActionEvent event) throws IOException{
        gameManager.loadScene(event,"/com/example/placeholdergame/N_files/N_end_stone.fxml");
        counter.good++;
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
        counter.energyCore=true;
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
        System.out.println(counter.energyCore);
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
    public void EnergyCore(ActionEvent event) throws IOException {
        if(counter.energyCore){
            event4_Option1_SPACESHIP(event);
        }else if(!counter.energyCore){
            event4_SPACESHIP(event);
        }
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
        gameManager.loadScene(event, "/com/example/placeholdergame/DavidFXML/DavidIntro.fxml");
    }

    public void davidChoice1(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/DavidFXML/DavidChoice1.fxml");
        coin.addCoins(500); // Increment coin count
        health.loseHealth(5); // Increment health count
        updateHealthCoinCounter(); // Update the display
    }

    public void davidChoice1x2(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/DavidFXML/DavidChoice1-2.fxml");
    }

    public void davidChoice3x1(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/DavidFXML/DavidChoice3-1.fxml");
    }

    public void davidChoice3x2(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/DavidFXML/DavidChoice3-2.fxml");
    }

    public void davidChoice3x3(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/DavidFXML/DavidChoice3-3.fxml");
    }

    public void davidChoice4(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/DavidFXML/DavidChoice4.fxml");
    }

    public void davidQTE1(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/DavidFXML/DavidQTE1.fxml");
    }

    public void davidQTE2(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/DavidFXML/DavidQTE2.fxml");
    }

    public void davidQTE3(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/DavidFXML/DavidQTE3.fxml");
    }

    public void davidQTE4(ActionEvent event) throws IOException {
        gameManager.loadScene(event, "/com/example/placeholdergame/DavidFXML/DavidQTE4.fxml");
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