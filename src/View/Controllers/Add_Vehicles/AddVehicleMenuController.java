package View.Controllers.Add_Vehicles;

import View.Controllers.MainMenuController;

import java.io.IOException;

public class AddVehicleMenuController extends MainMenuController {

    public void addTruck() throws IOException{
        route2("../../Pages/Add_Vehicles/AddTruck.fxml");
    }
    public void addPersonalCar() throws  IOException{
        route2("../../Pages/Add_Vehicles/AddPersonalCar.fxml");
    }
    public void addMotorcycle() throws IOException{
        route2("../../Pages/Add_Vehicles/AddMotorcycle.fxml");
    }

    public void removeVehicle() throws IOException{
        route2("../../Pages/Add_Vehicles/RemoveVehicle.fxml");
    }

    public void back() throws IOException{
        route2("../../Pages/Add_Vehicles/AddVehicleMenu.fxml");
    }
}
