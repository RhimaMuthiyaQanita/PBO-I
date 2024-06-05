package com.example.codelab2;

import javafx.fxml.FXML;

public class AfterLoginController {

    @FXML
    private void userLogOut() {
        try {
            Main.showLoginPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
