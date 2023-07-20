package org.example;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));;
    }

    public static boolean containsDuplicate(int [] nums){
        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(hashmap.containsKey(nums[i])){
                hashmap.put(nums[i], hashmap.get(nums[i] + 1));
                return true;
            }
            else{
                hashmap.put(nums[i], 1);
            }
        }
        return false;
    }
}
