// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

package Seminar2;

public class Task3 {
    public static void main(String[] args) {
        String word = "Шалаш";
        System.out.println(polindrome(word));
    }

    public static boolean polindrome(String word) {
        word = word.toUpperCase();
        for (int i = 0; i < word.length() / 2; i++) {
            int len = word.length();
            if (word.charAt(i) != word.charAt(len-i-1)) {
                return false;
            }
        }   
        return true;
    }

}

