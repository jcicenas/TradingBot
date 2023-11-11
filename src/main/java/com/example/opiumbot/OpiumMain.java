package com.example.opiumbot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class OpiumMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("opiumbotpage1.fxml"));
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}