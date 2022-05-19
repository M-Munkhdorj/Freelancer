package com.example.freelancer.Login;

import com.example.freelancer.DBUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    @FXML
    private Button btnContinue;

    @FXML
    private Button btnSignIn;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfPassword;

    @FXML
    private TextField tfUsername;

    @FXML
    private RadioButton rbFreelancer;

    @FXML
    private RadioButton rbUser;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup toggleGroup = new ToggleGroup();
        rbFreelancer.setToggleGroup(toggleGroup);
        rbUser.setToggleGroup(toggleGroup);
        rbUser.setSelected(true);

        btnContinue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!tfUsername.getText().trim().isEmpty() && !tfPassword.getText().trim().isEmpty() && !tfEmail.getText().trim().isEmpty()) {
                    if (rbUser.isSelected()) {
                        DBUtils.signUpUser(event, tfEmail.getText(), tfUsername.getText(), tfPassword.getText(),rbUser.getText());
                    } else {
                        DBUtils.signUpUser(event, tfEmail.getText(), tfUsername.getText(), tfPassword.getText(),rbFreelancer.getText());
                    }

                } else {
                    System.out.println("Please fill in all information");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please fill in all information to sign up");
                    alert.show();
                }
            }
        });

        btnSignIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "login-fxml/log-in.fxml", "Log in", null, null);
            }
        });
    }
    public void onContinueButtonPressed() {
        btnContinue.setStyle("-fx-background-color: #FFFFFF;");
    }

    public void onContinueButtonReleased(){
        btnContinue.setStyle("-fx-background-color: #57ff86;");
    }

    public void onSignInButtonPressed() {
        btnSignIn.setStyle("-fx-background-color: #57ff86;-fx-text-fill: white;");
    }

    public void onSignInButtonReleased(){
        btnSignIn.setStyle("-fx-background-color: white;-fx-text-fill: #57ff86;");
    }


}
