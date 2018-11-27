package com.agenttb.code.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArrayOptTest {
    private ArrayOpt arrayOpt;
    @Before
    public void init() {
        arrayOpt = new ArrayOpt();
    }
    @Test
    public void testNextPermutation() {
        int[] nums1 = {1,2,3,4,5,6};
        arrayOpt.nextPermutation(nums1);
        Assert.assertArrayEquals(new int[]{1,2,3,4,6,5}, nums1);

        int[] nums2 = {1,6,2,3,5,4};
        arrayOpt.nextPermutation(nums2);
        Assert.assertArrayEquals(new int[]{1,6,2,4,3,5},nums2);

        int[] nums3 = {6,5,4,3,2,1};
        arrayOpt.nextPermutation(nums3);
        Assert.assertArrayEquals(new int[]{1, 2,3,4,5,6}, nums3);

        int[] nums4 = {1,2,3,6,4,5};
        arrayOpt.nextPermutation(nums4);
        Assert.assertArrayEquals(new int[]{1,2,3,6,5,4},nums4);

        int[] nums5 = {1,2,6,3,5,4};
        arrayOpt.nextPermutation(nums5);
        Assert.assertArrayEquals(new int[]{1, 2, 6, 4, 3, 5}, nums5);

        int[] nums6= {1, 1, 5};
        arrayOpt.nextPermutation(nums6);
        Assert.assertArrayEquals(new int[]{1,5,1}, nums6);

    }

    @Test
    public void combinationSumTest() {
        int[] nums1 = {2,3,6,7};
        List<List<Integer>> lists = arrayOpt.combinationSum(nums1, 12);
        for (List<Integer> list : lists) {
            System.out.println(list.toString());
        }
        System.out.println("==============================================");
        int[] nums2 = {2, 3, 5};
        List<List<Integer>> lists1 = arrayOpt.combinationSum(nums2, 8);
        for (List<Integer> list : lists1) {
            System.out.println(list.toString());
        }
    }

    @Test
    public void combinationSum2Test() {
        int[] nums1 = {10,1,2,7,6,1,5};
        Arrays.stream(nums1).sorted().forEach(v -> System.out.print(v + " "));
        System.out.println();
        List<List<Integer>> lists = arrayOpt.combinationSum2(nums1, 8);
        for (List<Integer> list : lists) {
            System.out.println(list.toString());
        }
    }
}
