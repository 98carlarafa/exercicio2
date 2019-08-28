/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3_3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class Aula3_3Controller implements Initializable {

    @FXML
    private CheckBox checkBox1;
    @FXML
    private CheckBox checkBox2;
    @FXML
    private CheckBox checkBox3;
    @FXML
    private CheckBox checkBox4;
    @FXML
    private RadioButton radio1;
    @FXML
    private RadioButton radio2;
    @FXML
    private RadioButton radio3;
    @FXML
    private TextArea textAreaOpiniao;
    @FXML
    private Label labelRespostas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pegarDados(ActionEvent event) {
        
        String m = "";
        String n = "";
        
         //Para verificar se um radioButton está selecionado
        //utiliza-se o método isSlected()
        if(radio1.isSelected()){
            //getText também retorna do texto do radio
            m = "\n" + radio1.getText();
        }
        
        if(radio2.isSelected()){
            //getText também retorna do texto do radio
            m = "\n" + radio2.getText();
        }
        
        if(radio3.isSelected()){
            //getText também retorna do texto do radio
            m = "\n" + radio3.getText();
        }           
        
         //Com o elemento checkBox nós temos que verificar individiulmente
        //se o mesmo está ou não selecionado
        
        //o método isSelected() diz se o
        //checkBox está ou não selecionado  
        if(checkBox1.isSelected()){
            //getText retorna o text do checkBox
            m += "\n" + checkBox1.getText();
        }
        
        if(checkBox2.isSelected()){
            //getText retorna o text do checkBox
            m += "\n" + checkBox2.getText();
        }
        
        if(checkBox3.isSelected()){
            //getText retorna o text do checkBox
            m += "\n" + checkBox3.getText();
        }
        
        if(checkBox4.isSelected()){
            //getText retorna o text do checkBox
            m += "\n" + checkBox4.getText();
        }    
               
        //Pegar o texto do textArea
        m += "\n" + textAreaOpiniao.getText();
        
        labelRespostas.setText(m);   
         
    }
}
    
