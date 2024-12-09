module com.wizardnightmare {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.wizardnightmare to javafx.fxml;
    exports com.wizardnightmare;
    exports com.wizardnightmare.loaderManual;
    opens com.wizardnightmare.loaderManual to javafx.fxml;
}