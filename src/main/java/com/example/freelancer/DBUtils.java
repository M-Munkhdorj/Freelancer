package com.example.freelancer;

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
    public static void changeScene(ActionEvent event, String fxmlFile, String title, String username, String email){
        Parent root = null;
        if (username != null && email != null) {
            try {
                FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(fxmlFile));
                root = loader.load();
                MainController mainSceneController = loader.getController();
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

    public static void signUpUser(ActionEvent event,String email,String username,String password) {
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psCheckUserExists = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/freelancer", "root", "root");
            psCheckUserExists = connection.prepareStatement("SELECT * FROM users WHERE username=?");
            psCheckUserExists.setString(1,username);
            resultSet = psCheckUserExists.executeQuery();
            if (resultSet.isBeforeFirst()) {
                System.out.println("User already exists");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("You cannot use this username");
                alert.show();
            } else {
                psInsert = connection.prepareStatement("INSERT INTO users(username,password,email) VALUES(?,?,?)");
                psInsert.setString(1,username);
                psInsert.setString(2,password);
                psInsert.setString(3,email);
                psInsert.executeUpdate();

                try{
                    FXMLLoader fxmlLoader = new FXMLLoader(DBUtils.class.getResource("log-in.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setTitle("Monson University");
                    stage.setScene(scene);
                    stage.show();
                    System.out.println("Successfully registered");
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setContentText("Successfully registered");
                    alert.show();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
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

    public static void logInUser(ActionEvent event, String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/freelancer", "root", "root");
            preparedStatement = connection.prepareStatement("SELECT password, email FROM users WHERE username=?");
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            if (!resultSet.isBeforeFirst()) {
                System.out.println("User not found");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Provided credentials are incorrect");
                alert.show();
            } else {
                while (resultSet.next()) {
                    String retrievedPassword = resultSet.getString("password");
                    String retrievedEmail = resultSet.getString("email");
                    if (retrievedPassword.equals(password)) {
                        changeScene(event, "navbar.fxml", "Welcome", username, retrievedEmail);
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
}
 