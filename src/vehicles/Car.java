package vehicles;

/**
 * Car
 */
public class Car extends Vehicle {

    private String gearBox;

    public Car(int id, double tankCapacity, double limits, 
                double milage, String mark, double cost, String gearBox) {
        super(id, tankCapacity, limits, milage, mark, cost);
        setGearBox(gearBox);
    }

    public Car() {
        this(0, 0.0, 0.0, 0.0, "---", 0.0, "no se sabe");
    }

    public void setGearBox(String gearBox) { this.gearBox = gearBox; }
    public String getGearBox() { return gearBox; }

    @Override
    public String toString() {
        String initMsg = super.toString();
        return initMsg + " tiene caja " + gearBox;
    }
}