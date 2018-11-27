package com.agenttb.code.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayOpt {
    public void nextPermutation(int[] nums) {
        // Find longest no increasing suffix
        int index = nums.length - 1;
        while (index > 0) {
            if (nums[index] > nums[index - 1]) {
                break;
            }
            index--;
        }
        int longestNoIncIndex = index;
        // Find identity pivot
        int pivotIndex = longestNoIncIndex - 1;
        if (pivotIndex == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        // Find rightmost successor to pivot in the suffix
        int successorIndex = 0;
        for (int i = nums.length - 1; i > pivotIndex; i--) {
            if (nums[i] > nums[pivotIndex]) {
                successorIndex = i;
                break;
            }
        }
        swap(nums, pivotIndex, successorIndex);
        reverse(nums, longestNoIncIndex, nums.length - 1);
    }

    private void swap(int[] nums, int index1, int index2) {
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }

    private void reverse(int[] nums, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            swap(nums, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        LinkedList<Integer> out = new LinkedList<>();
        combinationSumDfs(candidates, target, 0, out, res);
        return res;
    }

    private void combinationSumDfs(int[] candidates, int target, int start, LinkedList<Integer> out, List<List<Integer>> res) {
        System.out.println("out:" + out.toString() + " target:" + target + " start:" + start);
        if (target < 0) {
            return;
        } else if (target == 0) {
            res.add(new LinkedList<>(out));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            out.add(candidates[i]);
            combinationSumDfs(candidates, target - candidates[i], i, out, res);
            out.removeLast();
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        LinkedList<Integer> out = new LinkedList<>();
        combinationSum2Dfs(candidates, target, 0, out, res);
        return res;
    }

    private void combinationSum2Dfs(int[] candidates, int target, int start, LinkedList<Integer> out, List<List<Integer>> res) {
        System.out.println("out:" + out.toString() + " target:" + target + " start:" + start);
        if (target < 0) {
            return;
        } else if (target == 0) {
            res.add(new LinkedList<>(out));
            return;
        }
        int prev = -1;
        for (int i = start; i < candidates.length; i++) {
            if (prev != candidates[i]) {
                out.add(candidates[i]);
                combinationSum2Dfs(candidates, target - candidates[i], i + 1, out, res);
                out.removeLast();
                prev = candidates[i];
            }
        }
    }

}
