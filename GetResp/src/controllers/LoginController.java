package controllers;

import GetResp.OraDB;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class LoginController {
    
    private DummyScreenControler dummyScreenControler;    
    

    public void setDummyScreenControler(DummyScreenControler dummyScreenControler) {
        this.dummyScreenControler = dummyScreenControler;
    }
    
    private OraDB oraDB = new OraDB();
    
    
    
    @FXML
            private StackPane stackPane;

    
    
     
   public String login;
   public  String password;
   

    @FXML
    private TextField loginString;

    @FXML
    private PasswordField passwordString;

    @FXML
    private Button buttonExit;

    @FXML
    private Button buttonLogin;

    @FXML
    private CheckBox remember;

    @FXML
    private Label label;

    @FXML
    void onActionExit() {
        
        dummyScreenControler.loadExitScreen();
    }

    @FXML
    void onActionLoginButton() {
        
        
        oraDB.setLogin(loginString.getText());
        oraDB.setPassword(passwordString.getText());
        
        String status=oraDB.connection(); 
        System.out.println(status);
        if(status.equals("Connection OK")){
            
         
        
        dummyScreenControler.loadMainScreen();
        
        }
        else { label.setText("login failed");}
        


    }

    @FXML
    void onActionLoginString() {
        

    }

    @FXML
    void onActionPasswordString() {
        

    }
    @FXML
void initialize(){
  
      
      boolean odbc = oraDB.testing_driver();
if(odbc){
    label.setText("ODBC OK");
}else{
    
    label.setText("ODBC NOK");
    
}
}
}