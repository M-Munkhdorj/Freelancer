package com.example.freelancer;

import com.example.freelancer.Model.Service;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.sql.*;

import java.io.IOException;
import java.util.Objects;

public class DBUtils {
    // scene uurchluh
    public static void changeScene(ActionEvent event, String fxmlFile, String title, String username, String email){
        Parent root = null;
        if (username != null && email != null) {
            try {
                FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(fxmlFile));
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                root = FXMLLoader.load(Objects.requireNonNull(DBUtils.class.getResource(fxmlFile)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        assert root != null;
        stage.setScene(new Scene(root));
        stage.show();
    }
    //user burtgeh
    public static void signUpUser(ActionEvent event,String email,String username,String password,String userType) {
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psCheckUserExists = null;
        ResultSet resultSet = null;
        if (userType.equals("User")) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/freelancer", "root", "root");
                psCheckUserExists = connection.prepareStatement("SELECT * FROM users WHERE username=?");
                psCheckUserExists.setString(1, username);
                resultSet = psCheckUserExists.executeQuery();
                if (resultSet.isBeforeFirst()) {
                    System.out.println("User already exists");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("You cannot use this username");
                    alert.show();
                } else {
                    psInsert = connection.prepareStatement("INSERT INTO users(username,password,email,user_type) VALUES(?,?,?,?)");
                    psInsert.setString(1, username);
                    psInsert.setString(2, password);
                    psInsert.setString(3, email);
                    psInsert.setString(4, userType);
                    psInsert.executeUpdate();

                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(DBUtils.class.getResource("login-fxml/log-in.fxml"));
                        Scene scene = new Scene(fxmlLoader.load());
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(scene);
                        stage.show();
                        System.out.println("Successfully registered");
                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setContentText("Successfully registered");
                        alert.show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (psCheckUserExists != null) {
                    try {
                        psCheckUserExists.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (psInsert != null) {
                    try {
                        psInsert.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/freelancer", "root", "root");
                psCheckUserExists = connection.prepareStatement("SELECT * FROM freelancers WHERE username=?");
                psCheckUserExists.setString(1, username);
                resultSet = psCheckUserExists.executeQuery();
                if (resultSet.isBeforeFirst()) {
                    System.out.println("User already exists");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("You cannot use this username");
                    alert.show();
                } else {
                    psInsert = connection.prepareStatement("INSERT INTO freelancers(username,password,email,user_type) VALUES(?,?,?,?)");
                    psInsert.setString(1, username);
                    psInsert.setString(2, password);
                    psInsert.setString(3, email);
                    psInsert.setString(4, userType);
                    psInsert.executeUpdate();

                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(DBUtils.class.getResource("login-fxml/log-in.fxml"));
                        Scene scene = new Scene(fxmlLoader.load());
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(scene);
                        stage.show();
                        System.out.println("Successfully registered");
                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setContentText("Successfully registered");
                        alert.show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (psCheckUserExists != null) {
                    try {
                        psCheckUserExists.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (psInsert != null) {
                    try {
                        psInsert.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        }
    }
    //user log in hiih
    public static void logInUser(ActionEvent event, String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement2 = null;
        ResultSet resultSet = null;
        ResultSet resultSet2 = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/freelancer", "root", "root");
            preparedStatement = connection.prepareStatement("SELECT password, email FROM users WHERE username=?");
            preparedStatement2 = connection.prepareStatement("SELECT password, email FROM freelancers WHERE username=?");
            preparedStatement.setString(1, username);
            preparedStatement2.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            resultSet2 = preparedStatement2.executeQuery();

            if (!resultSet.isBeforeFirst()) {
                if (!resultSet2.isBeforeFirst()) {
                    System.out.println("User not found");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Provided credentials are incorrect");
                    alert.show();
                }
                else {
                    while (resultSet2.next()) {
                        String retrievedPassword = resultSet2.getString("password");
                        String retrievedEmail = resultSet2.getString("email");
                        if (retrievedPassword.equals(password)) {
                            changeScene(event, "freelancer-fxml/freelancer-navbar.fxml", "Welcome", username, retrievedEmail);
                        } else {
                            System.out.println("passwords did not match");
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("Provided credentials are incorrect");
                            alert.show();
                        }
                    }
                }
            }  else {
                while (resultSet.next()) {
                    String retrievedPassword = resultSet.getString("password");
                    String retrievedEmail = resultSet.getString("email");
                    if (retrievedPassword.equals(password)) {
                        changeScene(event, "user-fxml/user-navbar.fxml", "Welcome", username, retrievedEmail);
                    } else {
                        System.out.println("passwords did not match");
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Provided credentials are incorrect");
                        alert.show();
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
    //ajliin zariin medeelliig hadgalah
    public static void saveService(ActionEvent event,
                                   String serviceType,
                                   String serviceName,
                                   String serviceDescription,
                                   String serviceDeliveryTime,
                                   String servicePrice,
                                   String serviceImagePath) {
        Connection connection = null;
        PreparedStatement psInsert = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/freelancer", "root", "root");
            psInsert = connection.prepareStatement("INSERT INTO services(" +
                    "service_type," +
                    "service_name," +
                    "service_description," +
                    "service_delivery_time," +
                    "service_price," +
                    "service_image_path) VALUES(?,?,?,?,?,?)");
            psInsert.setString(1, serviceType);
            psInsert.setString(2, serviceName);
            psInsert.setString(3, serviceDescription);
            psInsert.setString(4, serviceDeliveryTime);
            psInsert.setString(5, servicePrice);
            psInsert.setString(6, serviceImagePath);
            psInsert.executeUpdate();

            System.out.println("Successfully registered");
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Successfully created service");
            alert.show();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (psInsert != null) {
                try {
                    psInsert.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
    //ajliin medeelel avah
    public static ObservableList<Service> getService(String serviceType) {
        ObservableList<Service> serviceData = FXCollections.observableArrayList();
        Connection connection = null;
        PreparedStatement psCheckExists;
        ResultSet resultSet;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/freelancer", "root", "root");
            psCheckExists = connection.prepareStatement("SELECT * FROM services WHERE service_type=?");
            psCheckExists.setString(1, serviceType);
            resultSet = psCheckExists.executeQuery();
            if (resultSet.isBeforeFirst()) {
                while (resultSet.next()) {
                    serviceData.add(new Service(resultSet.getString("service_type"),
                            resultSet.getString("service_name"),
                            resultSet.getString("service_description"),
                            resultSet.getString("service_delivery_time"),
                            resultSet.getString("service_price"),
                            resultSet.getString("service_image_path")));
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return serviceData;
    }
    public static ObservableList<Service> getServiceType(String serviceType) {
        ObservableList<Service> serviceData = FXCollections.observableArrayList();
        Connection connection = null;
        PreparedStatement psCheckExists;
        ResultSet resultSet;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/freelancer", "root", "root");
            psCheckExists = connection.prepareStatement("SELECT * FROM services WHERE service_type=?");
            psCheckExists.setString(1, serviceType);
            resultSet = psCheckExists.executeQuery();
            if (resultSet.isBeforeFirst()) {
                while (resultSet.next()) {
                    serviceData.add(new Service(resultSet.getString("service_type"),
                            resultSet.getString("service_name"),
                            resultSet.getString("service_description"),
                            resultSet.getString("service_delivery_time"),
                            resultSet.getString("service_price"),
                            resultSet.getString("service_image_path")));
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return serviceData;
    }

}
 