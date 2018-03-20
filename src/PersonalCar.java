/**
 * Created by canhu on 21.05.2017.
 */
public class PersonalCar extends Car {
    private String Transmission;//manual/auto
    private String name;
    private double milage;
    private boolean OnStock;
    private int ID;



    public PersonalCar(String name, double milage, String Transmission, boolean OnStock){
        super(name,milage,OnStock);
        this.ID=Vehicle.ID++;
        this.Transmission=Transmission;
        this.name= name;
        this.OnStock=OnStock;
        this.milage=milage;

    }
    public String toString(){return ID+" "+name+" "+ milage+" "+ Transmission+" "+ OnStock;}

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


    @Override
    public int getID() {
        return ID;
    }
}
