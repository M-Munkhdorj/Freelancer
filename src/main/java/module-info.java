module com.example.freelancer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.freelancer to javafx.fxml;
    exports com.example.freelancer;
    exports com.example.freelancer.Login;
    opens com.example.freelancer.Login to javafx.fxml;
    exports com.example.freelancer.User;
    opens com.example.freelancer.User to javafx.fxml;
}