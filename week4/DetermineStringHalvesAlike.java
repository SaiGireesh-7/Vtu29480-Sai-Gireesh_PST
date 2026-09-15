// Week 4 Task 1
// Question: Determine if String Halves Are Alike
// Platform: LeetCode
// https://leetcode.com/problems/determine-if-string-halves-are-alike/

class DetermineStringHalvesAlike {
    public boolean halvesAreAlike(String s) {
        int n = s.length() / 2;
        int a = 0;
        int b = 0;
        String v = "aeiouAEIOU";

        for (int i = 0; i < n; i++) {
            if (v.indexOf(s.charAt(i)) >= 0) {
                a++;
            }
        }

        for (int i = n; i < s.length(); i++) {
            if (v.indexOf(s.charAt(i)) >= 0) {
                b++;
            }
        }

        return a == b;
    }
}