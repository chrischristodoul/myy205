import java.util.Scanner;

public class HumanRacer extends Racer{
    private Scanner scanner;


    public HumanRacer(String name, Vehicle vehicle) {
        super(name, vehicle);
        scanner=new Scanner(System.in);
    }
    public double getFuel(){
        double racerFuel=scanner.nextDouble();
        return racerFuel;
    }
}
