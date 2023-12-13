import java.util.Random;

public class RockyRoad extends Road {
    private int trackyroad;
    private Random rand=new Random();
    public RockyRoad(int distancehlm, boolean hasTurns,int trackyroad) {
        super(distancehlm, hasTurns);
        this.trackyroad=rand.nextInt(0,2);
    }
    public double updateConsumptionFactor(double consumption) {
        super.updateConsumptionFactor(consumption);
        if (trackyroad == 2) {
            consumption =  (consumption * 1.2);
        } else if (trackyroad == 1) {
            consumption =  (consumption * 1.1);
        }
        return consumption;
    }

    public String toString(){
        return "rocky"+""+getDistancehlm()+trackyroad;
    }
    public int getType(){
        return 2;
    }
}
