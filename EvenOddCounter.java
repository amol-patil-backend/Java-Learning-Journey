package Java_Practice;

import java.util.Scanner;

public class practice {

    static void find(int[] no) {

        int evenTotal = 0;
        int oddTotal = 0;

        for (int n : no) {
            if (n % 2 == 0) {
                evenTotal++;
            } else {
                oddTotal++;
            }
        }
        System.out.println("Total even no :" + evenTotal);
        System.out.println("Total odd no :" + oddTotal);

    }

    public static void main(String[] args) {

        int[] data = {15, 22, 8, 91, 44, 3, 10, 37};

        practice.find(data);

    }
}
