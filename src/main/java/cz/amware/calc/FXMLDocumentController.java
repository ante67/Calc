package cz.amware.calc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private ComboBox<String> cmb1;
    @FXML
    private Button cmd1;
    @FXML
    private Label lbl1;
        
    @FXML
    private void handleVypocitejButtonAction(ActionEvent event) {
        double cislo1 = Double.parseDouble(txt1.getText());
        double cislo2 = Double.parseDouble(txt2.getText());
        String operace = (String)cmb1.getSelectionModel().getSelectedItem();
        double vysledek = 0;
        switch (operace)
            {
            case "+":
                vysledek = cislo1 + cislo2;
                break;
            case "-":
                vysledek = cislo1 - cislo2;
                break;
            case "*":
                vysledek = cislo1 * cislo2;
                break;
            case "/":
                if (cislo2 != 0)
                    vysledek = cislo1 / cislo2;
                    break;
            }
        lbl1.setText(String.valueOf(vysledek));
        
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //
        ObservableList<String> operace = FXCollections.observableArrayList("+", "-", "*", "/");
        cmb1.setItems(operace);
        cmb1.getSelectionModel().selectFirst();
    }
    
    

}