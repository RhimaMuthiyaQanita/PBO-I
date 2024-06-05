package com.example.codelab2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label wrongLogIn;

    @FXML
    private void userLogIn() {
        checkLogin();
    }

    private void checkLogin() {
        String user = username.getText();
        String pass = password.getText();

        if (user.isEmpty() || pass.isEmpty()) {
            wrongLogIn.setText("Please enter your data.");
        } else if (user.equals("admin") && pass.equals("1234")) {
            wrongLogIn.setText("Success!");
            // Proceed to the next scene
            try {
                Main.showAfterLoginPage();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            wrongLogIn.setText("Wrong username or password!");
        }
    }
}
