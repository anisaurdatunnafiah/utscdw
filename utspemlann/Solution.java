package utspemlann;

import java.util.Arrays;

public class Solution {
    
    public static String[] stringToArray(String s) {
        String[] words = s.split("\\s+");
        return words;
    }
    
    public static void main(String[] args) {
        String input1 = "Robin Singh";
        String[] result1 = stringToArray(input1);
        System.out.println(Arrays.toString(result1));
        
        String input2 = "I love arrays they are my favorite";
        String[] result2 = stringToArray(input2);
        System.out.println(Arrays.toString(result2));
    }
}
