package Java_Practice;

public class FlashSale {

    public static void main(String[] args) {

        int stock = 5;
        final int SCAMMER_1 = 4;
        final int SCAMMER_2 = 8;
        
        for (int customer = 1; customer <= 10; customer++) {

            if (stock == 0) {
                System.out.println("Stock Finished! Sale Closed.");
                break; 
            }

            if (customer == SCAMMER_1 || customer == SCAMMER_2) {
                System.out.println("Customer " + customer + " - Scammer Detected! Order Cancelled.");
                continue; 
            }
          
            stock--; 
            System.out.println("Customer " + customer + " - iPhone Sold! (Stock Left: " + stock + ")");
        }
    }
}
