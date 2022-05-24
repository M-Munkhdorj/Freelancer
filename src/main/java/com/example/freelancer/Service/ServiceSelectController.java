package com.example.freelancer.Service;

import com.example.freelancer.DBUtils;
import com.example.freelancer.Model.Service;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class ServiceSelectController implements Initializable {
    @FXML
    private Button btBuy;

    @FXML
    private Button btnClose;

    @FXML
    private ImageView imageView;

    @FXML
    private Label lblServiceDeliveryTime;

    @FXML
    private Label lblServiceName;

    @FXML
    private Label lblServiceType;

    @FXML
    private TextArea txtAreaServiceDescription;

    @FXML
    private Label lblServicePrice;
    String serviceType="Graphics&Design",serviceName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtAreaServiceDescription.setEditable(false);

        btnClose.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent root = null;
                FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource("freelancer-fxml/freelancer-navbar.fxml"));
                try {
                    root = loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                assert root != null;
                stage.setScene(new Scene(root));
                stage.show();
            }
        });
    }

    public void getServiceType(String text) {
        lblServiceType.setText(text);
    }
    public void getServiceName(String text) {
        lblServiceName.setText(text);
    }
    public void getServicePrice(String text) {
        lblServicePrice.setText(text);
    }
    public void getDeliveryTime(String text) {
        lblServiceDeliveryTime.setText(text);
    }
    public void getDescription(String text) {
        txtAreaServiceDescription.appendText(text);
    }
    public void getImagePath(String text) {
        Image image = new Image(text,600,350,false,false);
        imageView.setImage(image);
    }



}
