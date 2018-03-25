package View.Controllers.Display.Vehicles;

import View.Controllers.Display.DisplayController;

import java.io.IOException;

public class VehiclesMenuController extends DisplayController{

    public void AllByID() throws IOException{
        route2("../../../Pages/Display/Vehicles/AllByID.fxml");
    }

    public void AllByType() throws IOException{
        route2("../../../Pages/Display/Vehicles/AllByType.fxml");
    }

    public void SearchByID() throws IOException{
        route2("../../../Pages/Display/Vehicles/SearchID.fxml");
    }

    public void back() throws  IOException{
        route2("../../../Pages/Display/Vehicles/VehiclesMenu.fxml");
    }

    @Override
    public void DisplayVehicles() throws IOException {
        route2("../../../Pages/Display/Display.fxml");
    }
}
