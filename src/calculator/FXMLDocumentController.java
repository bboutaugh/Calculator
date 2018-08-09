/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author bradb
 */
public class FXMLDocumentController implements Initializable 
{

@FXML
AnchorPane anchorPane;

//Calculator display and respective pane
@FXML
VBox displayBox;
@FXML
TextArea mathDisplay;
        
        
//Pane and respective number and operand buttons
@FXML
GridPane mathButtonPane;
@FXML
Button zeroNumButton;
@FXML
Button oneNumButton;
@FXML
Button twoNumButton;
@FXML
Button threeNumButton;
@FXML
Button fourNumButton;
@FXML
Button fiveNumButton;
@FXML
Button sixNumButton;
@FXML
Button sevenNumButton;
@FXML
Button eightNumButton;
@FXML
Button nineNumButton;
@FXML
Button addButton;
@FXML
Button subtractButton;
@FXML
Button divideButton;
@FXML
Button multiplyButton;

//Key function buttons for calculator
@FXML
HBox functionButtonBox;
@FXML
Button calculateButton;
@FXML
Button clearButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
}//Controller End
