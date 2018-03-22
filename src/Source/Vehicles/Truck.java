package Source.Vehicles;
import Source.Database.*;

public class Truck extends Car {
    private int Load;//ładunek,pojemnosć
    private int ID;
    private double milage;
    private String name;
    private boolean OnStock;
    public Truck(String name, double milage, int load, Database db){
        super(name,milage);
        this.ID= db.getIdVehicle();
        this.name=name;
        this.Load= load;
        this.milage=milage;
        this.OnStock=super.OnStock;
    }
    @Override
    public boolean AbleToHire() {
        return OnStock;
    }
    @Override
    public void On() {
        if(!OnStock){
            OnStock= true;}}

    @Override
    public void Off(){
        if(OnStock)  {
            OnStock=false;}}

    public String toString(){
        if(OnStock)
            return "ID: "+ID+" | Type: Truck | Name: "+name+" | Milage: "+ milage+" | Load: "+ Load+" | On Stock: YES";
        else
            return "ID: "+ID+" | Type: Truck | Name: "+name+" | Milage: "+ milage+" | Load: "+ Load+" | On Stock: NO";
    }
    @Override
    public String toString2(){
        return "ID: "+ID+" | Type: Truck | Name: "+name+" | Milage: "+ milage+" | Load: "+ Load;
    }

    @Override
    public int getID() {
        return ID;
    }
}
