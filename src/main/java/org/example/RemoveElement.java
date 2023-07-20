package org.example;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,2,2,2,2};
        int val = 2;
        removeElement(nums, val);
    }

    public static int [] removeElement(int[] nums, int val) {

        int pos = 0;int flag = 0;
        int n = nums.length;
        for(int i = 0; i< n; i++){
            if(nums[i] == val){
                flag=1;
                pos = i;

                if(flag == 1){
                    for(int j = pos+1; j< n; j++){
                        nums[j-1] = nums[j];
                    }
                    flag = 0;
                    n--;
                }
            }
        }
        int [] res = new int[n];
        for(int k = 0; k<n; k++){
            res[k] = nums[k];
        }
        System.out.println(Arrays.toString(res));
        return nums;



    }
}
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                int temp = nums[j];
//                nums[j] = nums[i];
//                nums[i] = temp;
//                j++;
//            }
//        }
//        return j;