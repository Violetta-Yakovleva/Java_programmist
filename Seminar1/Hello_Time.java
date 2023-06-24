package Seminar1;

import java.util.Calendar;
import java.util.Scanner;

public class Hello_Time {
    public static void main(String[] args) {
        Scanner scanner_name = new Scanner(System.in);
        System.out.printf("Input your name: ");
        String name = scanner_name.nextLine();
        scanner_name.close();

        Calendar time_now = Calendar.getInstance(); // получаем текущую дату
        int hour = time_now.get(Calendar.HOUR_OF_DAY); // получаем текущий час времени дня

        if (hour > 5 & hour < 12) {
            System.out.println("Доброе утро, " + name + "!");
        }
        else if (hour > 12 & hour < 18) {
            System.out.println("Добрый день, " + name + "!");
        }
        else if (hour > 18 & hour < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        }
        else {
            System.out.println("Доброй ночи, " + name + "!");
        }
        
    }

}

