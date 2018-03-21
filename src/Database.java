import java.io.Serializable;

public class Database implements Serializable{
    private Users u;
    private Hires h;
    private Vehicles v;
    private int idUser, idVehicle, idHire;

    public Database (Users u, Hires h, Vehicles v,int idUser, int idVehicle, int idHire){
        this.u=u;
        this.h=h;
        this.v=v;
        this.idUser = idUser;
        this.idVehicle = idVehicle;
        this.idHire = idHire;
    }

    public Users getU() {
        return u;
    }

    public Hires getH() {
        return h;
    }

    public Vehicles getV() {
        return v;
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
