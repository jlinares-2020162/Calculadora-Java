/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javierlinares.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author famli
 */
public class FXMLDocumentController implements Initializable {
    double dato1 = 0, dato2 = 0, resultado = 0;
    int op;
    @FXML private TextField txtPantalla;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnMasMenos;
    @FXML private Button btnC;
    @FXML private Button btnCE;
    @FXML private Button btnCero;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnSuma;
    @FXML private Button btnResta;
    @FXML private Button btnMultiplicar;
    @FXML private Button btnDividir;
    @FXML private Button btnRaiz;
    @FXML private Button btnPotencia;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnValorAbsoluto;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event){
        
        //Numeros
        
        if (event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if (event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        else if (event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        else if (event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+"4");
        else if (event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        else if (event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        else if (event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText()+"7");
        else if (event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText()+"8");
        else if (event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText()+"9");
        else if (event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText()+"0");
        
        //Operaciones
        
        else if (event.getSource() == btnSuma){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 1;
        }
        else if (event.getSource() == btnResta){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 2;
        }
        else if (event.getSource() == btnMultiplicar){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 3;
        }
        else if (event.getSource() == btnDividir){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 4;
        }
        else if (event.getSource() == btnRaiz){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            resultado = Math.sqrt(dato1);
            txtPantalla.setText(String.valueOf(resultado));
        }
        else if (event.getSource() == btnPotencia){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 5;
        }
        
        //Porcentaje
        else if (event.getSource() == btnPorcentaje){
            dato2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            resultado = dato1*dato2/100;
            txtPantalla.setText(String.valueOf(resultado));
        }
        
        //Más Menos
        else if (event.getSource() == btnMasMenos){
            if (Double.parseDouble(txtPantalla.getText()) > 0)
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));
            else
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));
        }
        
        //Valor Absoluto
        else if (event.getSource() == btnValorAbsoluto){
            if (Double.parseDouble(txtPantalla.getText()) > 0)
               txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*1));
            else
               txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));
        }
        
        //Punto
        else if (event.getSource() == btnPunto){
            if (txtPantalla.getText().length()<=0)
                txtPantalla.setText("0.");
            else if (!(txtPantalla.getText().contains(".")))
                txtPantalla.setText(txtPantalla.getText()+".");
        }
        
        //Borrar
        else if (event.getSource() == btnC){
            dato1 = 0;
            dato2 = 0;
            resultado = 0;
            txtPantalla.clear();
        }
        else if (event.getSource() == btnCE)
            txtPantalla.clear(); 
        
        
        //Igual
        
        else if (event.getSource() == btnIgual){
            dato2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            switch(op){
                case 1:
                    resultado = dato1 + dato2;
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
                case 2:
                    resultado = dato1 - dato2;
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
                case 3:
                    resultado = dato1 * dato2;
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
                case 4:
                    resultado = dato1 / dato2;
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
                case 5:
                    resultado = Math.pow(dato1,dato2);
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
            }    
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
