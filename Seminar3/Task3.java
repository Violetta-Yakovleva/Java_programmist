// Задача 3. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
// что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. 
// Напишите метод для заполнения данной структуры.


package Seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        createTable(3);
    }

    static void createTable(int size) {
        List<String> genres = List.of("Фантастика", "Комедия", "Ужасы", "Детектив");
        List<ArrayList<String>> table = new ArrayList<>(genres.size());
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < genres.size(); i++) {
            ArrayList<String> booksOfGenres = new ArrayList<>(size);
            booksOfGenres.add(genres.get(i));
            System.out.printf("Input %d titles of %s genre down here:\n", size, genres.get(i));

            for (int j = 0; j < size; j++) 
                booksOfGenres.add(input.nextLine());
            
            table.add(booksOfGenres);
            
            
        }
        input.close();

        for (ArrayList<String> books : table) {
            for (String book : books) {
                System.out.print(book + " ");
            }
            System.out.println();
        }

    }
}