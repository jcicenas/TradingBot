package com.example.opiumbot;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OpiumBotPage1Controller implements Initializable{

    @Override
    public void initialize(URL location, ResourceBundle resources){
        //intial data for method
    }
    @FXML
    public Button authButton;
    public void authMethod(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;
        //authentication code here:



        //code to switch to scene 2
        Parent root = FXMLLoader.load(getClass().getResource("opiumbotpage2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
