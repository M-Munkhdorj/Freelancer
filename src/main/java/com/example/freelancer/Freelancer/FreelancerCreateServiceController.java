package com.example.freelancer.Freelancer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FreelancerCreateServiceController implements Initializable {

    @FXML
    private Button btnContinue;

    @FXML ChoiceBox<String> choiceBoxService;

    @FXML
    private TextField tfPassword;

    @FXML
    private TextField tfPassword1;

    private final String[] serviceType={"Graphics&Design","Digital Marketing","Writing&Translation","Video&Animations","Programming&Tech","Business"};
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBoxService.getItems().addAll(serviceType);
    }

}
