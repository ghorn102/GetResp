package controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class ExitController {
    
    
    private DummyScreenControler dummyScreenControler;

    public void setDummyScreenControler(DummyScreenControler dummyScreenControler) {
        this.dummyScreenControler = dummyScreenControler;
    }

    @FXML
    private Button exit_yes;

    @FXML
    private Button exit_no;

    @FXML
    void onActionExit_no(ActionEvent event) {       
         
        
        dummyScreenControler.loadMainScreen();
        

    }

    @FXML
    void onActionExit_yes(ActionEvent event) {
        System.exit(0);

    }

}

