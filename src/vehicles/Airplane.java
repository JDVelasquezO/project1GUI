package vehicles;

/**
 * Airplane
 */
public class Airplane extends Vehicle {

    public Airplane(int id, double tankCapacity, double limits, double milage, String mark, double cost) {
        super(id, tankCapacity, limits, milage, mark, cost);
    }

    public Airplane() {
        super();
    }
}