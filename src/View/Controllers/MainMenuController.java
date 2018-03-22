package View.Controllers;



import View.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class MainMenuController extends Controller{

    public void AddUserButton() throws IOException{
         route("Add_Users/Add_User.fxml");
    }

    public void AddVehicleButton() throws IOException{
        route("Add_Vehicles/AddVehicle.fxml");
    }

    public void HiresButton() throws IOException{
        route("Hires/Hires.fxml");
    }

    public void DisplayButton() throws IOException{
        route("Display/Display.fxml");
    }

    public void MainMenuButton() throws IOException{
        Main.window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../../Pages/MainMenu.fxml"))));
    }




}
