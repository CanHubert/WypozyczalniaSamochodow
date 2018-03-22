package View.Controllers.Display;

import View.Controllers.MainMenuController;

import java.io.IOException;

public class DisplayController extends MainMenuController {

    public void DisplayUsers() throws IOException{
       route("DisplayUsers.fxml");
    }

    public void route(String url1, String url2) throws IOException{
        super.route(url1+"../../Pages/Display/Users/"+ url2);

    }
    public void route(String url)throws IOException{
        super.route("../../Pages/Display/Users/"+ url);
    }
}
