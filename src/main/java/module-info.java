module com.example.conversor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.measure;
    requires indriya;
    requires org.json;
    requires com.fasterxml.jackson.databind;

    opens com.example.conversor to javafx.fxml;
    exports com.example.conversor;
    exports com.example.conversor.connection;
    opens com.example.conversor.connection to javafx.fxml;
    exports com.example.conversor.operaciones;
    opens com.example.conversor.operaciones to javafx.fxml;
    exports com.example.conversor.model;
    opens com.example.conversor.model to javafx.fxml;

}