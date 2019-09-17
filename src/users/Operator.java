package users;

/**
 * Operator
 */
public class Operator extends User {

    public Operator(String userName, String pass, String first, String last) {
        super(userName, pass, first, last);
    }
    
    public Operator() {
        this("Operator", "123", "Operador", "Velasquez");
    }
}
