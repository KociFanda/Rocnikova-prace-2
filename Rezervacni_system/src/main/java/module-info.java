module com.example.rezervacni_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.rezervacni.system to javafx.fxml;
    exports com.example.rezervacni.system;
}