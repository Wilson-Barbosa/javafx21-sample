package com.javafx.sample_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    // private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        
        // Creates a circle 
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(80);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);

        // Create a pane to hold the circle inside
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        // Creates the scene that will hold the pane's circle
        Scene scene = new Scene(pane, 300, 200);

        // Configuring my scene and adding the panel to it
        stage.setTitle("Circle project");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}