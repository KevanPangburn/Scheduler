package com.example.Scheduling.controller;

import com.example.Scheduling.helper.JDBC;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private Label welcomeText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        welcomeText.setText(JDBC.connectionStatus);
    }
}