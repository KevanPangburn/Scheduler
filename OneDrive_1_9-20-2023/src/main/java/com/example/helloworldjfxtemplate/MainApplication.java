package com.example.helloworldjfxtemplate;

import com.example.helloworldjfxtemplate.helper.JDBC;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Main View!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        JDBC.makeConnection();
        launch();
        JDBC.closeConnection();
    }
}