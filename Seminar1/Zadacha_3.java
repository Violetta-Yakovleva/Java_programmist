//Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива. Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.


package Seminar1;

import java.util.Arrays;

public class Zadacha_3 {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 2, 3};
        int val = 3;
        int i = 0;
        int j = nums.length - 1;

        while (i  < j) {
            if(nums[i] == val) {
                nums[i] = nums[j];
                nums[j] = val;
                j--;
            }
            else i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
