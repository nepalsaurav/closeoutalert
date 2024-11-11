module org.openjfx.closeoutalert {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx.closeoutalert to javafx.fxml;
    exports org.openjfx.closeoutalert;
}
