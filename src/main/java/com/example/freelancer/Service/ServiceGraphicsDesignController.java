package com.example.freelancer.Service;

import com.example.freelancer.DBUtils;
import com.example.freelancer.Model.Service;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Service> service = FXCollections.observableArrayList();
        service = DBUtils.getService("Graphics&Design");
        System.out.println(service.get(1).getName());
        txt1.setText(service.get(1).getName());
        Image image1 = new Image(service.get(1).getImagePath(),200,300,false,false);
        imgView1.setImage(image1);
    }
}
