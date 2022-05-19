package com.example.freelancer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MainSceneController implements Initializable {
    @FXML
    Button btnLogout;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnLogout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "log-in.fxml", "Login", null, null);
                System.out.println("HELLO");
            }
        });
    }

    public void setUserInformation(String username) {

    }
}
