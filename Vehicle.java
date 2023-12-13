public abstract class Vehicle {

    private String name;
    private double fuel;
    public Vehicle(String name){
        this.name=name;
    }

    public abstract double  computeConsumptionFactor(Road road);

    public double calculateSpeed(double consumptionFactor) {
        return 1 / consumptionFactor;
    }

    public double calculateTime(double distance, double speed) {
        return distance / speed;
    }

    public double race(Road road, double fuelConsumption) {
        double consumptionFactor = computeConsumptionFactor(road);
        double speed = calculateSpeed(consumptionFactor);
        double time = calculateTime(road.getDistancehlm(), speed);
        fuel -= fuelConsumption;
        return time;
    }


    public void refuel(){
        fuel+=10.0;
    }

    public String toString(){
        return getName()+""+getFuel();
    }
    public double getFuel(){
        return fuel;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
