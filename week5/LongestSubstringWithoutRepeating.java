// Week 5 Task 7
// Question: Longest Substring Without Repeating Characters
// Platform: LeetCode
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.*;

class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}