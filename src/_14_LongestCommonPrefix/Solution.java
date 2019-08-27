package _14_LongestCommonPrefix;

public class Solution {

    // very naive approach (if the common sequence is st the start of the strings)
    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // Brute force solution
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        StringBuilder prefix = new StringBuilder();
        String s1 = strs[0];
        for (int j = 0; j < s1.length(); j++) {
            char ch = s1.charAt(j);
            int i = 1;
            while (i < strs.length) {
                if (strs[i].length()-1 < j ||  strs[i].charAt(j) != ch) {
                    return prefix.toString();
                }
                i++;
            }
            prefix.append(ch);
        }

        return prefix.toString();

    }


    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix1(strs1));
        System.out.println(longestCommonPrefix2(strs1));
    }
}
