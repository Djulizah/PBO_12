import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class MainSceneController {

    @FXML
    private CheckBox Airputih;

    @FXML
    private CheckBox Coffe;

    @FXML
    private CheckBox Thaitea;

    @FXML
    private CheckBox mienaga;

    @FXML
    private CheckBox nasgor;

    @FXML
    private TextField price;

    @FXML
    private CheckBox sayurrumput;

    @FXML
    void cekharga(ActionEvent event) {

    if(Airputih.isSelected()){
            price.setText("100.000");
        }else if(Coffe.isSelected()){
            price.setText("500.000");
        }else if(Thaitea.isSelected()){
            price.setText("600.000");
        }else if(mienaga.isSelected()){
            price.setText("1.500.000");
        }else if(nasgor.isSelected()){
            price.setText("500.000");    
        }else if(sayurrumput.isSelected()){
            price.setText("free");
        }else{price.setText(" Total Harga ");}
        
    if(sayurrumput.isSelected() && Airputih.isSelected()){
            price.setText("100.000");
        }else if(sayurrumput.isSelected() && Thaitea.isSelected()){
            price.setText("600.000");
        }else if(sayurrumput.isSelected() && Coffe.isSelected()){
            price.setText("500.000");
        }else if(mienaga.isSelected() && Airputih.isSelected()){
            price.setText("1.600.000");
        }else if(mienaga.isSelected() && Coffe.isSelected()){
            price.setText("2.000.000");
        }else if(mienaga.isSelected() && Thaitea.isSelected()){
            price.setText("2.100.000");
        }else if(nasgor.isSelected() && Airputih.isSelected()){
            price.setText("600.000");
        }else if(nasgor.isSelected() && Coffe.isSelected()){
            price.setText("1.000.000");
        }else if(nasgor.isSelected() && Thaitea.isSelected()){
            price.setText("1.100.000");
        }
    }
}