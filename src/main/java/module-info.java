module com.example.opiumbot {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.opiumbot to javafx.fxml;
    exports com.example.opiumbot;
}