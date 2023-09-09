module com.haslam.project_lisensi {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.haslam.project_lisensi to javafx.fxml;
    exports com.haslam.project_lisensi;
}