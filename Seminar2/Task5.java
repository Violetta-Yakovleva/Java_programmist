// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.


package Seminar2;

import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task5 {
    static Logger logger = Logger.getLogger(Task5.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("log.txt");
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.log(Level.WARNING, "log.txt");

        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
        }

        File file = new File(".");
        String[] strPath = file.list();
    }
}



// import java.io.BufferedWriter;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.logging.FileHandler;
// import java.util.logging.Level;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;

// public class Task_05 {
//     static Logger logger = Logger.getLogger(Task_05.class.getName());
//     public static void main(String[] args) {
//         try{
//             FileHandler fileHandler = new FileHandler("log.txt");
//             SimpleFormatter sFormatter = new SimpleFormatter();
//             fileHandler.setFormatter(sFormatter);
//         }
//         catch(Exception e){
//             logger.log(Level.WARNING, e.getMessage());
//         }

        
//         String file = ".";
//         String[] allFiles = getList(file);

//         file = "list.txt";
//         writeToFile(file, allFiles);

//     }

//     static String[] getList(String fileName){
//         File file = new File(fileName);
//         String[] strPath = file.list();
//         return strPath;
//     }

//     static void writeToFile(String fileName, String[] data){
//         try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
//             for (String string : data) {
//                 writer.write(string+"\n");
//             }
//         } catch (IOException e) {
//             System.out.println("Error" + e.getMessage());
//             logger.log(Level.INFO, e.getMessage());
//         }
//     }
// }