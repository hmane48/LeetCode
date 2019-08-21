package _13_RomanToInteger;

class Solution {

    // Brute-Force solution
    private static int romanToIntBF(String s) {

        int num = 0;
        int i = s.length() - 1;
        while (i > 0) {
            if (s.charAt(i) == 'V' && s.charAt(i - 1) == 'I') {
                num = num + 4;
                i -= 2;
            } else if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'I') {
                num = num + 9;
                i -= 2;
            } else if (s.charAt(i) == 'L' && s.charAt(i - 1) == 'X') {
                num = num + 40;
                i -= 2;

            } else if (s.charAt(i) == 'C' && s.charAt(i - 1) == 'X') {
                num = num + 90;
                i -= 2;

            } else if (s.charAt(i) == 'D' && s.charAt(i - 1) == 'C') {
                num = num + 400;
                i -= 2;

            } else if (s.charAt(i) == 'M' && s.charAt(i - 1) == 'C') {
                num = num + 900;
                i -= 2;
            } else if (s.charAt(i) == 'I') {
                num = num + 1;
                i--;
            } else if (s.charAt(i) == 'V') {
                num = num + 5;
                i--;
            } else if (s.charAt(i) == 'X') {
                num = num + 10;
                i--;
            } else if (s.charAt(i) == 'L') {
                num = num + 50;
                i--;
            } else if (s.charAt(i) == 'C') {
                num = num + 100;
                i--;
            } else if (s.charAt(i) == 'D') {
                num = num + 500;
                i--;
            } else if (s.charAt(i) == 'M') {
                num = num + 1000;
                i--;
            }
        }

        if (i == 0) {
            if (s.charAt(i) == 'I') {
                num = num + 1;
                i--;
            } else if (s.charAt(i) == 'V') {
                num = num + 5;
                i--;
            } else if (s.charAt(i) == 'X') {
                num = num + 10;
                i--;
            } else if (s.charAt(i) == 'L') {
                num = num + 50;
                i--;
            } else if (s.charAt(i) == 'C') {
                num = num + 100;
                i--;
            } else if (s.charAt(i) == 'D') {
                num = num + 500;
                i--;
            } else if (s.charAt(i) == 'M') {
                num = num + 1000;
                i--;
            }
        }
        return num;
    }

    // Optimal Solution
    private static int romanToInt(String s) {

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            int s1 = toValue(s.charAt(i));

            if (i + 1 < s.length()) {
                int s2 = toValue(s.charAt(i+1));

                if(s1 >= s2){
                    num = num + s1;
                }else {
                    num = num + s2 - s1;
                    i++;
                }
            }else {
                num = num + s1;
            }
        }

        return num;
    }

    private static int toValue(char ch) {
        if (ch == 'I') {
            return 1;
        } else if (ch == 'V') {
            return 5;
        } else if (ch == 'X') {
            return 10;
        } else if (ch == 'L') {
            return 50;
        } else if (ch == 'C') {
            return 100;
        } else if (ch == 'D') {
            return 500;
        } else if (ch == 'M') {
            return 1000;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}