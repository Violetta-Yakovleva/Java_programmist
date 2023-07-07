package Seminar5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Seminar5 {
    public static void main(String[] args) {
        // task1();
        // task2();
        task3();
        task3_2();

    }

    // Task 1. Создать структуру для хранения номеров паспортов и фамилий сотрудников.
    static void task1() {
        Map<String, String> wokers = new HashMap<>();
        wokers.put("100", "Ivanov");
        wokers.put("101", "Petrov");
        wokers.put("102", "Ivanov");
        wokers.put("103", "Sidoriv");
        wokers.put("104", "Ivanov");
        wokers.put("105", "Pupkin");
        
        for (Map.Entry<String, String> woker : wokers.entrySet()) {
            if(woker.getValue().equals("Ivanov"))
                System.out.printf("Passport number %s, worker surname %s\n", woker.getKey(), woker.getValue());           
        }
    }


    // Task 2. Написать метод, который переведет число из римского формата записи в арабский.
    static void task2() {
        Map<Character, Integer> rimNums = new HashMap<>();
        rimNums.put('I', 1);
        rimNums.put('V', 5);
        rimNums.put('X', 10);
        rimNums.put('L', 50);
        rimNums.put('C', 100);
        rimNums.put('D', 500);
        rimNums.put('M', 1000);

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите римское число: ");
        char[] romeNumber = sc.nextLine().toUpperCase().toCharArray();
        int res = 0;

        for (int i = 0; i < romeNumber.length; i++) {
            if(i != romeNumber.length - 1 && rimNums.get(romeNumber[i]) < rimNums.get(romeNumber[i + 1])) {
                res += rimNums.get(romeNumber[i + 1])- rimNums.get(romeNumber[i]);
                i++; 
            } else res += rimNums.get(romeNumber[i]);
        }
    System.out.println(res);
    sc.close();

    }


    // Task 3. Написать метод, который сортирует строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
    // Проработка колизий.
    
    static void task3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String[] words = input.nextLine().split(" ");

        Map<Integer, String> sortedWords = new TreeMap<>();

        for (String word : words) 
            sortedWords.put(word.length(), word);

        System.out.println(sortedWords);
        input.close();
    }

    static void task3_2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String[] words = input.nextLine().split(" ");

        Map<Integer, LinkedList<String>> sortedWords = new TreeMap<>();
        
        for (String word : words) {
            if(sortedWords.containsKey(word.length())) {
                sortedWords.get(word.length()).add(word);
            } else {
                sortedWords.put(word.length(), new LinkedList<String>());
                sortedWords.get(word.length()).add(word);
            }
        }
    System.out.println(sortedWords);
    input.close();
    }
}
