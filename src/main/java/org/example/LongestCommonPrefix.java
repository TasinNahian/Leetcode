package org.example;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        longestCommonPrefix(strs);
    }
    public static String longestCommonPrefix(String[] strs) {
        int i = 0;
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        return null;
    }

}
