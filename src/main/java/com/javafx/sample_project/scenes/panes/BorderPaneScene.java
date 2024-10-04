package com.javafx.sample_project.scenes.panes;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public abstract class BorderPaneScene {
    
    /*
     * A BorderPane can place nodes in five regions: top, bottom, left, right, and center, using
     * the setTop(node), setBottom(node), setLeft(node), setRight(node), and setCenter(node) methods.
     */
    public static BorderPane createBorderPaneExample(){

        BorderPane pane = new BorderPane();
        pane.setTop(new CustomPane("Top"));
        pane.setRight(new CustomPane("Right"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setLeft(new CustomPane("Left"));
        pane.setCenter(new CustomPane("Center"));

        return pane;

    } 

}

class CustomPane extends StackPane {

    public CustomPane(String title) {
        getChildren().add(new Label(title));
        setStyle("−fx−border−color: red");
    }

}
