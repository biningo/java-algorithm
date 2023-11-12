package algorithm.sort;

public class MergeSort {
    public static void sort(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    public static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (right - left) / 2 + left;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        if (nums[mid] < nums[mid + 1]) {
            return;
        }

        int[] tmp = new int[nums.length];
        for (int i = left; i <= right; i++) {
            tmp[i] = nums[i];
        }

        int p1 = left;
        int p2 = mid + 1;
        for (int i = left; i <= right; i++) {
            if (p1 <= mid && (p2 > right || tmp[p1] < tmp[p2])) {
                nums[i] = tmp[p1];
                p1++;
            } else {
                nums[i] = tmp[p2];
                p2++;
            }
        }
    }
}
