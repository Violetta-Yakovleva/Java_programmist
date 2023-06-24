package Seminar1;

/**
 * Zadacha_2
 */
public class Zadacha_2 {

    public static void main(String[] args) {
        int[] array = new int[] { 1, 1, 0, 1, 1, 1};
        System.out.println(search_max(array));
    
    }

    static int search_max(int[] array) {
        int count = 0;
        int count_res = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                count++;
            else {
                if (count > count_res)
                    count_res = count;
                count = 0;
            }

        }
        if (count_res < count)
            count_res = count;
        return count_res;
    }   
}


