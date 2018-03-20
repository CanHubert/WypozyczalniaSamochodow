import java.util.ArrayList;
import java.util.List;

/**
 * Created by canhu on 21.05.2017.
 */
public class Vehicles implements GetVehicleByID   {
    private List<Vehicle> vehicles;

    public Vehicles(){
        vehicles= new ArrayList<>();
    }

    public void add(Vehicle v){
        vehicles.add(v);
    }

    public void remove(int i){
        vehicles.remove(i);
    }

    public String toString(){
        return listString(vehicles);
    }
    public Vehicle get(int i){
        //for()
         return vehicles.get(i-1);

    }

    private String listString(List<Vehicle> list) {
        StringBuilder sb = new StringBuilder();
        for (Vehicle v : list) {
            sb.append(v).append("\n");
        }
        return sb.toString();
    }


    @Override
    public Vehicle getVehicleByID(int i) {
        for(Vehicle v : vehicles){
            if(v.getID()==i)
                return v;
        }
        return null;
    }
}
