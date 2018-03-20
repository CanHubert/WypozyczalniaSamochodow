/**
 * Created by canhu on 21.05.2017.
 */
public class Motorcycle extends Vehicle {
    private int weight,ID;
    private String name;
    private double milage;
    private boolean OnStock;
    public Motorcycle(String name,double milage,int weight ,boolean OnStock){
        super( name, milage, OnStock);
        this.ID=Vehicle.ID++;
        this.name= name;
        this.milage= milage;
        this.OnStock= OnStock;
        this.weight= weight;
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


    public String toString(){return ID+" "+name+" "+ milage+" "+ weight+" "+ OnStock;}

    @Override
    public int getID() {
        return ID;
    }


}
