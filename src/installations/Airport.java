package installations;

/**
 * Airport
 */
public class Airport extends Installation {

    public Airport(String name, String type){
        super(name, type);
    }

    public Airport() {
        this("null", "Aeropuerto");
    }
}