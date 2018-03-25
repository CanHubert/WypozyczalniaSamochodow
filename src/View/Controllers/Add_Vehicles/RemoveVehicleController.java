package View.Controllers.Add_Vehicles;

import Source.Exceptions.VehicleExistException;
import Source.Exceptions.VehicleOnStockException;
import Source.Vehicles.Vehicle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RemoveVehicleController extends AddVehicleMenuController {
    public Label msg;
    public TextField idTF;

    public void remove(){
        int id = Integer.valueOf(idTF.getText());
        Vehicle v = db.getVehicles().getVehicleByID(id);
        try{
            db.getVehicles().remove(v,db);
            msg.setText("Vehicle with ID "+id+" removed from database");
        } catch (NumberFormatException e){
            msg.setText("Insert number values");
        }catch (VehicleOnStockException |VehicleExistException e){
            msg.setText(e.toString());
        }
    }


}
