// Week 6 Task 6
// Question: Find All Anagrams in a String
// Platform: LeetCode
// https://leetcode.com/problems/find-all-anagrams-in-a-string/

import java.util.*;

class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) {
            need[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;

            if (i >= p.length()) {
                window[s.charAt(i - p.length()) - 'a']--;
            }

            if (Arrays.equals(need, window)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}