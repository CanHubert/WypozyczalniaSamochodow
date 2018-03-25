package View.Controllers.Display.Hires;

import View.Main;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class ReturnedController extends MenuController implements Initializable{
    public TextArea textArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        textArea.setText(db.getHires().PrintByStatus(false));
    }
}
