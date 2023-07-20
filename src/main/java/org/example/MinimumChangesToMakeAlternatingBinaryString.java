package org.example;

public class MinimumChangesToMakeAlternatingBinaryString {
    public static void main(String[] args) {
        String s = "1111";
//        String s = "01010101";
//        String s = "10101010";
        int count = 0;
        char [] ch = s.toCharArray();
        int j;
        for(int i = 0; i<ch.length-1; i++){
            j = i+1;
            if(ch[i] == ch[j]){
                ch[j] = (ch[j] == '1') ? '0':'1';
                for(int k = 0, len = 0, z = 0; k<ch.length-1; k++){
                    z = k+1;
                    if(ch[k]!=ch[z]){
                        len++;
                    }
                    if(len == ch.length-1){
                        count++;
                    }
                }
                String string  = new String(ch);
                System.out.println(string);
            }
        }
    }
}
