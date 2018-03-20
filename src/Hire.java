/**
 * Created by canhu on 21.05.2017.
 */
public class Hire {
    private Users u;
    private Vehicles v;
    private User user;
    private Vehicle vehicle;
    private int id, time;
    private String status;
    static int ID=1;

    public Hire(User u, Vehicle v, int time){
        this.id= ID++;
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

    public String toString(){return "User ID:\n"+user.getId()+"\nName:\n"+user.getName()+"\n"+vehicle.getClass()+"\n"+vehicle.getID()+" "
            +vehicle.getName()+" "+ vehicle.getMilage()+"\nHire days: "+time+"\nStatus: "+status;}

}
