package Source.Application;



import Source.Database.Database;

import java.io.IOException;



public class Application {
    public static void main(String[] args) throws  IOException, ClassCastException {
        try {
            run();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error 404");

        }}

        // gabi
    private static void  run() throws  IOException, ClassNotFoundException {
        final String file_name= "data.dat";
        Database db = IOFile.loadFile(file_name);
        Menu.menu(db);
        IOFile.saveFile(file_name,db);
    }

}
