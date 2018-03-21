import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by canhu on 23.05.2017.
 */
class DuplicateVehicleHireException extends RuntimeException{
    public DuplicateVehicleHireException(){System.out.println("This user already has a vehicle");}}// user wypozycza drugi raz
class NoHiredVehicleException extends RuntimeException{
    public NoHiredVehicleException(){System.out.println("This user has no vehicles to return.");}
}// user nie ma pojazdu
class VehicleOnStockException extends RuntimeException{
    public VehicleOnStockException(){System.out.println("This vehicle is already hired.");}
}// wypozyczony
class UserExistException extends RuntimeException{
    public UserExistException(){System.out.println("The user with the specified ID does not exist");}}// czy user istnieje
class VehicleExistException extends RuntimeException{
    public VehicleExistException(){System.out.println("The vehicle with the specified ID does not exist");}}// czy pojazd istnieje
public class Hires implements Serializable{
    private List<Hire> hires;


    public List<Hire> getHires() {
        return hires;
    }

    public Hires(){
        this.hires= new ArrayList<>();
    }
    //addHire
    public void HireAVehicle(int idUser, int idVehicle, int time, Database db) throws DuplicateVehicleHireException,VehicleOnStockException,UserExistException,VehicleExistException {
        Vehicle veh = db.getV().getVehicleByID(idVehicle);
        User user= db.getU().getUserbyID(idUser);
        if(!isUserExist(idUser, db))
            throw new UserExistException();
        if(!isVehicleExist(idVehicle,db))
            throw new VehicleExistException();
        if(canHire(idUser,db))
            throw new DuplicateVehicleHireException();
        if(!isOnStock(idVehicle,db))
            throw new VehicleOnStockException();

        hires.add(new Hire(user,veh,time,db));
        veh.Off();
        user.hasAutoOn();
    }
    public void returnVehicle(int idUser,Database db) throws NoHiredVehicleException,UserExistException{
        if(!isUserExist(idUser,db))
            throw  new UserExistException();
        if(!userHasVehicle(idUser,db))
            throw new NoHiredVehicleException();

        for(Hire h: db.getH().hires){
            if(h.getUser().getId()==idUser){
                h.getUser().hasAutoOff();
                h.getVehicle().On();
                h.setStatus();
            }
        }
    }
    private boolean userHasVehicle(int id,Database db){// sprawdza czy user posiada pojazd
        for(Hire h: db.getH().hires){
            if(h.getUser().getId()==id){
                return h.getUser().CanHire();
            }

        }
        return false;
    }



    private boolean canHire(int i,Database db)throws UserExistException{

        return db.getU().getUserbyID(i).CanHire();

    }

    private boolean isUserExist(int i,Database db){
        for(User u: db.getU().getUsers()){
           if( u.getId()==i)
               return true;

        }
        return false;
    }
    private boolean isVehicleExist(int i,Database db){
        for(Vehicle v: db.getV().getVehicles()){
            if(v.getID()==i)
                return true;
        }
        return false;
    }
    private boolean isOnStock(int i,Database db){
        return (db.getV().getVehicleByID(i).AbleToHire());
    }

    private String hiresList(List<Hire> list){
        StringBuilder sb= new StringBuilder("Hires:\n");
        for(Hire h:list){
            sb.append(h).append("\n");
        }
        return sb.toString();
    }
    public String toString(){return hiresList(hires);}

    public String PrintByStatus(boolean wyp) {
        StringBuilder sb = new StringBuilder();
        for (Hire h: hires)
        {if (wyp == true){
            if (h.getStatus().equals("Hired"))
                sb.append(h).append("\n");
        }
        else {
            if(h.getStatus().equals("Returned"))
                sb.append(h).append("\n");
        }
        }
        return sb.toString();
    }
}
