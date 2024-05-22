package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert your phone number (9 digits):");
        int yourNum = sc.nextInt();

        while (Integer.toString(yourNum).length() != 9) {
            System.out.println("Invalid phone number. Please insert a 9 digits number: ");
            yourNum = sc.nextInt();
        }

        Sim sim = new Sim(yourNum);

        sim.printSimInfo();
    }
}
