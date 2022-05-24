module com.example.freelancer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.freelancer to javafx.fxml;
    exports com.example.freelancer;
    exports com.example.freelancer.Login;
    exports com.example.freelancer.Freelancer;
    opens com.example.freelancer.Freelancer to javafx.fxml;
    exports com.example.freelancer.Model;
    opens com.example.freelancer.Model to javafx.fxml;
    exports com.example.freelancer.Service;
    opens com.example.freelancer.Service to javafx.fxml;
    opens com.example.freelancer.Login to javafx.fxml;
    exports com.example.freelancer.User;
    opens com.example.freelancer.User to javafx.fxml;
}