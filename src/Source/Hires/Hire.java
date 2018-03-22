package Source.Hires;

import Source.Database.Database;
import Source.Users.User;
import Source.Vehicles.Vehicle;

import java.io.Serializable;


public class Hire implements Serializable{
    private User user;
    private Vehicle vehicle;
    private int id, time;
    private String status;

    public String getStatus() {
        return status;
    }

    public Hire(User u, Vehicle v, int time, Database db){
        this.id= db.getIdHire();
        this.user = u;
        this.vehicle= v;
        this.time= time;
        this.status= "Hired";
    }

    public User getUser() {
        return user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public String setStatus(){
        return status= "Returned";
    }

//    public String toString(){return "Source.Users.User Source.Interfaces.ID:\n"+user.getId()+"\nName:\n"+user.getName()+"\n"+vehicle.getClass()+"\n"+vehicle.getID()+" "
//            +vehicle.getName()+" "+ vehicle.getMilage()+"\nHire days: "+time+"\nStatus: "+status;}
    public String toString(){return "ID: "+id+"\n"+user.toString2()+"\n"+vehicle.toString2()+"\nDay's: "+time+"\nStatus: "+status+"\n"; }


}
