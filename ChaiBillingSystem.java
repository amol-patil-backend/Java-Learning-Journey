package Java_Practice;

public class ChaiBillingSystem { 

    public static void main(String[] args) {

        int totalBill = 0;
        int simpleTeaPrice = 10;
        int specialTeaPrice = 20;

        for (int cup = 1; cup <= 5; cup++) {

            if (cup <= 3) {
                System.out.println("Cup " + cup + " : " + simpleTeaPrice + " Rs (Simple)");
                totalBill = totalBill + simpleTeaPrice;
            } else {
                System.out.println("Cup " + cup + " : " + specialTeaPrice + " Rs (Special)");
                totalBill = totalBill + specialTeaPrice;
            }
        }

        System.out.println("-------------------------");
        System.out.println("Final Total Bill = " + totalBill + " Rs");
    }
}
