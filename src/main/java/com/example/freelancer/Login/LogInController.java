package com.example.freelancer.Login;

import com.example.freelancer.DBUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {

    @FXML
    private Button btnContinue;
    @FXML
    private Button btnCreateAccount;
    @FXML
    private TextField tfUsername;
    @FXML
    private TextField tfPassword;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnCreateAccount.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "sign-up.fxml", "Sign up", null, null);
            }
        });
        btnContinue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.logInUser(event, tfUsername.getText(), tfPassword.getText());
            }
        });
    }

    public void onContinueButtonPressed(){
        btnContinue.setStyle("-fx-background-color: #FFFFFF;");
    }

    public void onContinueButtonReleased(){
        btnContinue.setStyle("-fx-background-color: #57ff86;");
    }

    public void onCreateAccountButtonPressed(){
        btnCreateAccount.setStyle("-fx-background-color: #57ff86;-fx-text-fill: white;");
    }

    public void onCreateAccountButtonReleased(){
        btnCreateAccount.setStyle("-fx-background-color: white;-fx-text-fill: #57ff86;");
    }


}