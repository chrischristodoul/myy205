import java.util.Random;
public class DirtRoad extends Road{
    private double rain;
    private Random rand=new Random();

    public DirtRoad(int kilometers,boolean hasTurns,double rain) {
        super(kilometers,hasTurns);
        this.rain=rand.nextDouble(0,1);
    }
    public int updateConsumptionFactor(int consumption){
        super.updateConsumptionFactor(consumption);
        if(rain>=0.8 && rain<=1.0){
            consumption=(int)(consumption*1.2);
        }
        else if(rain>=0.5 && rain<0.8){
            consumption=(int)(consumption*1.1);
        }

        return consumption;
    }
    public  String toString(){
        return (getDistancehlm()+"klm of dirt road with turns and rain level"+""+rain);
    }
    public int getType(){
        return 1;
    }

}
