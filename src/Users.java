import java.util.ArrayList;
import java.util.List;

/**
 * Created by canhu on 23.05.2017.
 */
public class Users {
    private List<User> users;
    public Users(){users= new ArrayList<>();}
    public void add(User u){users.add(u);}
    public void remove (int index){users.remove(index);}
    public String toString(){return usersList(users);}

    private String usersList(List<User> list){
        StringBuilder sb= new StringBuilder();
        for(User u:users){
            sb.append(u).append("\n");
        }
        return sb.toString();
    }

    public User getUserbyID(int i){
        for(User u: users){
            if(u.getId()==i)
                return u;
        }
        return null;

    }

}
