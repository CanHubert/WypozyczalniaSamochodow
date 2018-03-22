package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
//    static public Parent root;
//    static public Scene scene;
    static public Stage window;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Pages/MainMenu.fxml"));
        Scene scene = new Scene(root);
        window.setTitle("Menu");
        window.setScene(scene);
        window.show();
    }
}
