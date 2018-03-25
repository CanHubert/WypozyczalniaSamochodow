package View.Controllers.Add_Users;

import Source.Exceptions.TooShortNameException;
import Source.Users.User;
import View.Main;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AddUserController extends AddUserMenuController {
    public TextField usersNameTF;
    public Label Msg;


    public void SubmitNewUser(){
        try{
            User u = new User(usersNameTF.getText(), Main.db);
            Main.db.getUsers().add(u);
            Msg.setText("User successful added to database.\nYour ID : "+ (u.getId()));
        }catch (TooShortNameException e){
            Msg.setText(e.toString());
        }

    }



}
