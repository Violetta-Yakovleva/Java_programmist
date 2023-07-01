// Тип OBJECT

// package Lesson3;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.*;

// public class lesson3 {

//     public static void main(String[] args) {
//         Object o = 1; GetType(o); //java.lang.Integer
//         o = 1.2; GetType(o); //java.lang.Double
//     }

//     public static void GetType(Object obj) {
//         System.out.println(obj.getClass().getName());
//     }
// }


// public class lesson3 {

//     public static void main(String[] args) {
//         System.out.println(Sum(1, 2));
//         System.out.println(Sum(1.0, 2));
//         System.out.println(Sum(1, 2.0));
//         System.out.println(Sum(1.2, 2.1));
//         System.out.println(Sum("каша", "маша"));
//     }

//     static Object Sum(Object a, Object b) {
//         if (a instanceof Double && b instanceof Double) {
//             return (Object) ((Double)a + (Double) b); //преобразовывать в Object в данном случае не обязательно
//         } else if (a instanceof Integer && b instanceof Integer){
//             return (Object) ((Integer)a + (Integer)b); //преобразовывать в Object в данном случае не обязательно
//         } else return 0;
//     }
// }




//Массивы


// public class lesson3 {

//     public static void main(String[] args) {
//         int[] a = new int[] {1, 9};
//         int[] b = new int[3]; 
//         System.arraycopy(a, 0, b, 0, a.length);

//         for (int i : a) {System.out.printf("%d", i);} 
//         for (int j : b) {System.out.printf("%d", j);}
//     }
// }


// public class lesson3 {
//     static int[] AddItem(int[] array, int item){
//         int length = array.length;
//         int[] temp = new int[length + 1];
//         System.arraycopy(array, 0, temp, 0, length);
//         temp[length] = item;
//         return temp;
//     }

//     public static void main(String[] args) {
//         int[] a = new int[] {0, 9};
//         for (int i : a) {System.out.printf("%d", i);}
//         a = AddItem(a, 2);
//         a = AddItem(a, 3);

//         for (int j : a) {System.out.printf(%"d", j);}
//     }
// }



//Иерархия коллекций

// 1. interface Collection <- Set, List, Queue
// 2.1. interface Set <- HashSet, SortedSet
// 2.2. interface List -> ArrayList, Vector
// 2.3. interface Queue <- LinckedList, PriorityQueue
// 3.1. HashSet <- LinkedHashSet
// 3.2. SortedSet <- NavigabledSet, TreeSet
// 2. MAP

//ArrayList

//ArrayList list = new ArrayList(); // создаем


// public class lesson3 {
//     public static void main(String[] args) {
//         //ArrayList<Integer> list = new ArrayList<Integer>();
//         ArrayList list = new ArrayList();
//         list.add(2809);
//         list.add("1234");

//         for(Object o:list) {
//             System.out.println(o);
//         }
//     }
    
// }


//Удобный массив, способы создания
// ArrayList<Integer> list1 = new ArrayList<Integer>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10);
// ArrayList<Integer> list1 = new ArrayList<>(list3);

// Save Type

// public class lesson3 {

//     public static void main(String[] args) {
//         List<Integer> list = new ArrayList<Integer>();
//         list.add(1);
//         list.add(123);
//         //list.add("string line");

//         for (Object o : list) {
//             System.out.println(o);
//         }
//     }
// }


//Коллекции. Функционал

// add(args) - добавление элемента в список
// get(pos) - возвращение элемента из списка по указанной позиции
// indexOf(item) - первое вхождение или -1
// lastIndexOf(item) - последнее вхождение или -1
// remove(pos) - удаление элемента на указанной позиции и его возвращение
// set(int pos, item) - присваивает значение item элементу, который находится на позиции pos 
// void sort(comparator) - сортирует набор данных по правилу
// subList(int start, int end) - получение набора данных от позиции start до end


// public class lesson3 {

//     public static void main(String[] args) {
//         StringBuilder day = new StringBuilder("29");
//         StringBuilder month = new StringBuilder("9");
//         StringBuilder year = new StringBuilder("1990");
//         StringBuilder[] date = new StringBuilder[] {day, month, year};
//         List<StringBuilder> d = Arrays.asList(date)
//         System.out.println(d);
//         date[1] = new StringBuilder("09");
//         System.out.println(d);
//     }
// }

//Коллекции. Функционал
//clear() - очистка списка
//toString() - конвертация списка в строку
//Arrays.AsList() - преобразует массив в список
//containsAll(col) - проверяет включаение всех эллементов из col
//removeAll(col) - удаляет элементы, имеющиеся в col
//retainAll(coll) - оствяет элементы, имещиеся в col
//toArray() - конвертация списка в массив Object-ов
//toArray(type array) - конвертация списка type
//List.CopyOf(col) - возвращает копию списка на основе имеющегося
//List.of(item1, item2...) - возвращает неизменяемый список


// public class lesson3 {

//     public static void main(String[] args) {
//         Character value = null;
//         List<Character> list1 = new ArrayList<Character>();
//         list1.add('S');
//         list1.add('e');
//         list1.add('r');
//         list1.add('g');
//         System.out.println(list1);
//         list1.remove(1); //java.lang.UnsupportedOperationException
//         List<Character> list2 = List.copyOf(list1);
//     }
// }


// public class lesson3 {

//     public static void main(String[] args) {
//         List<Integer> list1 = List.of(1, 12, 123, 1234, 12345);

//         for (int item : list1) {
//             System.out.println(item);            
//         }

//         Iterator<Integer> col = list1.iterator();
//         System.out.println();

//         while (col.hasNext()) {
//             System.out.println(col.next());
//             // col.next();
//             // col.remove();
//         }
//     }
// }


// Итератор

//Iterator<E> - итератор коллекций
// hasNext(), next(), remove()
// ListIterator<E> URL
// hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)