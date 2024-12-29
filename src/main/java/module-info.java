module com.example.placeholdergame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.placeholdergame to javafx.fxml;
    exports com.example.placeholdergame;
}