package Lesson1;
// public class programm {
//     public static void main(String[] args) {
//         String a = "Hello World";
//         a.charAt(0)
//         System.out.println(a);        
//     }
// }


// public class programm {
//     public static void main(String[] args) {
//         int[] arr = new int[10];
//         System.out.println(arr.length); // 10
//         arr = new int[] { 1, 2, 3, 4, 5 };
//         System.out.println(arr.length); // 5
//     }
// }

// public class programm {
//     public static void main(String[] args) {
//         int[][] arr = new int[3][5];

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class programm {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }


// import java.util.Scanner;

// public class Program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }
// }

// public class Program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }



// public class Program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }


// public class programm {
//     static void sayHi() {
//         System.out.println("hi!");
//     }

//     static int sum(int a, int b) {
//         return a + b;
//     }

//     static double factor(int n) {
//         if (n == 1)
//             return 1;
//         return n * factor(n - 1);
//     }

//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }
// }

// public class programm {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// public class programm {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b)
//             c = a;
//         if (b > a)
//             c = b;
//         System.out.println(c);
//     }
// }

// public class programm {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }
