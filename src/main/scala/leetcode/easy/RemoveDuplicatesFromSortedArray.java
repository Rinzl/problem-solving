package com.dangiscoding.leetcode.easy;


public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int curIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[curIndex] != nums[i]) {
                curIndex++;
                nums[curIndex] = nums[i];
            }
        }

        return curIndex + 1;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
