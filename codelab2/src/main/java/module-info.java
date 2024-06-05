module com.example.codelab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codelab2 to javafx.fxml;
    exports com.example.codelab2;
}