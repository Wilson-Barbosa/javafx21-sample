package com.javafx.sample_project.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public abstract class TwoButtonEventScene {
    
    // create a scene 
    public static Scene createSimpleTwoButtonScene(){

        // Creates the nodes
        Text text = new Text("The message will be printed on the terminal");
        Button confirmButton = new Button("Confirm");
        Button cancelButton = new Button("Cancel");

        // Maps the confirm button to its appropriate event handler
        ConfirmHandlerClass confirmHandler = new ConfirmHandlerClass(); // creates an instance of the handler
        confirmButton.setOnAction(confirmHandler); // binds the event to this button

        // Maps the cancel button to its appropriate event handler
        CancelHandlerClass cancelHandler = new CancelHandlerClass(); // creates an instance of the handler
        cancelButton.setOnAction(cancelHandler); // binds the event to this button

        // The nodes will be stored here
        VBox box = new VBox(3);
        box.setAlignment(Pos.CENTER); // aligns the content in the center
        box.getChildren().addAll(text, confirmButton, cancelButton);

        // Creates the scene and adds the box to it
        Scene scene = new Scene(box, 500, 500);

        return scene;
    }



}

// EventHandler for the confirm button
class ConfirmHandlerClass implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) { // an event handler must implement this method
        System.out.println("Confirm Button clicked!");
    }

}

// EventHandler for the cancel button
class CancelHandlerClass implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent e) {
        System.out.println("Cancel button was clicked");
    }
    

}