/**
 * Created by canhu on 21.05.2017.
 */
public class Truck extends Car {
    private int Load;//ładunek,pojemnosć
    private int ID;
    private double milage;
    private String name;
    private boolean OnStock;
    public Truck(String name,double milage,int load, boolean OnStock){
        super(name,milage,OnStock);
        this.ID=Vehicle.ID++;
        this.name=name;
        this.Load= load;
        this.milage=milage;
        //IncreaseID();
    }
    @Override
    public boolean AbleToHire() {
        return OnStock == true;

    }
    @Override
    public void On() {

        if(!OnStock){
            OnStock= true;

        }

    }
    @Override
    public void Off(){
        if(OnStock)  {
            OnStock=false;
        }
    }

    public String toString(){return ID+" "+name+" "+milage+" "+Load+" "+OnStock;}

    @Override
    public int getID() {
        return ID;
    }
}
