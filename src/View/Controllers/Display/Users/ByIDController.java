package View.Controllers.Display.Users;

import Source.Exceptions.UserExistException;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ByIDController extends DisplayUsersController {
    public Label msg;
    public TextField searchTF;

    public void searchByID(){
        try{
            int id = Integer.valueOf(searchTF.getText());
            msg.setText(db.getUsers().printByID(id,db));
        }catch (NumberFormatException e){
            msg.setText("Insert number value.");
        }catch (UserExistException e){
            msg.setText(e.toString());
        }

    }
}
