//Задача 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scaner_number = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int number = scaner_number.nextInt();
        scaner_number.close();

        if (number == 0)
            System.out.println("Вы ввели ноль. Невозможно посчитать n-ое треугольное число. Факториал 0! = 1");
        else if (number < 0)
            System.out
                    .println("Вы ввели отрицальое число.Невозможно посчитать n-ое треугольное число и его факториал.");
        else
            System.out.println("N-треугольное от " + number + " равняется: " + sum_number(number));    
            System.out.println("Факториал " + number + "! равняется: " + factorial_number(number));
    }

    static int sum_number(int number) {
        int sum = 0;
        sum = (number * (number + 1)) / 2;
        return sum;
    }

    static int factorial_number (int number) {
        if (number == 1) return 1;
        else return number*factorial_number(number-1);
    }
}
    
