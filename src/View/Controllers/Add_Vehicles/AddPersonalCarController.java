package View.Controllers.Add_Vehicles;

import Source.Vehicles.PersonalCar;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class AddPersonalCarController extends AddVehicleMenuController implements Initializable{
    public ChoiceBox<String> transsmissionBox;
    public TextField nameTF, milageTF;
    public Label msg;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        transsmissionBox.getItems().addAll("Manual", "Auto");
        transsmissionBox.setValue("Manual");
    }

    public void add(){
        try{
            String name = nameTF.getText();
            double milage = Double.valueOf(milageTF.getText());
            String transsmision = transsmissionBox.getValue();
            PersonalCar pc = new PersonalCar(name,milage,transsmision, db);
            db.getVehicles().add(pc);
            msg.setText("Personal Car added to database,  ID :"+pc.getID());
        }catch (NumberFormatException e){
            msg.setText("Insert number values");
        }

    }


}
