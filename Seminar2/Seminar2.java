package Seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Seminar2 {
    public static void main(String[] args) throws SecurityException, IOException {
        //System.out.println(longStringBuilding(11, 'a', 'b'));
        //System.out.println(stringCompress("aaaabbbcdd"));
        //System.out.println(polindrome("шалаш"));
        //System.out.println(polindrome1("ifkfi"));

        String pathProject = System.getProperty("user.dir");
        String pathFile2 = pathProject.concat("\\seminar2-2.txt");
        // addingToFile(pathFile, longStringCreator("Hello!", 5));

        addListToFile(pathFile2, showCurrentFiles(pathProject));

    }

    // Задача 1. Дано четное число N > 0 и символы с1 и с2. 
    // Напишите метод, который вернет строку длины N, 
    // которая состоит из чередующихся символов с1 и с2, начиная с с1.

    static String longStringBuilding(int n, char c1, char c2){
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < n / 2; i++) {
            newStr.append(c1);
            newStr.append(c2);
        }
        return newStr.toString();  
    }


    //Задача 2. Напишите метод, который сжимает строку. Например, aaaabbbcdd -> a4b3c1d2

    static String stringCompress(String str) {
        StringBuilder newStr = new StringBuilder();
        char symbol = str.charAt(0);
        newStr.append(symbol);
        int count = 0;

        for (char letter : str.toCharArray()) {
            if (letter == symbol) count++;
            else {
                if(count != 1) newStr.append(count);
                newStr.append(letter);
                symbol = letter;
                count = 1;
            }
        }
        if(count != 1) newStr.append(count);
        return newStr.toString();
    }


    //Задача 3. Напишите метод, который принимает на вход строку (String)
    // и определяет является ли строка палиндромом (возвращает boolean значение).

    static boolean polindrome(String str) {
        StringBuilder result = new StringBuilder("");

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
    return str.equals(result.toString());
    }

    static boolean polindrome1(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            int len = str1.length();
            if (str1.charAt(i) != str1.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }


    // Задача 4. Напишите метод, который составит строку, состоящую из iters повторений слова word и метод, 
    // который запишет эту строку в простой текстовый файл, обработайте исключения.
    static String longStringCreator(String word, int iters) {
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < iters; i++) 
            newStr.append(word);
        return newStr.toString() + "\n";
    }
    
    static void addingToFile(String filePath, String text) { //filePath - расположение файла
        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile, true);
            
            writer.write(text);
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    // Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
    // Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
    // Обработайте ошибки с помощью try-catch конструкции. 
    // В случае возникновения исключения, оно должно записаться в лог-файл.

    static String[] showCurrentFiles(String dirPath) {
        File currentDir = new File(dirPath);
        return currentDir.list();
    }

    static void addListToFile(String filePath, String[] list) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(Seminar2.class.getName());
        FileHandler fh = new FileHandler("Seminar2-2(log).txt");

        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);
        

        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile);

            for (String str : list) {
                writer.write(str + "\n");
            writer.close();                
            }
        } catch (Exception e) {
            logger.warning(e.getMessage());
        }

    }

}
