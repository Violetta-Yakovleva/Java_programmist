// Задача 2. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
// отдельный метод (войд), N - определяет сколько элементов в списке, рандомный генератор - спис уникальных планет и по индексам выхватывать планеты,
//имя списка.get[индекс], имя списка.indexOf
//вывод - список, под ним пленета и число, сколько раз она повторяется
//print - вывод в строку


package Seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        planetsCounter(9);
        
    }

    static void planetsCounter(int n) {
        List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto");
        List<String> randPlanets = new ArrayList<String>(n);
        int[] counts = new int[listPlanets.size()];

        Random rand = new Random(n);

        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.println(randPlanets.get(i) + " ");  
            counts[listPlanets.indexOf(randPlanets.get(i))] ++;          
        }
        System.out.println();
        
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%s - %s\n", listPlanets.get(i), counts[i]);
        }
    }
}
