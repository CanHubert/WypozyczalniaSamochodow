package View.Controllers.Display.Vehicles;

import Source.Exceptions.UserExistException;
import Source.Exceptions.VehicleExistException;
import View.Main;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchByIDController extends VehiclesMenuController {
    public Label msg;
    public TextField searchTF;

    public void searchByID(){
        try{
            int id = Integer.valueOf(searchTF.getText());
            msg.setText(db.getVehicles().printBySpecID(id,db));
        }catch (NumberFormatException e){
            msg.setText("Insert number value.");
        }catch (VehicleExistException e){
            msg.setText(e.toString());
        }

    }
}
