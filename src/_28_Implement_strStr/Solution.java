package _28_Implement_strStr;

/*
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * */
public class Solution {
    public static int strStr(String haystack, String needle) {

        int longer = haystack.length();
        int shorter = needle.length();

        if(longer < shorter){
            return -1;
        }else if(longer == shorter){
            return 0;
        }

        for (int i = 0; i <= longer - shorter; i++){
            if (haystack.substring(i, i + shorter ).equals(needle)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println(strStr("mississippi",
                "issipi"));
        String haystack = "aaa";
        //System.out.println(haystack.substring(0, 1 ));
    }
}
