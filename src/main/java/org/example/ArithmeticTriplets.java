package org.example;

public class ArithmeticTriplets {

    public static void main(String[] args) {
        int [] nums = {1,4,6,7,10};
        int diff = 3;
        int traversingDiff = 0;
        int totalTriplet = 0;
        for(int i = 0; i < nums.length-2; i++){
            int count = 1;

            for(int j = i+1; j< nums.length; j++){
                traversingDiff = nums[j]
                        - nums[i];
                if(diff == traversingDiff){
                    count++;
                    for(int k = j+1; k< nums.length; k++ ){
                        traversingDiff = nums[k] - nums[j];
                        if(diff == traversingDiff) {
                            count++;
                        }
                    }
                }
                if(count==3){
                    totalTriplet++;
                    count = 1;
                }
            }
        }
        System.out.println(totalTriplet);
    }
}
