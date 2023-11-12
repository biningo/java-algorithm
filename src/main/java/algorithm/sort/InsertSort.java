package algorithm.sort;

import algorithm.Utils;

import java.util.Arrays;

public class InsertSort {
    public static void sort(int[] nums) {
        int start = 0;
        for (int i = start; i < nums.length - 1; i++) {
            int base = nums[i + 1];
            int j = i;
            while (j >= 0 && nums[j] > base) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = base;
        }
    }
}
