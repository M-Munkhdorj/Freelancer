package com.example.freelancer.Service;

import com.example.freelancer.DBUtils;
import com.example.freelancer.FreelancerNavbarController;
import com.example.freelancer.Model.Service;
import com.example.freelancer.UserNavbarController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ServiceGraphicsDesignController implements Initializable {
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
//    private FreelancerNavbarController navbarController;
//    public void changeContentArea(FreelancerNavbarController navbarController) {
//        this.navbarController = navbarController;
//    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Service> service = FXCollections.observableArrayList();
        service = DBUtils.getService("Graphics&Design");
        int i=1, k=service.size();
        if (i<k) {
            txt1.setText(service.get(1).getName());
            Image image1 = new Image(service.get(1).getImagePath(),200,300,false,false);
            imgView1.setImage(image1);
            txt11.setText(service.get(1).getPrice());
            i++;
        }
        if (i<k) {
            txt2.setText(service.get(2).getName());
            Image image2 = new Image(service.get(2).getImagePath(),200,300,false,false);
            imgView2.setImage(image2);
            txt12.setText(service.get(2).getPrice());
            i++;
        }
        if (i<k) {
            txt3.setText(service.get(3).getName());
            Image image3 = new Image(service.get(3).getImagePath(),200,300,false,false);
            imgView3.setImage(image3);
            txt13.setText(service.get(3).getPrice());
            i++;
        }
        if (i<k) {
            txt4.setText(service.get(4).getName());
            Image image4 = new Image(service.get(4).getImagePath(),200,400,false,false);
            imgView4.setImage(image4);
            txt14.setText(service.get(4).getPrice());
            i++;
        }
        if (i<k) {
            txt5.setText(service.get(5).getName());
            Image image5 = new Image(service.get(5).getImagePath(),200,500,false,false);
            imgView5.setImage(image5);
            txt15.setText(service.get(5).getPrice());

        }

         imgView1.setOnMousePressed(new EventHandler<MouseEvent>() {
             @Override
             public void handle(MouseEvent mouseEvent) {
                 FXMLLoader fxmlLoader = new FXMLLoader(FreelancerNavbarController.class.getResource("freelancer-fxml/freelancer-navbar.fxml"));
                 try {
                     Parent root = fxmlLoader.load();
                     FreelancerNavbarController freelancerNavbarController = fxmlLoader.getController();
                     freelancerNavbarController.changeContentArea();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
         });


//        imgView1.setOnMousePressed(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                FXMLLoader loader = new FXMLLoader(FreelancerNavbarController.class.getResource("services/service-graphics-design.fxml"));
//                ServiceGraphicsDesignController controller = loader.getController();
//                controller.changeContentArea(navbarController);
//            }
//        });
    }
}
