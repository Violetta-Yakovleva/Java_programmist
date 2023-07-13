package Homework5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

public class Homework5 {
    
    public static void main(String[] args) {
        Map<String, LinkedList<String>> phoneBook = new HashMap<String, LinkedList<String>>();

        Scanner input = new Scanner(System.in);
        System.out.println("\nВыберите действие:\n1 - добавить пользователя и его телефон в книгу;\n2 - удалить пользователя из телефонной книги;\n3 - вывести весь телефонный справочник;\n4 - выход.");
        System.out.print("Введите число: ");
        int action = input.nextInt();
        
        while(action != 4) {
            // Добавление пользователя и его телефона в книгу
            if(action == 1) {
                addInfo(phoneBook);
            }

            //Удаление пользователя из телефонной книги
            else if(action == 2) {
                deletePeople(phoneBook);
            }

            // Печать телефонной книги
            else if(action == 3) 
                printPhoneBook(phoneBook);
            
            else 
                System.out.println("Вы ввели неверное действие.");
            
            System.out.println("\nВыберите действие:\n1 - добавить пользователя и его телефон в книгу;\n2 - удалить пользователя из телефонной книги;\n3 - вывести весь телефонный справочник;\n4 - выход.");
            System.out.print("Введите число: ");
            action = input.nextInt();
        }
        input.close();
    }

    // 1. Добавление пользователя и его телефона
    static void addInfo(Map<String, LinkedList<String>> phoneBook) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя пользователя и номер его телефона через пробел: ");
        String[] namePhone = input.nextLine().split(" "); // имя [0] и телефон [1]

        if (phoneBook.containsKey(namePhone[0])) { // если в справочнике есть такое имя
            phoneBook.get(namePhone[0]).add(namePhone[1]); // то берем имя, добавляем телефон
        } else {
            phoneBook.put(namePhone[0], new LinkedList<String>()); // иначе добавляем в справочник имя и список к нему
            LinkedList<String> phones = phoneBook.get((namePhone[0])); // берем имя в справонике
            phones.add(namePhone[1]); // добавляем телефон
        }
        System.out.printf("Имя '%s' и телефон '%s' добавленны в телефонный справочник.\n", namePhone[0], namePhone[1]);
    }

    //  2. Удаление абонента из телефонной книги
    static void deletePeople(Map<String, LinkedList<String>> phoneBook) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя для удаления его данных из телефонной книги: ");
        String userName = input.next();
        
        for(Map.Entry<String, LinkedList<String>> nameInPhoneBook : phoneBook.entrySet()) {
            if(nameInPhoneBook.getKey().equals(userName)) {
                phoneBook.remove(userName);
            }
        }
        System.out.printf("Данные абонента '%s' удалены из телефонного справочника.\n", userName);
    }

    // 3. Печать телефонной книги
    static void printPhoneBook(Map<String, LinkedList<String>> phoneBook) {
        for(Map.Entry<String,LinkedList<String>> userName: phoneBook.entrySet())
            System.out.printf("Имя: %s, телефон %s\n", userName.getKey(), userName.getValue());
    }
}
