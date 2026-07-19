package com.anhtong.quizappv1;

import com.anhtong.utils.MyAlertSingleton;
import com.anhtong.utils.themes.ThemeTypes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    public void manageQuestion(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("comming soon");
    }
    
    public void practice (ActionEvent e){
        
    }
    
    public void exam (ActionEvent e){
        
    }
    
    public void changeThemes(ActionEvent e){
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
    
}
