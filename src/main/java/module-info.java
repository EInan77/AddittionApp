module eren.addittionapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens eren.addittionapp to javafx.fxml;
    exports eren.addittionapp;
}
