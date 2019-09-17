package com.ti;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Stream ciphers");
        primaryStage.setMaximized(false);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("file:icon.png"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        InputOutputController inputOutputController = new InputOutputController("input.txt", "output.txt");
        inputOutputController.init();
    }
}
