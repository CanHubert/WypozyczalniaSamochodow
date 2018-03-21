
public class PersonalCar extends Car {
    private String Transmission;//manual/auto
    private String name;
    private double milage;
    private boolean OnStock;
    private int ID;

    public PersonalCar(String name, double milage, String Transmission,Database db){
        super(name,milage);
        this.ID= db.getIdVehicle();
        this.Transmission=Transmission;
        this.name= name;
        this.milage=milage;
        this.OnStock=super.OnStock;
    }
    public String toString(){
        if(OnStock)
            return "ID: "+ID+" | Type: Car | Name: "+name+" | Milage: "+ milage+" | Transmission: "+ Transmission+" | On Stock: YES";
        else
            return "ID: "+ID+" | Type: Car | Name: "+name+" | Milage: "+ milage+" | Transmission: "+ Transmission+" | On Stock: NO";}

    @Override
    String toString2() {
        return "ID: "+ID+" | Type: Car | Name: "+name+" | Milage: "+ milage+" | Transmission: "+ Transmission;
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
        if(OnStock)  {OnStock=false;}}

    @Override
    public int getID() {
        return ID;
    }
}
