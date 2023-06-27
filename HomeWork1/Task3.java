// Задача 3. Реализовать простой калькулятор

package HomeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scannerNums = new Scanner(System.in);
        System.out.print("Введие первое число: ");
        Double num1 = scannerNums.nextDouble();
        System.out.print("Введие второе число: ");
        Double num2 = scannerNums.nextDouble();
        System.out.print("Введите арифметическое действие для чисел: сложение +, вычитание -, умножение * или деление /: ");
        Character operation = scannerNums.next().charAt(0);
        scannerNums.close();

        double result = 0;

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
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }   
}




