package vehicles;

/**
 * Vehicle
 */
public abstract class Vehicle {

    private int id;
    private int passengerCapacity;
    private double tankCapacity;
    private double limits;
    private double milage;
    private String mark;
    private double cost;

    public Vehicle(int id, double tankCapacity, double limits, 
                    double milage, String mark, double cost) {
        setId(id); setTankCapacity(tankCapacity); setLimits(limits); setMilage(milage);
        setMark(mark); setCost(cost);
    }

    public Vehicle(){
        this(0, 0.0, 0.0, 0.0, "---", 0.0);
    }

    public void setId(int id) { this.id = id; }
    public void setTankCapacity(double tankCapacity) { this.tankCapacity = tankCapacity; }
    public void setPassengerCapacity(int passengerCapacity) 
        { this.passengerCapacity = passengerCapacity; }
    public void setLimits(double limits) { this.limits = limits; }
    public void setMilage(double milage) { this.milage = milage; }
    public void setMark(String mark) { this.mark = mark; }
    public void setCost(double cost) { this.cost = cost; }

    public int getId() { return id; }
    public double getTankCapacity() { return tankCapacity; }
    public int getPassengerCapacity() { return passengerCapacity; }
    public double getLimits() { return limits; }
    public double getMilage() { return milage; }
    public String getMark() { return mark; }
    public double getCost() { return cost; }

    @Override
    public String toString() {
        return "El auto tiene capaidad de " + tankCapacity+ " galones";
    }
}