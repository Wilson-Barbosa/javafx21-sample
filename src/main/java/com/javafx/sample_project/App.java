package com.javafx.sample_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.javafx.sample_project.events.DynamicSizeCircleEventScene;
import com.javafx.sample_project.events.TwoButtonEventScene;



/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Scene scene = DynamicSizeCircleEventScene.createDynamicCircleScene();

        stage.setTitle("Event Driven Programming");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}