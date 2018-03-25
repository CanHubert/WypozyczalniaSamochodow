package View.Controllers.Display.Hires;

import View.Controllers.Display.DisplayController;

import java.io.IOException;

public class MenuController extends DisplayController {

    public void allHires() throws IOException{
        route2("../../../Pages/Display/Hires/All.fxml");

    }
    public void hired() throws IOException{
        route2("../../../Pages/Display/Hires/Hired.fxml");
    }
    public void returned() throws IOException{
        route2("../../../Pages/Display/Hires/Returned.fxml");
    }

    @Override
    public void DisplayHires() throws IOException {
        route2("../../../Pages/Display/Display.fxml");
    }

    public void back() throws IOException{
        route2("../../../Pages/Display/Hires/HiresMenu.fxml");
    }
}
