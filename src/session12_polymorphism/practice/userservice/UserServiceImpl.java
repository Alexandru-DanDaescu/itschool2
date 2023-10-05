package session12_polymorphism.practice.userservice;

public class UserServiceImpl implements UserService{

    @Override
    public void createUser(){

    }

    public static void main(String[] args) {

        UserServiceImpl userServiceImpl = new UserServiceImpl(); //class
        UserService userService = userServiceImpl; //(interface) this is valid

        //is-A relationship   //
        //                    // -> search the internet for more
        //has-A relationship  //

    }

}
