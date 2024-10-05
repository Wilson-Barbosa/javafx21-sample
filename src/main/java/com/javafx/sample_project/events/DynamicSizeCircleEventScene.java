package com.javafx.sample_project.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public abstract class DynamicSizeCircleEventScene {

    public Scene createDynamicCircleScene() {

        // Creates a circle and set its properties
        CirclePane circlePane = new CirclePane();

        // Creates two buttons on a VBox pane
        VBox box = new VBox(3);
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);

        Button shrinkButton = new Button("Click to shrink the circle");
        

        Button enlargeButton = new Button("Click to enlarge the circle");

        // Adds all nodes to the pane
        box.getChildren().addAll(circlePane, shrinkButton, enlargeButton);

        // adds the box to a scene object
        Scene scene = new Scene(box, 400, 400);

        return scene;
    }

    // Class that models a circle inside a pane that can be resized
    class CirclePane extends StackPane {

        private Circle circle = new Circle(50);

        // Create a default Circle inside a pane
        public CirclePane() {
            circle.setFill(Color.AZURE);
            circle.setStroke(Color.BLUE);
            this.getChildren().add(circle);
        }

        // add a shrink method
        public void shrinkCircle() {
            if (circle.getRadius() > 2) {
                this.circle.setRadius(circle.getRadius() - 2);
            }
        }

        // add an enlarge method
        public void enlargeCircle() {
            this.circle.setRadius(circle.getRadius() + 2);
        }

    }

    // Enlarge EventHandler
    class EnlargeEventHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {
            circleenlargeCircle();
        }

    }

    // Shrink EventHandler
    class ShrinkEventHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {
            shrinkCircle();
        }

    }

}
