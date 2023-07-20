package org.example;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int num : nums1){
            hashmap.put(num, hashmap.getOrDefault(hashmap.get(num),0) +1);
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums2){
            if(hashmap.containsKey(num) && hashmap.get(num) > 0){
                set.add(num);

            }
        }
        int [] res = new int[set.size()];
        int i =0;
        for(int val : set){
            res[i] = val;
            i++;
        }
        System.out.println(hashmap.keySet());
        System.out.println(Arrays.toString(res));
    }
}
