package View.Controllers.Hires;

import Source.Exceptions.NoHiredVehicleException;
import Source.Exceptions.UserExistException;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReturnVehicleController extends  HiresController {
    public Label msg;
    public TextField idTF;

    public void returnVehicle(){
        int idUser;
       try{
           idUser = Integer.valueOf(idTF.getText());
           db.getHires().returnVehicle(idUser,db);
           msg.setText("Vehicle successfully returned.");
       }catch (UserExistException | NoHiredVehicleException e){
           msg.setText(e.toString());

       }catch (NumberFormatException e){
           msg.setText("Insert number value.");
       }


    }

}
