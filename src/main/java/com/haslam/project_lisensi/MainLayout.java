package com.haslam.project_lisensi;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LayoutController extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent fxmlLoader = new FXMLLoader().load(getClass().getResource("LicenseInput.fxml"));

        Scene scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void tes(ActionEvent actionEvent) {
    }
}
