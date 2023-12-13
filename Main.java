public class RacingGame {
        public static void main(String[] args) {
            // Create the race participants
            RaceParticipants raceParticipants = new RaceParticipants();

            // Create a track with 10 segments
            RaceTrack track = new RaceTrack(10);

            // Race until reaching the end of the track
            while (!track.reachEnd()) {
                // Print the remaining track
                track.printRemainingTrack();

                // Refuel the vehicles
                raceParticipants.refuelAll();

                // Race the vehicles for the next segment
                //raceParticipants.runRace(track.nextSegment());

                // Print the status of the vehicles
                raceParticipants.printParticipants();
            }

            // Determine and print the winner
            Racer winner = raceParticipants.getWinner();
            System.out.println("The winner is: " + winner.getName());
        }


}