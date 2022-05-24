package com.example.freelancer;

import com.example.freelancer.DBUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class FreelancerNavbarController implements Initializable {

    @FXML
    private Button btnCreateService;

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
    private Label videoAnimation;

    @FXML
    private Label writingTranslation;
    @FXML
    private BorderPane borderPane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnLogout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "login-fxml/log-in.fxml", "Login", null, null);
            }
        });
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("freelancer-fxml/freelancer-main-scene.fxml"));
            borderPane.setCenter(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }

        graphicsDesign.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-graphics-design.fxml"));
                    borderPane.setCenter(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        freelanceSystem.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("freelancer-fxml/freelancer-main-scene.fxml"));
                    borderPane.setCenter(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        btnCreateService.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("freelancer-fxml/freelancer-create-service.fxml"));
                    borderPane.setCenter(fxml);
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
                    borderPane.setCenter(fxml);
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
                    borderPane.setCenter(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        videoAnimation.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-video-animation.fxml"));
                    borderPane.setCenter(fxml);
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
                    borderPane.setCenter(fxml);
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
                    borderPane.setCenter(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
//        try {
//
//            Parent fxml = FXMLLoader.load(getClass().getResource("freelancer-fxml/freelancer-main-scene.fxml"));
//            contentArea.getChildren().removeAll();
//            contentArea.getChildren().setAll(fxml);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        graphicsDesign.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                try {
//                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-graphics-design.fxml"));
//                    contentArea.getChildren().removeAll();
//                    contentArea.getChildren().setAll(fxml);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        freelanceSystem.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                try {
//                    Parent fxml = FXMLLoader.load(getClass().getResource("freelancer-fxml/freelancer-main-scene.fxml"));
//                    contentArea.getChildren().removeAll();
//                    contentArea.getChildren().setAll(fxml);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        btnCreateService.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                try {
//                    Parent fxml = FXMLLoader.load(getClass().getResource("freelancer-fxml/freelancer-create-service.fxml"));
//                    contentArea.getChildren().removeAll();
//                    contentArea.getChildren().setAll(fxml);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        digitalMarketing.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                try {
//                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-digital-marketing.fxml"));
//                    contentArea.getChildren().removeAll();
//                    contentArea.getChildren().setAll(fxml);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        writingTranslation.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                try {
//                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-writing-translation.fxml"));
//                    contentArea.getChildren().removeAll();
//                    contentArea.getChildren().setAll(fxml);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        videoAnimation.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                try {
//                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-video-animation.fxml"));
//                    contentArea.getChildren().removeAll();
//                    contentArea.getChildren().setAll(fxml);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        programmingTech.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                try {
//                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-programming-tech.fxml"));
//                    contentArea.getChildren().removeAll();
//                    contentArea.getChildren().setAll(fxml);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        business.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                try {
//                    Parent fxml = FXMLLoader.load(getClass().getResource("services/service-business.fxml"));
//                    contentArea.getChildren().removeAll();
//                    contentArea.getChildren().setAll(fxml);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
    }
    public void changeContentArea() {
        try {
            Parent fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("services/selectservice.fxml")));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
            System.out.println(contentArea.getChildren().setAll(fxml));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void loadPage(String page) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        borderPane.setCenter(root);
    }
}
