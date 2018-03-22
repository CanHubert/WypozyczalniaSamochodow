package Source.Vehicles;
import Source.Exceptions.*;
import Source.Interfaces.*;
import Source.Database.Database;
import Source.Comparators.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicles implements GetVehicleByID, Serializable {
    private List<Vehicle> vehicles;

    public Vehicles(){
        vehicles= new ArrayList<>();
    }

    public void add(Vehicle v){
        vehicles.add(v);
    }

    public void remove(Vehicle v, Database db){
        if(!isVehicleExist(v,db))
            throw  new VehicleExistException();
        if(!OutOfStock(v,db))
            throw  new VehicleOnStockException();

        vehicles.remove(v);
    }

    public String toString(){
        return listString(vehicles);
    }


    private String listString(List<Vehicle> list) {
        StringBuilder sb = new StringBuilder("Source.Vehicles.Source.Vehicles:\n");
        for (Vehicle v : list) {
            sb.append(v).append("\n");
        }
        return sb.toString();
    }
    public String printByType(){
        List<Vehicle> list = new ArrayList<>(vehicles);
        list.sort(new CompareByType());
        return listString(list);
    }
    public String printByID(){
        List<Vehicle> list = new ArrayList<>(vehicles);
        list.sort(new CompareByID());
        return listString(list);
    }
    public String printBySpecID(int i, Database db){
        Vehicle veh = getVehicleByID(i);
        if(!isVehicleExist(veh,db))
            throw new VehicleExistException();
        return veh.toString();
    }
    public boolean isVehicleExist(Vehicle vehicle, Database db){
        for(Vehicle v: db.getVehicles().getVehicles()){
            if(v.equals(vehicle))
                return true;}
        return  false;
    }
    private boolean OutOfStock(Vehicle vehicle, Database db){
        for(Vehicle v: db.getVehicles().getVehicles())
            if(v.equals(vehicle))
                return vehicle.AbleToHire();
        return  false;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
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
