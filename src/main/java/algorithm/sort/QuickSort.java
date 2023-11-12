package algorithm.sort;


/**
 * 如何选择pivot支点
 * 1. 随机
 * 2. 选第一个
 * 3. 三数取中法
 * 选择支点之后,最终都和第一个元素换,然后进行2端口遍历
 */
public class QuickSort {
    public static void sort(int[] nums) {
        quickSort1(nums, 0, nums.length - 1);
    }


    public static void quickSort1(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = left;
        int p1 = left;
        int p2 = right;
        while (p1 < p2) {
            while (p1 < p2 && nums[p2] >= nums[pivot]) {
                p2--;
            }
            while (p1 < p2 && nums[p1] <= nums[pivot]) {
                p1++;
            }
            swap(nums, p1, p2);
        }
        swap(nums, p1, pivot);
        pivot = p1;
        quickSort1(nums, left, pivot - 1);
        quickSort1(nums, pivot + 1, right);
    }

    public static void swap(int[] nums, int idx1, int idx2) {
        int tmp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
    }
}
