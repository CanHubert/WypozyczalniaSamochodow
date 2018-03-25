package View.Controllers.Add_Vehicles;

import Source.Vehicles.Truck;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddTruckController extends AddVehicleMenuController {
    public Label msg;
    public TextField nameTF, milageTF, loadTF;

    public void add(){

        try{
            String name = nameTF.getText();
            double milage = Double.valueOf(milageTF.getText());
            int load = Integer.valueOf(loadTF.getText());
            Truck t = new Truck(name,milage,load,db);
            db.getVehicles().add(t);
            msg.setText("Truck added to database,  ID :"+t.getID());
        }catch (NumberFormatException e){
            msg.setText("Insert number values");
        }

    }
}
