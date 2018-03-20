import java.util.ArrayList;
import java.util.List;

/**
 * Created by canhu on 23.05.2017.
 */
class DuplicateVehicleHireException extends RuntimeException{}// user wypozycza drugi raz
class NoHiredVehicleException extends RuntimeException{}// user nie ma pojazdu
class VehicleOnStockException extends RuntimeException{}// wypozyczony
class UserExistException extends RuntimeException{}
public class Hires {
    private Vehicles v;
    private Users u ;
    private Hire h;
    private List<Hire> hires;

    public Hires(Vehicles v, Users u){
        this.v=v;
        this.u=u;
        this.hires= new ArrayList<>();
    }

    public void HireAVehicle(int idUser, int idVehicle, int time) throws DuplicateVehicleHireException,VehicleOnStockException {
        Vehicle veh = v.getVehicleByID(idVehicle);
        User user= u.getUserbyID(idUser);
        if(userHasVehicle(idUser))
            throw new DuplicateVehicleHireException();
        if(isOnStock(idVehicle))
            throw new VehicleOnStockException();

            hires.add(new Hire(u.getUserbyID(idUser),v.getVehicleByID(idVehicle),time));
            veh.Off();
            user.hasAutoOn();


    }
    public void returnVehicle(int idUser) throws NoHiredVehicleException{
        if(!userHasVehicle(idUser))
            throw new NoHiredVehicleException();

        for(Hire h: hires){
            if(h.getUser().getId()==idUser){
                h.getUser().hasAutoOff();
                h.getVehicle().On();
                h.setStatus();
            }
        }
    }
    public boolean userHasVehicle(int id){// sprawdza czy user posiada pojazd
        for(Hire h: hires){
            if(h.getUser().getId()==id){
                return h.getUser().isHasAuto();
            }

        }
        return false;
    }



    private boolean canHire(int i){
        if(u.getUserbyID(i).isHasAuto())
            return false;
        else return true;
    }
    private boolean isOnStock(int i){
        if(v.getVehicleByID(i).AbleToHire())
            return true;
        else return false;
    }
    private String hiresList(List<Hire> list){
        StringBuilder sb= new StringBuilder();
        for(Hire h:hires){
            sb.append(h).append("\n");
        }
        return sb.toString();
    }
    public String toString(){return hiresList(hires);}
}
