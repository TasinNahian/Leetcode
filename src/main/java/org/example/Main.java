package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = {3,3};
        System.out.println(removeElement(nums,5));;
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 1 && nums[0] == val) {
            return 0;
        }
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        if (nums.length > 1) {
            int count = 0;
            for (int i = 0, j = nums.length - 1; i < nums.length / 2; i++) {
                if (nums[j] == val) {
                    j--;
                }
                if (nums[i] == val && nums[j] != val) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j--;
                    count++;
                }
            }
            int res = (count > 0) ? nums.length - count - 1 : 0;
            return res;
        }
        return 0;
    }
}