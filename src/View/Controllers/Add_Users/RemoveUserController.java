package View.Controllers.Add_Users;

import Source.Exceptions.HasVehicleException;
import Source.Exceptions.UserExistException;
import Source.Users.User;
import View.Main;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class RemoveUserController extends AddUserMenuController {
    public TextField idTF;
    public Label Msg;


    public void removeUserButton(){
        int id = Integer.valueOf(idTF.getText());
        User user = db.getUsers().getUserbyID(id);
        try {db.getUsers().remove(user,db);
            Msg.setText("User with ID "+id+" removed from database.");
        } catch (UserExistException|HasVehicleException e) {
            Msg.setText(e.toString());
        }
    }


}
