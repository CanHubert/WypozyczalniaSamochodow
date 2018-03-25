package View;

import Source.Application.IOFile;
import Source.Database.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
//    static public Parent root;
//    static public Scene scene;
    static public Stage window;
    static public Database db;
    final String file_name= "data.dat";

    public static void main(String[] args) {
        launch(args);
        try{
            IOFile.saveFile("data.dat",db);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        db = IOFile.loadFile(file_name);
        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Pages/MainMenu.fxml"));
        Scene scene = new Scene(root);
        window.setTitle("Menu");
        window.setScene(scene);
        window.show();
    }
}
