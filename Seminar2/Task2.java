// Напишите метод, который сжимает строку.
// Пример.
// вход: aaaabbbcdd
// результат: a4b3c1d2


package Seminar2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String str =  "aaaabbbbbbcdeee";
        System.out.println((compressor(str)));
    }

    static String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }


    public static String compressor (String input){
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(0));//???
        int count = 1;
        for(int i = 1; i < input.length(); i++){
            if(input.charAt(i) == input.charAt(i-1)){
                count++;
            } else {
                sb.append(count);
                sb.append(input.charAt(i));
                count = 1;
            }
        }
        sb.append(count);
        return sb.toString();
    }
}
