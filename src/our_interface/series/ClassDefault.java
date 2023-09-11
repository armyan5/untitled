package our_interface.series;

import our_interface.InterfaceDefault;

public class ClassDefault implements InterfaceDefault {
    @Override
    public int getUserID() {
        return 55;
    }

    public int getAdminID(){
        return  345;
    }
}
