package View.Controllers;

import View.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

abstract public class Controller {

    public void route(String url) throws IOException {
        Main.window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../Pages/"+url))));
    }

    public void route2(String url) throws IOException {
        Main.window.setScene(new Scene(FXMLLoader.load(getClass().getResource(url))));
    }
}
