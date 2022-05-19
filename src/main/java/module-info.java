module com.example.freelancer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.freelancer to javafx.fxml;
    exports com.example.freelancer;
}