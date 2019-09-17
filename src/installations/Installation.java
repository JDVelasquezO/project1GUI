package installations;

import vehicles.Vehicle;

/**
 * Installation
 */
public abstract class Installation {

    // private int id;
    private String name;
    private String type;
    private Vehicle vehicle;

    public Installation(String name, String type){
        setType(type); setName(name);
    }

    public Installation() {
        this("null", "null");
    }

    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setParkingLot(Vehicle vehicle)
    { this.vehicle = vehicle; }

    public String getName() { return name; }
    public Vehicle getParkingLot() { return vehicle; }
    public String getType() { return type; }
    public String getVehicle(){
        return "\n" + vehicle;
    }

    @Override
    public String toString() {
        return "\t\tEl " + type + " " + name + " fue creado satisfactoriamente";
    }
}
