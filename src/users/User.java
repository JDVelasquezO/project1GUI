package users;

/**
 * User
 */
public abstract class User {

    private String userName;
    private String pass;
    private String first;
    private String last;

    public User(String userName, String pass, String first, String last) {
        setUserName(userName); setPass(pass); setFirst(first); setLast(last);
    }

    public User() {
        this("user", "123", "---", "---");
    }

    public void setUserName(String userName) { this.userName = userName; }
    public void setPass(String pass) { this.pass = pass; }
    public void setFirst(String first) { this.first = first; }
    public void setLast(String last) { this.last = last; }

    public String getUserName() { return userName; }
    public String getPass() { return pass; }
    public String getFirst() { return first; }
    public String getLast() { return last; }

    @Override
    public String toString() {
        return "El nombre es " + first + " " + last;
    }
}
