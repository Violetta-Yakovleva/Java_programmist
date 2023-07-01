package HomeWork1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //triangleFactorial();
        //simpleNumber();
        //calculator();
    }

    //Задача 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    static void triangleFactorial() {
        Scanner sc_num = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int num = sc_num.nextInt();

        if (num == 0) 
            System.out.println("Вы ввели ноль. Невозможно посчитать n-ое треугольное число. Факториал 0! = 1");
        else if (num < 0) 
            System.out.println("Вы ввели отрицательное число, невозможно посчитать n-ое треугольное число и его факториал.");
        else {
            int sum = 0;
            sum = (num * (num + 1)) / 2;

            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            System.out.printf("N-треугольное для числа %d = %d, факториал %d! = %d", num, sum, num, fact);
        }
        sc_num.close();
    }

    //Задача 2. Вывести все простые числа от 1 до 1000
    static void simpleNumber() {
        Scanner sc_num = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int num = sc_num.nextInt();

        for (int i = 2; i < num; i++) {
            boolean flag = false;

            for (int j = 2; j * j <= i; j++) {
                flag = (i % j == 0);
                if (flag) 
                    break;
            }
            
            if (!flag) {
                System.out.print(i + " ");
            }
        }
        sc_num.close();
    }

    //Задача 3.Реализовать простой калькулятор
    static void calculator() {
        Scanner scannerNums = new Scanner(System.in);
        System.out.print("Введие первое число: ");
        int num1 = scannerNums.nextInt();
        System.out.print("Введите арифметическое действие: сложение +, вычитание -, умножение * или деление /: ");
        Character operation = scannerNums.next().charAt(0);
        System.out.print("Введие второе число: ");
        int num2 = scannerNums.nextInt();
        int result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error!");
                break;
        }
        System.out.printf("%d %c %d = %d", num1, operation, num2, result);
        scannerNums.close();
    }
}

       

