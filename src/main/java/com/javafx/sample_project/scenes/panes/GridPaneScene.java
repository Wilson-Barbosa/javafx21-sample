package com.javafx.sample_project.scenes.panes;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public abstract class GridPaneScene {
    /*
     * A GridPane arranges nodes in a grid (matrix) formation. The nodes are placed
     * in the specified column and row indices.
     */
    public static GridPane createGridPaneExample() {

        // Creates an empty GridPane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Places nodes inside the matrix, I have to specify the row and columns
        // add() receives the node, column, row as arguments
        pane.add(new Label("First Name: "), 0, 0); 
        pane.add(new TextField(), 1, 0); 
        pane.add(new Label("Last Name: "), 0, 1);
        pane.add(new TextField(), 1, 1);

        Button button = new Button("Register name");
        pane.add(button, 0, 2);
        GridPane.setHalignment(button, HPos.RIGHT);

        return pane;
    }

}
