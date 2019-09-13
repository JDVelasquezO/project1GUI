package users;

/**
 * Pilot
 */
public class Pilot extends User {

    private String type;
    private int idLicence;

    public Pilot(String userName, String pass, String first, String last, String type, int idLicence) {
        super(userName, pass, first, last);
        setIdLicence(idLicence); setType(type);
    }
    
    public Pilot() {
        super();
    }

    public void setType(String type) { this.type = type; }
    public void setIdLicence(int idLicence) { this.idLicence = idLicence; }

    public String getType() { return type; }
    public int getIdLicence() { return idLicence; }

    /*@Override
    public String toString() {
        String initMsg = super.toString();
        return initMsg + "\nEs de tipo " + type;
    }*/
}
