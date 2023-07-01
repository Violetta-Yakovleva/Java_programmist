package Seminar1;

import java.util.Scanner;
import java.time.LocalDateTime;

public class Seminar1 {
      
    public static void main(String[] args) {
        //helloUser();
        //helloUserTime();
        //quantityOfSame();
        //magicIndex();
        reversPhrase();
    }

    static void helloUser() {
    // 1.1. Написать программу, которая попросить у пользвателя ввод его имени в консоли. 
    // Получит введенную строку и выведет в консоль сообщение "Привет, <имя>!".
        Scanner scan_name = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = scan_name.nextLine();

        System.out.printf("Hello, %s!", name);

        scan_name.close();
    }

    static void helloUserTime() {
    // 1.2. Попривевтствовать пользователя в соответствии с екущим временем суток.
        Scanner scan_name = new Scanner(System.in);
        
        System.out.println("Input your name: ");
        String name = scan_name.nextLine();
        
        int hour = LocalDateTime.now().getHour();
        //System.out.println(hour);

        String day_time = "";
        if (hour >= 4 && hour < 11) 
            day_time = "morning";
        else if (hour >= 11 && hour < 17) 
            day_time =" day";
        else if (hour >= 17 && hour < 23) 
            day_time = "evening";
        else 
            day_time = "night";
        
        System.out.printf("Good %s, %s!", day_time, name);
    
    scan_name.close();
    }

    static void quantityOfSame() {
    // 2. Дан массив двоичных чисел, например [1,1,0,1,1,1],
    // вывести максимальное количество подряд идущих чисел.

        int[] array = new int[] {1,1,0,1,1,1};
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) count ++;
            else if (count > maxCount) {
                maxCount = count;
                count = 0;
            }
            else count = 0;
        }
        if (count > maxCount) maxCount = count;
    System.out.println(maxCount);
    }

    static void magicIndex() {
    //Дан массив nums = [1, 7, 3, 6, 5, 6]. Написать программу,которая найдет индекс i  для этого массива такой, 
    //что сумма элементов с индексом < i равен сумме элементов в инексом > i.
        int[] array = new int[] {1, 3, 2, 4, 6};

        for (int i = 1; i < array.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int i1 = 0; i1 < i; i1++)
                leftSum += array[i1];
            for (int i2 = i + 1; i2 < array.length; i2++)
                rightSum += array[i2];

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            } 
        }
        System.out.println(-1);
    }

    static void reversPhrase() {
    //Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
        Scanner sc_phrase = new Scanner(System.in);
        System.out.println("Input your phrase: ");
        String phrase = sc_phrase.nextLine();

        String[] words = phrase.split(" ");
        String[] result = new String[words.length];
        
        for (int i = 0; i < words.length; i++) 
            result[i] = words[words.length - 1 - i];
        
        for (String word : result) {
            System.out.print(word + " ");
        }
        
        sc_phrase.close();
    }
}
