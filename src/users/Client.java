package users;

/**
 * Client
 */
public class Client extends User{

    private String creditCard;

    public Client(String userName, String pass, String first, String last, String creditCard){
        super(userName, pass, first, last);
        setCreditCard(creditCard);
    }

    public Client() {
        this("Client", "123", "Cliente", "Velasquez", "4555");
    }

    public void setCreditCard(String creditCard) { this.creditCard = creditCard; }
    public String getCreditCard() { return creditCard; }

    /*@Override
    public String toString() {
        String initMsg = super.toString();
        return initMsg + "\nTiene targeta " + creditCard;
    }*/
}
