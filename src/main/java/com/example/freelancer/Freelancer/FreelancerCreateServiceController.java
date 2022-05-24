package com.example.freelancer.Freelancer;

import com.example.freelancer.DBUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class FreelancerCreateServiceController implements Initializable {
    @FXML
    private Button btnChooseImage;

    @FXML
    private Button btnContinue;

    @FXML
    private ChoiceBox<String> choiceBoxServiceType;

    @FXML
    private TextField tfDeliveryTime;

    @FXML
    private TextField tfImage;

    @FXML
    private TextField tfPrice;

    @FXML
    private TextField tfServiceName;

    @FXML
    private TextArea txtAreaDescription;

    private final String[] serviceType={"Graphics&Design","Digital Marketing","Writing&Translation","Video&Animations","Programming&Tech","Business"};
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnChooseImage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fc = new FileChooser();
                fc.setInitialDirectory(new File("C:\\Users\\muudu\\Desktop\\2022 Spring\\Program hangamjiin hugjuulelt"));
                fc.getExtensionFilters().addAll(
                        new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.png", "*.jpeg"));
                File selectedImage = fc.showOpenDialog(null);
                if (selectedImage != null) {
                    tfImage.setText(selectedImage.getAbsolutePath());
                } else {
                    System.out.println("file is not valid");
                }
            }
        });

        btnContinue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (
                        !choiceBoxServiceType.getValue().trim().isEmpty() &&
                        !tfServiceName.getText().trim().isEmpty() &&
                        !txtAreaDescription.getText().trim().isEmpty() &&
                        !tfDeliveryTime.getText().trim().isEmpty() &&
                        !tfPrice.getText().trim().isEmpty() &&
                        !tfImage.getText().trim().isEmpty()
                ) {
                    DBUtils.saveService(event,
                            choiceBoxServiceType.getValue(),
                            tfServiceName.getText(),
                            txtAreaDescription.getText(),
                            tfDeliveryTime.getText(),
                            tfPrice.getText(),
                            tfImage.getText());
                } else {
                    System.out.println("Please fill in all information");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please fill in all information to create service");
                    alert.show();
                }

            }
        });
        choiceBoxServiceType.getItems().addAll(serviceType);
    }

}
