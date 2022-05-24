package com.example.freelancer.Service;

import com.example.freelancer.DBUtils;
import com.example.freelancer.Model.Service;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ServiceWritingTranslationController implements Initializable {
    @FXML
    private ImageView imgView1;
    @FXML
    private ImageView imgView2;
    @FXML
    private ImageView imgView3;
    @FXML
    private ImageView imgView4;
    @FXML
    private ImageView imgView5;
    @FXML
    private Text txt1;
    @FXML
    private Text txt2;
    @FXML
    private Text txt3;
    @FXML
    private Text txt4;
    @FXML
    private Text txt5;
    @FXML
    private Text txt11;
    @FXML
    private Text txt12;
    @FXML
    private Text txt13;
    @FXML
    private Text txt14;
    @FXML
    private Text txt15;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Service> service = FXCollections.observableArrayList();
        service = DBUtils.getService("Writing&Translation");
        int i = 0, k = service.size();
        System.out.println(k);
        if (i < k) {
            txt1.setText(service.get(i).getName());
            Image image1 = new Image(service.get(i).getImagePath(), 200, 300, false, false);
            imgView1.setImage(image1);
            txt11.setText(service.get(i).getPrice());
            ObservableList<Service> finalService = service;
            int finalI = i;
            imgView1.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource("services/selectservice.fxml"));
                    Parent root = null;
                    try {
                        root = loader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ServiceSelectController serviceSelectController = loader.getController();
                    serviceSelectController.getServiceType("Writing&Translation");
                    serviceSelectController.getServiceName(finalService.get(finalI).getName());
                    serviceSelectController.getServicePrice(finalService.get(finalI).getPrice());
                    serviceSelectController.getDeliveryTime(finalService.get(finalI).getDeliveryTime());
                    serviceSelectController.getDescription(finalService.get(finalI).getDescription());
                    serviceSelectController.getImagePath(finalService.get(finalI).getImagePath());
                    Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                    assert root != null;
                    stage.setScene(new Scene(root));
                    stage.show();
                }
            });
            i++;
        }
        if (i < k) {
            txt2.setText(service.get(i).getName());
            Image image2 = new Image(service.get(i).getImagePath(), 200, 300, false, false);
            imgView2.setImage(image2);
            txt12.setText(service.get(i).getPrice());
            ObservableList<Service> finalService = service;
            int finalI = i;
            imgView2.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource("services/selectservice.fxml"));
                    Parent root = null;
                    try {
                        root = loader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ServiceSelectController serviceSelectController = loader.getController();
                    serviceSelectController.getServiceType("Writing&Translation");
                    serviceSelectController.getServiceName(finalService.get(finalI).getName());
                    serviceSelectController.getServicePrice(finalService.get(finalI).getPrice());
                    serviceSelectController.getDeliveryTime(finalService.get(finalI).getDeliveryTime());
                    serviceSelectController.getDescription(finalService.get(finalI).getDescription());
                    serviceSelectController.getImagePath(finalService.get(finalI).getImagePath());
                    Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                    assert root != null;
                    stage.setScene(new Scene(root));
                    stage.show();
                }
            });
            i++;
        }
        if (i < k) {
            txt3.setText(service.get(i).getName());
            Image image3 = new Image(service.get(i).getImagePath(), 200, 300, false, false);
            imgView3.setImage(image3);
            txt13.setText(service.get(i).getPrice());
            ObservableList<Service> finalService = service;
            int finalI = i;
            imgView3.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource("services/selectservice.fxml"));
                    Parent root = null;
                    try {
                        root = loader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ServiceSelectController serviceSelectController = loader.getController();
                    serviceSelectController.getServiceType("Writing&Translation");
                    serviceSelectController.getServiceName(finalService.get(finalI).getName());
                    serviceSelectController.getServicePrice(finalService.get(finalI).getPrice());
                    serviceSelectController.getDeliveryTime(finalService.get(finalI).getDeliveryTime());
                    serviceSelectController.getDescription(finalService.get(finalI).getDescription());
                    serviceSelectController.getImagePath(finalService.get(finalI).getImagePath());
                    Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                    assert root != null;
                    stage.setScene(new Scene(root));
                    stage.show();
                }
            });
            i++;
        }
        if (i < k) {
            txt4.setText(service.get(i).getName());
            Image image4 = new Image(service.get(i).getImagePath(), 200, 400, false, false);
            imgView4.setImage(image4);
            txt14.setText(service.get(i).getPrice());
            ObservableList<Service> finalService = service;
            int finalI = i;
            imgView4.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource("services/selectservice.fxml"));
                    Parent root = null;
                    try {
                        root = loader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ServiceSelectController serviceSelectController = loader.getController();
                    serviceSelectController.getServiceType("Writing&Translation");
                    serviceSelectController.getServiceName(finalService.get(finalI).getName());
                    serviceSelectController.getServicePrice(finalService.get(finalI).getPrice());
                    serviceSelectController.getDeliveryTime(finalService.get(finalI).getDeliveryTime());
                    serviceSelectController.getDescription(finalService.get(finalI).getDescription());
                    serviceSelectController.getImagePath(finalService.get(finalI).getImagePath());
                    Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                    assert root != null;
                    stage.setScene(new Scene(root));
                    stage.show();
                }
            });
            i++;
        }
        if (i < k) {
            txt5.setText(service.get(i).getName());
            Image image5 = new Image(service.get(i).getImagePath(), 200, 500, false, false);
            imgView5.setImage(image5);
            txt15.setText(service.get(i).getPrice());
            ObservableList<Service> finalService = service;
            int finalI = i;
            imgView5.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource("services/selectservice.fxml"));
                    Parent root = null;
                    try {
                        root = loader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ServiceSelectController serviceSelectController = loader.getController();
                    serviceSelectController.getServiceType("Writing&Translation");
                    serviceSelectController.getServiceName(finalService.get(finalI).getName());
                    serviceSelectController.getServicePrice(finalService.get(finalI).getPrice());
                    serviceSelectController.getDeliveryTime(finalService.get(finalI).getDeliveryTime());
                    serviceSelectController.getDescription(finalService.get(finalI).getDescription());
                    serviceSelectController.getImagePath(finalService.get(finalI).getImagePath());
                    Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                    assert root != null;
                    stage.setScene(new Scene(root));
                    stage.show();
                }
            });
        }
    }
}
