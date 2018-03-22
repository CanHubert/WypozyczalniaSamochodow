package Source.Database;
import Source.Users.Users;
import Source.Hires.Hires;

import Source.Vehicles.Vehicles;

import java.io.Serializable;

public class Database implements Serializable{
    private Users users;
    private Hires hires;
    private Vehicles vehicles;
    private int idUser, idVehicle, idHire;

    public Database (Users u, Hires h, Vehicles v, int idUser, int idVehicle, int idHire){
        this.users =u;
        this.hires =h;
        this.vehicles =v;
        this.idUser = idUser;
        this.idVehicle = idVehicle;
        this.idHire = idHire;
    }

    public Users getUsers() {
        return users;
    }

    public Hires getHires() {
        return hires;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public int getIdUser() {
        return idUser++;
    }

    public int getIdVehicle() {
        return idVehicle++;
    }

    public int getIdHire() {
        return idHire++;
    }

}
