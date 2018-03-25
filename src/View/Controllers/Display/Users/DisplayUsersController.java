package View.Controllers.Display.Users;

import View.Controllers.Display.DisplayController;
import View.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class DisplayUsersController extends DisplayController {

    public void DisplayAllUsers() throws IOException{
        route2("../../../Pages/Display/Users/AllUsers.fxml");
    }

    public void displayWithVehicles() throws IOException{
        route2("../../../Pages/Display/Users/Withvehicle.fxml");
    }

    public void displayWithoutVehicles() throws IOException{
        route2("../../../Pages/Display/Users/WithoutVehicle.fxml");
    }

    public void displayByID() throws IOException{
        route2("../../../Pages/Display/Users/ByID.fxml");
    }

    public void back() throws IOException{
        route2("../../../Pages/Display/Display.fxml");
    }

}
