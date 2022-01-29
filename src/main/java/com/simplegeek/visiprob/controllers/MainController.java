package com.simplegeek.visiprob.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	/*
	 * Begin control declaration 
	 */
	
	@FXML
	private TextField txtNumIn;
	
	@FXML
	private TextField txtNumOut;
	
	@FXML
	private Label lblOutput;
	
	/*
	 * End control declaration
	 */

	public void handleCalculateBtnClick() {
		System.out.println("The button was clicked!");
		
		String numIn = txtNumIn.getText();
		String numOut = txtNumOut.getText();
		
		lblOutput.setText("Probability is " + numIn + " out of " + numOut);
	}
	
	public void handleAddProbBtnClick() {
		
	}
	
}
