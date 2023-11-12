package algorithm.sort;

public class BubbleSort {
    public static void sort(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            boolean swap = false;
            for (int j = 0; j < i; j++) {
                if (nums[j + 1] < nums[j]) {
                    swap = true;
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
            if (!swap) {
                return;
            }
        }
    }
}
