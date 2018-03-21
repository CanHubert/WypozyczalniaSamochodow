import java.io.Serializable;


public abstract class Vehicle implements HireAble,ID,Serializable{
    private int ID;
    private String name;
    private double milage;
    public boolean OnStock=true; //stan do wypożyczenia
    public Vehicle(String name,double milage){
        this.name= name;
        this.milage=milage;
    }
    public String toString(){return "";};
    abstract String toString2();
}
