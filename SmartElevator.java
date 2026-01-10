package Java_Practice;

public class SmartElevator { 

    public static void main(String[] args) {

        final int UNLUCKY_ONE = 4;
        final int UNLUCKY_TWO = 13;
        final int MAINTENANCE_FLOOR = 10;
        
        int totalStops = 0;

        for (int floor = 1; floor <= 15; floor++) {

            // Case 1: Unlucky Floors
            if (floor == UNLUCKY_ONE || floor == UNLUCKY_TWO) {
                System.out.println("Skipping Floor " + floor + " - Unlucky");
                continue; // Skip
            }

            // Case 2: Maintenance Floor
            if (floor == MAINTENANCE_FLOOR) {
                System.out.println("Floor " + floor + " - Maintenance Mode (Doors Closed)");
            } 
            // Case 3: Normal Floor
            else {
                System.out.println("Stopped at Floor " + floor);
            }
            
            totalStops++;
        }

        System.out.println("---------------------------");
        System.out.println("Total Stops made: " + totalStops);
    }
}
