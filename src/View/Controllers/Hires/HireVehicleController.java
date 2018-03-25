package View.Controllers.Hires;

import Source.Exceptions.DuplicateVehicleHireException;
import Source.Exceptions.UserExistException;
import Source.Exceptions.VehicleExistException;
import Source.Exceptions.VehicleOnStockException;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HireVehicleController extends HiresController {
    public Label msg;
    public TextField userID, vehicleID;

    public void hireVeh(){

        try{
            int uID = Integer.valueOf(userID.getText());
            int vID = Integer.valueOf(vehicleID.getText());
            final int day = 7;
            db.getHires().HireAVehicle(uID,vID,day,db);
            msg.setText("User ("+db.getUsers().getUserbyID(uID).toString2()+") hired ("+db.getVehicles().getVehicleByID(vID).toString2()+")");
        }catch (UserExistException |
                VehicleExistException |
                DuplicateVehicleHireException |
                VehicleOnStockException e){
            msg.setText(e.toString());
        }catch (NumberFormatException e){
            msg.setText("Insert number values.");
        }
    }

}
