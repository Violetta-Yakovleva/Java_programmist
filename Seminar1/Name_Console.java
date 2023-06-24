package Seminar1;

import java.util.Scanner;

public class Name_Console {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input your name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, " + name + "!");
        iScanner.close();
    }
}
