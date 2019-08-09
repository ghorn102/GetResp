package controllers;

import GetResp.Clipb;
import GetResp.OraDB;
import java.util.Arrays;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class MainScreenController {
    Clipb clipb= new Clipb();
    
    
    OraDB oraDB = new OraDB(); 
    

    
    
    private DummyScreenControler dummyScreenControler;
    
    public void setDummyScreenControler(DummyScreenControler dummyScreenControler) {
        this.dummyScreenControler = dummyScreenControler;
    }
    
    
    @FXML    
    AnchorPane anchorPane;
    
    @FXML
    private Button main_refresh;

    @FXML
    private Button main_go;

    @FXML
    private Button main_exit;

    @FXML
    private TableView<String> table;
    
    @FXML
    private TableColumn<String, String> codeColumn;

    @FXML
    private RadioButton radioButtonResp;

   

    @FXML
    private RadioButton radioButtonOpt;

    @FXML
    private RadioButton radioButtonNName;
    
   

    @FXML
    void OnActionNName(ActionEvent event) {

    }

    @FXML
    void OnActionOpt(ActionEvent event) {

    }

    @FXML
    void OnActionResp(ActionEvent event) {

    }
      @FXML
    void onACtion_mainRefresh(ActionEvent event) {

    }
    
    @FXML
    void OnAction_mainExit(ActionEvent event) {
        dummyScreenControler.loadExitScreen();
    }

    @FXML
    void onAction_mainGo(ActionEvent event) {
        
       String[] str= clipb.getClipboard();
       List<String> lista =Arrays.asList(str);
       
         oraDB.getDBData(lista);
        
    }

    

  
    public void initialize() { 
        
      
    
        
    }
    }

