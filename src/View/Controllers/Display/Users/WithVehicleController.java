package View.Controllers.Display.Users;

import View.Main;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WithVehicleController  extends DisplayUsersController implements Initializable{
    public TextArea textArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        textArea.setText(Main.db.getUsers().printByVehicle(db,true));
    }

    public void back() throws IOException {
        route2("../../../Pages/Display/Users/DisplayUsers.fxml");
    }
}
