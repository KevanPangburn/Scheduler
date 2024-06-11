module com.example.helloworldjfxtemplate {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.Scheduling to javafx.fxml;
    exports com.example.Scheduling;

    exports com.example.Scheduling.controller;
    opens com.example.Scheduling.controller to javafx.fxml;

}