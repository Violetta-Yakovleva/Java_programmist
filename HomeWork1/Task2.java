package HomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scannerNum = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        Integer num = scannerNum.nextInt();
        scannerNum.close();

        System.out.println(simpleNum(num));
    }

    public static boolean simpleNum(Integer num) {
        if (num < 2) return false;

        for(int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
