package HomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner_num = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        Integer num = scanner_num.nextInt();
        scanner_num.close();

        System.out.println(simple_num(num));
    }

    public static boolean simple_num(Integer num) {
        if (num < 2) return false;

        for(int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
