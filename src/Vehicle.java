/**
 * Created by canhu on 21.05.2017.
 */
public abstract class Vehicle implements HireAble,ID{
    static int ID=1;
    private int id;
    private String name;
    private double milage;
    private boolean OnStock=true; //stan do wypożyczenia
    public Vehicle(String name,double milage, boolean OnStock){
        this.name= name;
        this.milage=milage;
        this.OnStock = OnStock;
    }

    public String getName() {
        return name;
    }

    public double getMilage() {
        return milage;
    }

    public String toString(){return "ID: "+ID+" ";};


}
