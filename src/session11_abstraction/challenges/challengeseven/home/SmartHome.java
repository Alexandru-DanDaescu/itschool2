package session11_abstraction.challenges.challengeseven.home;

import java.util.ArrayList;
import java.util.List;
import session11_abstraction.challenges.challengeseven.user.User;
public class SmartHome {

    private List<User> users;

    public SmartHome(){
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }


}
