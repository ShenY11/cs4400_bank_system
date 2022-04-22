package com.example.bank_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Screen19Login extends Application {
    //Screen 19
    protected static String ID = "";
    protected static String password = "";
    //Screen 1
    protected static String corpID = "";
    protected static String longName =  "";
    protected static String shortName = "";
    protected static int resAssets = 0;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader =
                new FXMLLoader(Screen19Login.class.getResource("screen19" +
                        ".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Bank System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}