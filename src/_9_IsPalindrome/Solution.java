package _9_IsPalindrome;

import java.util.ArrayList;

public class Solution {

    // Brute-force
    public boolean isPalindromeBF(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int pop, size;

        ArrayList<Integer> list = new ArrayList<>();
        while (x != 0) {
            pop = x % 10;
            x /= 10;
            list.add(pop);
        }
        size = list.size();
        for (int i = 0; i < size / 2; i++) {
            if (list.get(i) != list.get(size - i - 1)) {
                return false;
            }
        }

        return true;
    }

    // Optimized Approach
    public boolean isPalindrome(int x) {
        int num = x;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNum = 0;
        while (x != 0) {
            revertedNum = revertedNum * 10 + (x % 10);
            x /= 10;
        }

        return revertedNum == num;

    }
}
