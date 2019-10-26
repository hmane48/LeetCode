package _387_First_Unique_Character_in_a_String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    // Brute-force technique
    public static int _firstUniqueChar(String s){
        int [] alpha = new int [26];
        int min_index = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++){
            alpha[s.charAt(i)-97]++;
        }

        System.out.println(Arrays.toString(alpha));

        for (int i = 0; i < 26; i++){
            if(alpha[i] == 1){
                if(s.indexOf((char)(i+97)) < min_index){
                    min_index = s.indexOf((char)(i+97));
                }
                System.out.println(min_index+" , "+s.indexOf((char)(i+97)));
            }

        }
        return min_index == Integer.MAX_VALUE ? -1 : min_index;
    }

    // Optimized one
    public int firstUniqChar(String s) {
        if (0 == s.length()) return -1;
        int ans = Integer.MAX_VALUE;
        int first = -1;
        int last = -1;
        for (char c = 'a'; c <= 'z'; c++) {
            first = s.indexOf(c);
            last = s.lastIndexOf(c);
            if (first != - 1 && first == last) {
                ans = Math.min(ans,first);
            }
        }
        return  (ans == Integer.MAX_VALUE) ? - 1 : ans;
    }

    public static void main(String[] args) {
        System.out.println(_firstUniqueChar("leetcode"));
    }
}
