package net.marioosh.fx.controller;

import java.util.UUID;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SimpleController {
	
	@FXML private Button button;
	@FXML private TextField text;
	
	@FXML protected void onClick(ActionEvent event) {
        text.setText(UUID.randomUUID().toString());
    }	
}
