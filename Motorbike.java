public class Motorbike extends Vehicle{
    public Motorbike(){
        super("Motorbike");
    }

    @Override
    public double computeConsumptionFactor(Road road) {
        if (road instanceof DirtRoad) {
            return 0.05;
        }
        else if(road instanceof  RockyRoad){
            return 0.4;
        }
        return 0.5;
    }
}
