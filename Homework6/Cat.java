package Homework6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Cat {
    static String hostName; // поле - имя хозяина кота
    static String nameCat; // поле для имени животногго
    static int age; // поле - возраст, целое число
    static String sex; // поле - пол животного, male or female
    static double weight; // поле - вес, возможно введение числа с запятой для точности
    
    static String diagnosis; // после для заполнения диагноза животного
    static String recommendations; //поле для заполнения рекоммендаций и назначений


    // конструктор - шаблон для класса Cat, чтобы были заполнены все поля
    public Cat(String hostName, String nameCat, int age, String sex, double weight) { 
        // this.hostName = hostName; // this - hostName для создааемого кода это hostName из конструктора
        // this.nameCat = nameCat;
        // this.age = age;
        // this.sex = sex;
        // this.weight = weight;
        
        Cat.hostName = hostName; 
        Cat.nameCat = nameCat;
        Cat.age = age;
        Cat.sex = sex;
        Cat.weight = weight;
    }

    public static void main(String[] args) {
        // Cat cat1 = new Cat();
        // cat1.hostName = "Yakovleva Violetta";
        // cat1.nameCat = "Bublik";
        // cat1.age = 2;
        // cat1.sex = "male";
        // cat1.weight = 3.7;
        // catCount++;

        // Cat cat2 = new Cat();
        // cat2.hostName = "Ivanova Anasrasia";
        // cat1.nameCat = "Murka";
        // cat1.age = 10;
        // cat1.sex = "female";
        // cat1.weight = 8.9;
        // catCount++;

        Cat cat1 = new Cat("Yakovleva Violetta", "Bublik", 2, "male", 3.7);
        //Cat cat2 = new Cat("Ivanova Anastasia", "Murka", 10, "female", 8.9);

        diagnosisCat(cat1);
        recommendationsAndAppointments(cat1);
        firstInfoForVetClinicForm(cat1);

        // diagnosisCat(cat2);
        // recommendationsAndAppointments(cat2);
        // firstInfoForVetClinicForm(cat2);


    }

    public static void diagnosisCat(Cat somethingCat) {
        // Scanner diagnosisSc = new Scanner(System.in);
        // System.out.println("Введите диагноз: ");
        // diagnosis = diagnosisSc.nextLine();
        diagnosis = "Osteosynthesis; fracture of the right radius and ulna."; // Почему-то снова только английский принимает
        
    }

    public static void recommendationsAndAppointments(Cat somethingCat) {
        // Scanner recomSc = new Scanner(System.in);
        // System.out.println("Введите рекоммендации и назначения для животного: ");
        // recommendations = recomSc.nextLine();
        recommendations = "Ceftriaxone 0.15 g intramusculrly 1 time a day for 7 days"; // Почему-то снова только английский принимает
        
    }

    public static void firstInfoForVetClinicForm(Cat somethingCat) {
        String date = LocalDate.now().toString();
        String time = LocalTime.now().toString();

        System.out.printf("\nVeterinary Hospital 'Panacea'!\nReception from %s %s.\nDear(s) %s!\nToday you visited our hospital to examine your pet: \n  Name: %s, \n  Sex: %s; \n  Age: %d years; \n  Weight: %f kg.\nThe diagnosis: %s.\nRecommendations and appointments: %s.\n", date, time, hostName, nameCat, sex, age, weight, diagnosis, recommendations);
    }
    
}
