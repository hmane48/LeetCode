package _26_RemoveDuplicatesFromSortedArray;

/*
Given a sorted array nums, remove the duplicates in-place such that
each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying
the input array in-place with O(1) extra memory.
*/

import java.util.Arrays;

public class Solution {

    public static int removeDuplicates(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[nums.length - 1];
        System.out.println(Arrays.toString(nums));
        return j;
    }

    public static void main(String[] args) {
        int a[] = {1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println(removeDuplicates(a));

    }
}
