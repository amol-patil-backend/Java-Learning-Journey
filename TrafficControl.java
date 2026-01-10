package Java_Practice;

import java.util.Scanner;

public class TrafficControl {

    public static void main(String[] args) {

        System.out.println("\n------------- Traffic Control ---------------\n");
        
        for (int vehicle = 1; vehicle <= 20; vehicle++) {

            if (vehicle % 2 == 0) {
                System.out.println("Vehicle no " + vehicle + " is allowed");
                System.out.println();
            } else {
                System.out.println("Vehicle no " + vehicle + " pay fine");
            }
          
        }
    }
}
