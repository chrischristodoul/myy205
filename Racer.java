public class Racer {
    private String name;
    private  Vehicle vehicle;
    private double time;

    public Racer(String name,Vehicle vehicle){
        this.name=name;
        this.vehicle=vehicle;
        this.time=0.0;
    }
    public double getFuel(){return vehicle.getFuel();}
    public void race(Road road){
        double fuelc=getFuel();
        vehicle.race(road,fuelc);
    }
    public void refuel(){
        vehicle.refuel();
    }
    public String toString(){
        return "the name is "+name+"total time is"+time+"vehicle"+vehicle.toString();
    }
    public double getTime(){return time;}

    public String getName() {
        return name;
    }
}
