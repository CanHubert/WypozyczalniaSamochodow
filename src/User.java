/**
 * Created by canhu on 21.05.2017.
 */
public class User {
    private String name;
    static int ID=1;
    private int id;
    private boolean hasAuto= false;

    public User(String name){
        this.id=ID++;
        this.name= name;
    }

    public String toString(){
        return id+" "+name+" Has auto:"+hasAuto;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isHasAuto() {
        return hasAuto;
    }
    public void hasAutoOn(){
        if(!hasAuto){
            hasAuto= true;
        }
    }
    public void hasAutoOff(){
        if(hasAuto)  {
            hasAuto=false;
    }}
}
