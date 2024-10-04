package com.javafx.sample_project.scenes.panes;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public abstract class FlowPaneScene {

    /*
     * FlowPane arranges the nodes in the pane horizontally from left to right, or
     * vertically from top to bottom, in the order in which they were added.
     * When one row or one column is filled, a new row or column is started.
     */
    public static FlowPane createFlowPlaneExample() {

        // Creates an empty FlowPane
        FlowPane flowPane = new FlowPane();

        // adds padding and a little gap
        flowPane.setPadding(new Insets(5));
        flowPane.setHgap(4);
        flowPane.setVgap(4);

        // adds two inputs and their labels to this flowPane object (total of 4 nodes)
        flowPane.getChildren().addAll(
                new Label("First Name"),
                new TextField(),
                new Label("Last Name: "),
                new TextField());

        return flowPane;
    }

}
