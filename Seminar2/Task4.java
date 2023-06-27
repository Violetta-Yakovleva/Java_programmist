// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

package Seminar2;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.w3c.dom.Text;

public class Task4 {
    public static void main(String[] args) {
        String test = "TEST";
        int n = 100;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\\u0423\u0427\u0415\u0411\u0410 GB\\\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0438\u0441\u0442\\Java\\Java_programmist\\Seminar2\\output.txt"))) { 
            //есть другой метод, как создавать файлики в нужную папку, а не в общую проектную, но нам его решили не показывать 
            writer.write(test);
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        

    }


    
}



// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;

// public class Task_04 {
//     public static void main(String[] args) {
//         int n = 100;
//         String text = "TEST";
//         String fname = "out.txt";     

//         String ourData = getData(n, text);
//         writeFile(fname, ourData);
//     }

//     static String getData(int n, String str){
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < n; i++){
//             sb.append(str);
//         }
//         return sb.toString();
//     }

//     static void writeFile(String fileName, String data){
//         // String fullFileName = "Practice_02_2706\\" + fileName;

//         try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
//             writer.write(data);
//         } catch (IOException e) {
//             System.out.println("Error" + e.getMessage());
//         }
//     }
// }