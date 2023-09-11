package our_interface;

public interface InterfaceDefault {

    int getUserID();


    // defoltniy metod sozdayotsa s pomoshyu slogo DEFAULT!!!
    default int getAdminID(){
        return 25;
    }

}
