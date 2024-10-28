module com.example.java_text_board {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_text_board to javafx.fxml;
    exports com.example.java_text_board;
}