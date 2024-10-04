package com.javafx.sample_project;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

import java.io.IOException;

import com.javafx.sample_project.scenes.panes.BorderPaneScene;
import com.javafx.sample_project.scenes.panes.FlowPaneScene;
import com.javafx.sample_project.scenes.panes.GridPaneScene;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FlowPane flowPane = FlowPaneScene.createFlowPlaneExample();

        GridPane gridPane = GridPaneScene.createGridPaneExample();

        BorderPane borderPane = BorderPaneScene.createBorderPaneExample();

        // Creates a scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 200);
        stage.setTitle("Types of Panes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}