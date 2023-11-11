package com.example.opiumbot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OpiumBotPage2Controller implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resource){
        //intialize
    }

    @FXML
    public void toScene3(ActionEvent event) throws IOException{
        System.out.println("hi");
        Scene scene;
        Stage stage;


        Parent root = FXMLLoader.load(getClass().getResource("opiumbotpage3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
