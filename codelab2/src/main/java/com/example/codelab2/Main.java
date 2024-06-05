package com.example.codelab2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;
        showLoginPage();
    }

    public static void showLoginPage() throws Exception {
        Parent loginPage = FXMLLoader.load(Main.class.getResource("login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(loginPage, 600, 400));
        primaryStage.show();
    }

    public static void showAfterLoginPage() throws Exception {
        Parent afterLoginPage = FXMLLoader.load(Main.class.getResource("afterLogin.fxml"));
        primaryStage.setTitle("After Login");
        primaryStage.setScene(new Scene(afterLoginPage, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
