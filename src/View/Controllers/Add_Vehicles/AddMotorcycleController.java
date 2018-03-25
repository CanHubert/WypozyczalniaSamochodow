package View.Controllers.Add_Vehicles;

import Source.Vehicles.Motorcycle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddMotorcycleController extends AddVehicleMenuController {
    public Label msg;
    public TextField nameTF, millageTF, weightTF;

    public void add(){
        try{
            String name = nameTF.getText();
            double milage = Double.valueOf(millageTF.getText());
            double weight = Double.valueOf(weightTF.getText());
            Motorcycle m = new Motorcycle(name,milage,weight,db);
            db.getVehicles().add(m);
            msg.setText("Motorcycle added to database,  ID :"+m.getID());
        }catch (NumberFormatException e){
            msg.setText("Insert number values");
        }

    }
}
