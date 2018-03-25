package View.Controllers.Display.Vehicles;

import View.Main;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class AllByTypeController extends VehiclesMenuController implements Initializable{
    public TextArea textArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        textArea.setText(db.getVehicles().printByType());
    }
}
