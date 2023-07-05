// Задача 1.
// 1) Замерьте время, за которое в ArrayList добавятся 1000000 элементов. 
// 2) Замерьте время, за которое в LinkedList добавятся 1000000 элементов. Сравните с предыдущим.

package Seminar4;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class Seminar4 {

    public static void main(String[] args) {
        //ex1();
        //ex2();
        ex3();

    }

    // Задача 1.
    // 1) Замерьте время, за которое в ArrayList добавятся 1000000 элементов. 
    // 2) Замерьте время, за которое в LinkedList добавятся 1000000 элементов. Сравните с предыдущим.
    static void ex1() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            al.add(5);
        }
        System.out.println(System.currentTimeMillis() - start1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            ll.add(5);
        }
        System.out.println(System.currentTimeMillis() - start2);
    }


    // Задача 2. Реализовать консольное приложение, которое:
    // 1. Принимает от пользователя строку вида text~num;
    // 2. Рассплитить строку по ~, сохранить text в связный список на позицию num;
    // 3. Если введено print~num - выводить строку из позиции num в связном списке и удалить её из списка.
    static void ex2() {
        LinkedList<String> myList = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        String data = "end";

        do {
            System.out.printf("Input text~num and %d <= num <= 0: \n", myList.size());
            data = input.nextLine();

            if(data.equals("end")) return;
            changingList(myList, data);
            System.out.println(myList);

        } while (!data.equals(true)); //выполняем, пока пользователь не введет end и пока не совпадет с end
    
    }

    static void changingList(LinkedList<String> myList, String data) {
        try {
            int index = Integer.parseInt(data.split("~")[1]);
            String text = data.split("~")[0];

            if (text == "print") {
                System.out.println(myList.get(index));
                myList.remove(index);
            }
            else myList.add(index, text);

        } catch (Exception e) {
            System.out.println("You have to input correct number");
        }  
    
    }


    //Задача 3. Реализовать консольное приложение, которое:
    // 1. Принимает от пользователя строки;
    // 2. Если введено print - выводит строки от последней к первой;
    // 3. Если введено revert - удаляет предыдущую введенную строку из памяти.

    static void ex3() {
        Deque<String> myList = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        String data = "end";

        do {
            System.out.println("Input something or 'print' or 'revert' or 'end': ");
            data = input.nextLine();

            if(data.equals("end")) {
                input.close();    
                return;
            }

            changingList(myList, data);
            System.out.println(myList);

        } while (true); //выполняем, пока пользователь не введет end и пока не совпадет с end
    }

    static void changingList(Deque<String> myList, String data) {
        if (data.equals("print")) {
            for (String item : myList) 
            System.out.println(item);
            }
        else if (data.equals("revert")) {
            myList.pollFirst();
        }
        else {
            myList.addFirst(data);
        }       

    }

}