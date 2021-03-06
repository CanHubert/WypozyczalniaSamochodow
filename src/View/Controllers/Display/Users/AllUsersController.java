package View.Controllers.Display.Users;
import Source.Database.Database;

import View.Controllers.Display.Users.DisplayUsersController;
import View.Main;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AllUsersController extends DisplayUsersController implements Initializable{
    public TextArea textArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        textArea.setText(Main.db.getUsers().toString());
    }

    public void back() throws IOException{
        route2("../../../Pages/Display/Users/DisplayUsers.fxml");
    }
}
