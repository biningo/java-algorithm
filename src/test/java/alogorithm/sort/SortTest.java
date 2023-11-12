package alogorithm.sort;


import algorithm.Utils;
import algorithm.sort.BubbleSort;
import algorithm.sort.InsertSort;
import algorithm.sort.MergeSort;
import algorithm.sort.QuickSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortTest {
    @Test
    public void testInsertSort() {
        int[] nums = Utils.randomInts(10);
        int[] expected = Arrays.copyOf(nums, nums.length);
        InsertSort.sort(nums);
        Arrays.sort(expected);
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void testBubbleSort() {
        int[] nums = Utils.randomInts(10);
        int[] expected = Arrays.copyOf(nums, nums.length);
        BubbleSort.sort(nums);
        Arrays.sort(expected);
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void testMergeSort() {
        int[] nums = Utils.randomInts(10);
        int[] expected = Arrays.copyOf(nums, nums.length);
        MergeSort.sort(nums);
        Arrays.sort(expected);
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void testQuickSort() {
        int[] nums = Utils.randomInts(10);
        int[] expected = Arrays.copyOf(nums, nums.length);
        QuickSort.sort(nums);
        Arrays.sort(expected);
        Assert.assertArrayEquals(expected, nums);
    }
}
