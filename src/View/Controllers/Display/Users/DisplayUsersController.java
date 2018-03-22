package View.Controllers.Display.Users;

import View.Controllers.Display.DisplayController;
import View.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class DisplayUsersController extends DisplayController {

    public void DisplayAllUsers() throws IOException{
       //route("../", "AllUsers.fxml");
       // route("../../../Pages/Display/Users/AllUsers.fxml");
        Main.window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../../../Pages/Display/Users/AllUsers.fxml"))));
    }
}
