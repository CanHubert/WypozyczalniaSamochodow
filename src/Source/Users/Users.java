package Source.Users;

import Source.Database.Database;
import Source.Exceptions.*;
import Source.Hires.*;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;


public class Users implements Serializable {
    private List<User> users;
    public Users(){users= new LinkedList<>();}
    public void add(User u){ users.add(u)
        ;}
    public void remove (User u, Database db) throws RuntimeException{
        if (!isUserExist(u,db))
            throw new UserExistException();
        if(userHasVehicle(u,db))
            throw new HasVehicleException();
        users.remove(u);}
    public String toString(){return usersList(users);}

    private String usersList(List<User> list){
        StringBuilder sb= new StringBuilder("Users:\n");
        for(User u:list){
            sb.append(u).append("\n");
        }
        return sb.toString();
    }
    private boolean isUserExist(User user,Database db){
        for(User u: db.getUsers().getUsers()){
            if( u.equals(user))
                return true;}
        return false;
    }
    private boolean userHasVehicle(User user,Database db){// sprawdza czy user posiada pojazd
        for(Hire h: db.getHires().getHires()){
            if(h.getUser().equals(user)){
                return h.getUser().CanHire();
            }

        }
        return false;
    }

    public User getUserbyID(int i){
        for(User u: users){
            if(u.getId()==i)
                return u;
        }
        return null;

    }
    public String printByID(int i, Database db){
        User u =getUserbyID(i);
        if(!isUserExist(u,db))
            throw new UserExistException();
        return u.toString();
    }
    public String printByVehicle(Database db, boolean x){//true- wypozyczony, false - bez pojazdu
        StringBuilder sb = new StringBuilder();
        for (User u: db.getUsers().getUsers()){
            if(u.CanHire()==x) {
                sb.append(u).append("\n");
            }
        }
        return sb.toString();
    }

    public List<User> getUsers() {
        return users;
    }
}
