package Homework3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        
        // Для задачи 1:

        Scanner scanerNumber = new Scanner(System.in);
        System.out.println("Введите N: ");
        int num = scanerNumber.nextInt();
        System.out.println("Введите maxValue: ");
        int maxValue = scanerNumber.nextInt();
                
        System.out.println(randomList(num, maxValue)); // 1. Метод по созданию произвольного списка целых чисел        
        System.out.println(deleteEven(randomList(num, maxValue))); // 1.1. Метод по удалению из списка четных чисел
        System.out.println(searchMin(randomList(num, maxValue))); // 1.2. Метод по поиску минимального значения
        System.out.println(searchMax(randomList(num, maxValue))); // 1.3. Метод по поиску максимального значения
        System.out.println(averageNum(randomList(num, maxValue))); // 1.4 Метод по поиску среднего значения

        scanerNumber.close();


        // Для задачи 2:
        
        // Scanner scanerNumber = new Scanner(System.in);
        // System.out.println("Введите количество планет, N: ");
        // int num = scanerNumber.nextInt();
        
        // planetsCounter(num); // вывод рандомного списка планет с повторениями
        //deleteRepeat(planetsCounter(num)); // вывод списка планет без повторов

        //scanerNumber.close();

    }

    static ArrayList<Integer> randomList(int num, int maxValue) {
        ArrayList<Integer> myList1 = new ArrayList<Integer>();
        Random rand = new Random(num);

        for (int i = 0; i < num; i++) 
            myList1.add(rand.nextInt(maxValue));

        return myList1;     
    }

    static ArrayList<Integer> deleteEven(ArrayList<Integer> myList2) {
        ArrayList<Integer> evenNums = new ArrayList<Integer>();

        for (int i = 0; i < myList2.size(); i++) 
            if (myList2.get(i) % 2 == 0) evenNums.add(myList2.get(i));
        return evenNums;    
    }

    static Integer searchMin(ArrayList<Integer> myList3) {
        int minNum = myList3.get(0);

        for (int i = 0; i < myList3.size(); i++) 
            if (myList3.get(i) < minNum) minNum = myList3.get(i);
        return minNum;
    }

    static Integer searchMax(ArrayList<Integer> myList4) {
        int maxNum = myList4.get(0);

        for (int i = 0; i < myList4.size(); i++) 
            if (myList4.get(i) > maxNum) maxNum = myList4.get(i);
        return maxNum;
    }

    static String averageNum(ArrayList<Integer> mylist5) {
        double sum = 0;
        
        for (int i = 0; i < mylist5.size(); i++) {
            sum += mylist5.get(i);
        }
        Double avr = sum / mylist5.size();   
        String average = String.format("%.2f", avr);   
        return average;
    }


    //Задание 2. Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы.
    
    static List<String> planetsCounter(int n) {
        List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto");
        List<String> randPlanets = new ArrayList<String>(n);
        int[] counts = new int[listPlanets.size()];

        Random rand = new Random(n);

        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.print(randPlanets.get(i) + " ");  
            counts[listPlanets.indexOf(randPlanets.get(i))] ++;          
        }
        
        
        return randPlanets;
    }

    static HashSet<String> deleteRepeat(List<String> randPlanets) {
        
        HashSet<String> set = new HashSet<>(randPlanets);

        System.out.println("\n" + set);
        return set;
    }
}
