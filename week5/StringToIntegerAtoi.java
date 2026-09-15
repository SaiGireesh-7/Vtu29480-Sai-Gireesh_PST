// Week 5 Task 5
// Question: String to Integer (atoi)
// Platform: LeetCode
// https://leetcode.com/problems/string-to-integer-atoi/

class StringToIntegerAtoi {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int ans = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int d = s.charAt(i) - '0';

            if (ans > (Integer.MAX_VALUE - d) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            ans = ans * 10 + d;
            i++;
        }

        return ans * sign;
    }
}