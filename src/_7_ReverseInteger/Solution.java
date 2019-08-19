package _7_ReverseInteger;

import java.util.ArrayList;

public class Solution {

    public static int reverse(int x) {
        int i = x;
        int rev = 0, pop, push;
        while (i != 0) {

            //pop operation
            pop = i % 10;
            i /= 10;

            //push operation
            if ((rev > Integer.MAX_VALUE / 10) || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if ((rev < Integer.MIN_VALUE / 10) || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            push = rev * 10 + pop;
            rev = push;
        }

        return rev;
    }

    public static void main(String[] args) {

        System.out.println(reverse(1534236469));
    }
}
