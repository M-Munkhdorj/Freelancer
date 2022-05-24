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
import java.util.ResourceBundle;

public class UserNavbarController implements Initializable {
    @FXML
    private Button btnLogout;

    @FXML
    private Label business;

    @FXML
    private StackPane contentArea;

    @FXML
    private Label digitalMarketing;

    @FXML
    private Label freelanceSystem;

    @FXML
    private Label graphicsDesign;

    @FXML
    private Label programmingTech;

    @FXML
    private Label videoAnimations;

    @FXML
    private Label writingTranslation;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnLogout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "login-fxml/log-in.fxml", "Login", null, null);
            }
        });
        try {
            Parent fxml = FXMLLoader.load((getClass().getResource("user-fxml/user-main-scene.fxml")));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }

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

        graphicsDesign.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-graphics-design.fxml"));
                    contentArea.getChildren().removeAll();
                    contentArea.getChildren().setAll(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        digitalMarketing.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-digital-marketing.fxml"));
                    contentArea.getChildren().removeAll();
                    contentArea.getChildren().setAll(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        writingTranslation.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-writing-translation.fxml"));
                    contentArea.getChildren().removeAll();
                    contentArea.getChildren().setAll(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        videoAnimations.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-video-animation.fxml"));
                    contentArea.getChildren().removeAll();
                    contentArea.getChildren().setAll(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        programmingTech.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-programming-tech.fxml"));
                    contentArea.getChildren().removeAll();
                    contentArea.getChildren().setAll(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        business.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-business.fxml"));
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
