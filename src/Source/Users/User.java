package Source.Users;

import Source.Database.Database;
import Source.Interfaces.HasAuto;

import java.io.Serializable;


public class User implements Serializable, HasAuto {
    private String name;
    private int id;
    private boolean hasAuto= false;

    public User(String name, Database db){
        this.id= db.getIdUser();
        this.name= name;
    }

    public String toString(){
        if(hasAuto)
        return "ID: "+id+" | name: "+name+" | Auto: YES";
        else return "ID: "+id+" | name: "+name+" | Auto: NO";}

    public String toString2(){
        return "ID: "+id+" | name: "+name;
    }


    public int getId() {
        return id;
    }
    @Override
    public boolean CanHire() {
        return hasAuto;
    }
    @Override
    public void hasAutoOn(){
        if(!hasAuto){
            hasAuto= true;
        }
    }
    @Override
    public void hasAutoOff(){
        if(hasAuto)  {
            hasAuto=false;
    }}
}
