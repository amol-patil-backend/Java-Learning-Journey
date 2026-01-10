package Java_Practice;

public class CinemaBooking {

    public static void main(String[] args) {

        int totalTickets = 10;
        int vipPrice = 200;
        int normalPrice = 100;
        int totalCollection = 0;
        
        int ticketsSold = 0;

        final int CHILD_1 = 5;
        final int CHILD_2 = 11;

        for (int person = 1; person <= 15; person++) {

            if (totalTickets == 0) {
                System.out.println("Housefull! Booking Closed.");
                break; 
            }

            if (person == CHILD_1 || person == CHILD_2) {
                System.out.println("Person " + person + " - Not Allowed (Underage)");
                continue; 
            }

            if (ticketsSold < 3) {
                System.out.println("Person " + person + " - Ticket Booked (VIP): " + vipPrice);
                totalCollection = totalCollection + vipPrice;
            } else {
                System.out.println("Person " + person + " - Ticket Booked (Normal): " + normalPrice);
                totalCollection = totalCollection + normalPrice;
            }

            totalTickets--;
            ticketsSold++; 
        }
        
        System.out.println("--------------------------");
        System.out.println("Total Collection : " + totalCollection + " Rs");
    }
}
