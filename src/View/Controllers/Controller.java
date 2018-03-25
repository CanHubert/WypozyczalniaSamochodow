package View.Controllers;

import Source.Application.IOFile;
import Source.Database.Database;
import View.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

abstract public class Controller {
    public Database db = Main.db;
    public int width = 500;
    public int height = 475;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void route(String url) throws IOException {
        Main.window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../Pages/"+url))));
    }

    public void route2(String url) throws IOException {
        Main.window.setScene(new Scene(FXMLLoader.load(getClass().getResource(url))));
    }
}
