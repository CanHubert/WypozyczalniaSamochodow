
public class Motorcycle extends Vehicle {
    private int ID;
    private String name;
    private double milage,weight;
    private boolean OnStock;
    public Motorcycle(String name,double milage,double weight,Database db){
        super( name, milage);
        this.ID= db.getIdVehicle();
        this.name= name;
        this.milage= milage;
        this.weight= weight;
        this.OnStock=super.OnStock;
    }
    @Override
    public boolean AbleToHire() {
        return OnStock;}

    @Override
    public void On() {
        if(!OnStock){
            OnStock= true;}}

    @Override
    public void Off(){
        if(OnStock)  {
            OnStock=false;}
    }
    public String toString(){
        if(OnStock)
            return "ID: "+ID+" | Type: Motorcycle | Name: "+name+" | Milage: "+ milage+" | Weight: "+ weight+" | On Stock: YES";
        else
            return "ID: "+ID+" | Type: Motorcycle | Name: "+name+" | Milage: "+ milage+" | Weight: "+ weight+" | On Stock: NO"; }
    @Override
    public String toString2(){
        return "ID: "+ID+" | Type: Motorcycle | Name: "+name+" | Milage: "+ milage+" | Weight: "+ weight;
    }

    @Override
    public int getID() {
        return ID;
    }
}
