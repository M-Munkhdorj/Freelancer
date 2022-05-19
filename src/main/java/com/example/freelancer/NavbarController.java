package com.example.freelancer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class NavbarController implements Initializable {
    @FXML
    Button btnLogout;

    @FXML
    private StackPane contentArea;

    @FXML
    private Label graphicsDesign;

    @FXML
    private Label freelanceSystem;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnLogout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "login-fxml/log-in.fxml", "Login", null, null);
                System.out.println("HELLO");
            }
        });
        try {
            Parent fxml = FXMLLoader.load((getClass().getResource("user-fxml/user-main-scene.fxml")));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
        graphicsDesign.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("user-fxml/user-digital-service.fxml"));
                    contentArea.getChildren().removeAll();
                    contentArea.getChildren().setAll(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        freelanceSystem.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("user-fxml/user-main-scene.fxml"));
                    contentArea.getChildren().removeAll();
                    contentArea.getChildren().setAll(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void setUserInformation(String username) {

    }
}
