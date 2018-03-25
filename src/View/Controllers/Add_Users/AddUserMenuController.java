package View.Controllers.Add_Users;

import View.Controllers.MainMenuController;

import java.io.IOException;

public class AddUserMenuController extends MainMenuController {

    public void AddNewUser() throws  IOException{
        route2("../../Pages/Add_Users/AddUser.fxml");
    }

    public void removeUser() throws IOException{
        route2("../../Pages/Add_Users/RemoveUser.fxml");
    }
    public void back() throws IOException{
        route2("../../Pages/Add_Users/Add_User_Menu.fxml");
    }



}
