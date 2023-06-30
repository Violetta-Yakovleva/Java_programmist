//1. Заполнить список N случайными числами (рандом - nextInt). Отсортировать список методом sort() и вывести его на экран.
// отдельный метод (войд), список.sort(null), при азапуске - показать рандоный список, потом отсортиванный (с помощью форич лио интератора)


package Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanerNumber = new Scanner(System.in);
        System.out.println("Введите N: ");
        int number = scanerNumber.nextInt();
        System.out.println("Введите maxValue: ");
        int maxValue = scanerNumber.nextInt();
        randomSortedList(number, maxValue);
        scanerNumber.close(); 

    }

    static void randomSortedList(int number, int maxValue) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random(number);
                
        for (int i = 0; i < number; i++) 
            list.add(random.nextInt(maxValue));
        
        for (Integer item : list) 
            System.out.print(item + " ");
        System.out.println();

        list.sort(null);


        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}










