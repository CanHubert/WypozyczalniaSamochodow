package Source.Application;

import Source.Database.Database;
import Source.Hires.Hires;
import Source.Users.Users;
import Source.Vehicles.Vehicles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class IOFile implements Serializable{

    public static Database loadFile(String nazwaPliku) throws IOException, ClassNotFoundException {

        if (!Files.exists(Paths.get(nazwaPliku))) {
            return new Database(new Users(),new Hires(),new Vehicles(),1,1,1);

        } else {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(nazwaPliku));
            Database db = (Database) in.readObject();
            in.close();
            return db;
        }
    }
    public static void saveFile(String nazwaPliku, Database db) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nazwaPliku));
        out.writeObject(db);
        out.close();
        System.out.println("Zapisano do pliku");

    }
}
