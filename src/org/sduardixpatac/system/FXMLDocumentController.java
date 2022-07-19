package org.sduardixpatac.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author sduar
 */
public class FXMLDocumentController implements Initializable {
    double dato1=0,dato2=0, resultado=0;
    int op = 0;
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
    @FXML private Button btnMas;
    @FXML private Button btnMenos;
    @FXML private Button btnPor;
    @FXML private Button btnDiv;
    @FXML private Button btnIgual;
    @FXML private Button btnC;
    @FXML private Button btnCE;
    @FXML private Button btnPunto;
    @FXML private Button btnRaiz;
    @FXML private Button btnAbs;
    @FXML private Button btnXY;
    @FXML private Button btnPorcent;
    @FXML private Button btnMasMenos;
    @FXML private TextField txtPantalla;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource()==btnCero)
            txtPantalla.setText(txtPantalla.getText()+"0");
        else if (event.getSource()==btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if (event.getSource() ==btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        else if (event.getSource()==btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        else if (event.getSource()==btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+"4");
        else if (event.getSource()==btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        else if (event.getSource()==btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        else if (event.getSource()==btnSiete)
            txtPantalla.setText(txtPantalla.getText()+"7");
        else if (event.getSource()==btnOcho)
            txtPantalla.setText(txtPantalla.getText()+"8");
        else if (event.getSource()==btnNueve)
            txtPantalla.setText(txtPantalla.getText()+"9");
        else if (event.getSource()==btnC){
            dato1= 0;
            dato2= 0;
            resultado= 0;
            txtPantalla.clear();
        }
        else if(event.getSource()==btnCE){
            txtPantalla.clear();
        }
        else if(event.getSource()== btnRaiz){
            dato1= Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            resultado=Math.sqrt(dato1);
            txtPantalla.setText(String.valueOf(resultado));
        }
        else if (event.getSource()== btnMasMenos){
            if (Double.parseDouble(txtPantalla.getText())>0)
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));
            else
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));
        }
        else if (event.getSource()==btnPorcent){
            dato2=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            resultado= dato1*dato2/100;
            txtPantalla.setText(String.valueOf(resultado));
        }
        else if(event.getSource()==btnPunto){
            if (txtPantalla.getText()!=null){
            txtPantalla.setText(txtPantalla.getText()+".");
            btnPunto.setDisable(true);
            } else {
                txtPantalla.setText("0.");
            }   
        }
        else if (event.getSource()==btnAbs){
            if(Double.parseDouble(txtPantalla.getText())>0)
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*1));
            else
              txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));  
        }
        else if (event.getSource()==btnMas){
            dato1 =Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 1;
            btnPunto.setDisable(false);
        }
        else if (event.getSource()==btnMenos){
            dato1 =Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 2;
            btnPunto.setDisable(false);
        }
        else if (event.getSource()==btnPor){
            dato1 =Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 3;
            btnPunto.setDisable(false);
        }
        else if (event.getSource()==btnDiv){
            dato1 =Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 4;
            btnPunto.setDisable(false);
        }
        else if(event.getSource()== btnXY){
            dato1= Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op= 5;
        }
        else if (event.getSource()== btnIgual){
            dato2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            switch (op){
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
                        resultado = Math.pow(dato1 , dato2);
                        txtPantalla.setText(String.valueOf(resultado));
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
