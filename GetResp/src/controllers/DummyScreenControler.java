package controllers;

import GetResp.OraDB;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class DummyScreenControler {
   public  OraDB oraDB= new OraDB();

    @FXML
    private StackPane dummyScreen;
    @FXML 
    public void initialize() {
        loadLoginScreen();
         
}
   
    public void setScreen (AnchorPane anchorPane){
        dummyScreen.getChildren().clear();
        dummyScreen.getChildren().add(anchorPane);
    }
    
     public void loadExitScreen (){
        
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/Exit.fxml"));
        AnchorPane anchorPane =null;
        try {
            anchorPane = loader.load();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ExitController exitController = loader.getController();
        exitController.setDummyScreenControler(this);
        setScreen(anchorPane);
        
    }
     public void loadLoginScreen(){
        
FXMLLoader loader = new FXMLLoader (this.getClass().getResource("/fxml/Login.fxml"));

AnchorPane anchorPane = null;
        try {
           anchorPane = loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
           // Logger.getLogger(DummyScreenControler.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        LoginController loginController = loader.getController();      
        loginController.setDummyScreenControler(this);
        
               
        setScreen(anchorPane);
        
         
    }
     public void loadMainScreen(){
         FXMLLoader loader = new FXMLLoader (this.getClass().getResource("/fxml/MainScreen.fxml"));

       AnchorPane anchorPane = null;
        try {
           anchorPane = loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
           // Logger.getLogger(DummyScreenControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        MainScreenController mainScreenController = loader.getController();
        mainScreenController.setDummyScreenControler(this);
        setScreen(anchorPane);
        
         
         
     }
     
     }
        
