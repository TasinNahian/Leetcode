package org.example;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int [] arr = {1,5,3};
        int j=1,k=2;
        for(int i = 0; i < arr.length-2; i++){
            if(arr[i] % 2 !=0 && arr[j+i] % 2 != 0 && arr[k +i] % 2 != 0){
                System.out.println(arr[i]+ ","+arr[j]+","+arr[k]);
            }
        }
    }
}
