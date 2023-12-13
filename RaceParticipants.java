import java.util.Scanner;

public class RaceParticipants {
    private Racer[] participants;
    private Vehicle vehiclez;
    private  Scanner scan=new Scanner(System.in);

    public RaceParticipants() {
        this.participants =new Racer[4];
        participants[0] = new Racer("Computer1", new Car());
        participants[1] = new Racer("Computer2", new Motorbike());
        participants[2] = new Racer("Computer3", new Jeep());

        System.out.println("\"Enter your name: \"");
        String name=scan.next();
        System.out.println("Choose your vehicle ");
        String vehicle=scan.next();


        if(vehiclez.equals("car")){
            vehiclez=new Car();
        }
        else if(vehiclez.equals("Motorbike")){
            vehiclez=new Motorbike();
        }
        else{
            vehiclez=new Jeep();
        }
        participants[3]=new HumanRacer(name,vehiclez);
        }
    public void runRace(double distance) {
        for (Racer participant : participants) {
            participant.race(new Road(distance,true));
        }
    }

    public void refuelAll() {
        for (Racer participant : participants) {
            participant.refuel();
        }
    }

    public void printParticipants() {
        for (int i = 0; i < participants.length; i++) {
            System.out.println((i + 1) + ". " + participants[i].toString());
        }
    }

    public Racer getWinner() {
        Racer winner = participants[0]; // Υποθέτουμε ότι ο πρώτος συμμετέχων είναι ο νικητής αρχικά

        for (int i = 1; i < participants.length; i++) {
            if (participants[i].getTime() < winner.getTime()) {
                winner = participants[i]; // Αν βρεθεί κάποιος με μικρότερο συνολικό χρόνο, γίνεται αντικατάσταση
            }
        }

        return winner;
    }

}
