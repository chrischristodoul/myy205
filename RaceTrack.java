import java.util.Random;

public class RaceTrack {

    private Road[] roads;
    private String[] roadTypes = {"Road", "RockyRoad", "DirtRoad"};
    private int size;
    private int current;

    public RaceTrack(int size) {
        this.size = size;
        this.roads = new Road[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int length = rand.nextInt(51) + 50;
            int typeIndex = rand.nextInt(3);
            String roadType = roadTypes[typeIndex];
            if (roadType == "Road") {
                roads[i] = new Road(length, true);
            } else if (roadType == "DirtRoad") {
                roads[i] = new DirtRoad(length, true, 1.0);
            } else {
                roads[i] = new RockyRoad(length, true, 0);
            }
        }
    }

    public boolean reachEnd() {
        return current >= roads.length;
    }

    public Road nextSegment() {
        if (current < roads.length) {
            Road nextSegment = roads[current];
            current++;
            return nextSegment;
        }
        return null;
    }

    public void printRemainingTrack() {
        if (current < roads.length) {
            System.out.println("Remaining Track:");
            for (int i = current; i < roads.length; i++) {
                System.out.println(roads[i]);
            }
        } else {
            System.out.println("No remaining track.");
        }
    }

    public static void main(String[] args) {
        RaceTrack raceTrack = new RaceTrack(10);
        raceTrack.printRemainingTrack();
        boolean reachedEnd = raceTrack.reachEnd();
        if (reachedEnd) {
            System.out.println("End of the track reached.");
        } else {
            Road nextSegment = raceTrack.nextSegment();
            if (nextSegment != null) {
                System.out.println("Next segment: " + nextSegment);
            } else {
                System.out.println("No more segments in the track.");
            }
        }

    }
}