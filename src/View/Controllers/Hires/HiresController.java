package View.Controllers.Hires;

import View.Controllers.MainMenuController;

import java.io.IOException;

public class HiresController extends MainMenuController {

    public void hire() throws IOException{
        route2("../../Pages/Hires/HireVehicle.fxml");
    }

    public void returnVehicle() throws IOException{
        route2("../../Pages/Hires/ReturnVehicle.fxml");
    }

    public void back() throws  IOException{
        route2("../../Pages/Hires/Hires.fxml");
    }
}
