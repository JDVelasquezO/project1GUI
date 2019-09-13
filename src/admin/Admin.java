package admin;

import users.User;

/**
 * Admin
 */
public class Admin extends User {

    public Admin(String userName, String pass, String first, String last){
        super(userName, pass, first, last);
    }
    
    public Admin() {
        this("JD", "123", "Daniel", "Velasquez");
    }
}