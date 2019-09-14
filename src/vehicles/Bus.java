package vehicles;

/**
 * Bus
 */
public class Bus extends Vehicle {

    public Bus(int id, double tankCapacity, double limits, double milage, String mark, double cost) {
        super(id, tankCapacity, limits, milage, mark, cost);
    }

    public Bus() {
        super();
    }
}