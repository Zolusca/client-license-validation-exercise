package com.haslam.project_lisensi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LicenseActiveController implements Initializable {
    @FXML
    public Label label;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    public void tes(ActionEvent actionEvent) {
        label.setText("hello !!!");
    }
}
