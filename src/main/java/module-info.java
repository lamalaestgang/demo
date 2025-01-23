module org.calma.ui.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.calma.ui.demo to javafx.fxml;
    exports org.calma.ui.demo;
}