import  java.util.Random;
public class Road {
    private double distancehlm;
    private boolean hasTurns;
    private Random rand=new Random();

    public Road(double distancehlm, boolean hasTurns){
        this.distancehlm=distancehlm;
        this.hasTurns=rand.nextBoolean();
    }
    public double updateConsumptionFactor(double consumption){

        if(hasTurns==true){
              consumption=consumption*1.1;
        }
        return consumption;
    }
    public String toString(){
        return (distancehlm+"klm of  road with turns and rain level"+hasTurns);
    }
    public int getType(){
        return 0;
    }
    public double getDistancehlm(){
        return  distancehlm;
    }
}
