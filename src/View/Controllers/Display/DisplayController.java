package View.Controllers.Display;

import View.Controllers.MainMenuController;

import java.io.IOException;

public class DisplayController extends MainMenuController {

    public void DisplayUsers() throws IOException{
       route("Users/DisplayUsers.fxml");
    }

    public void DisplayVehicles() throws  IOException{
        route("Vehicles/VehiclesMenu.fxml");
    }
    public void DisplayHires() throws  IOException{
        route("Hires/HiresMenu.fxml");
    }

    public void route(String url1, String url2) throws IOException{
        super.route(url1+"../../Pages/Display/Users/"+ url2);

    }
    public void route(String url)throws IOException{
        super.route("../../Pages/Display/"+ url);
    }
}
