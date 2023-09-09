package com.haslam.project_lisensi;


import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class LicenseInputController extends ActionEvent {

    public boolean fileIsExist(){
        return true;
    }

    public static void licenseValidation(Label label) {
        label.setText("hello guys");
    }
}
