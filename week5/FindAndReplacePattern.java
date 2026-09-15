// Week 5 Task 8
// Question: Find and Replace Pattern
// Platform: LeetCode
// https://leetcode.com/problems/find-and-replace-pattern/

import java.util.*;

class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for (String word : words) {
            if (match(word, pattern)) {
                ans.add(word);
            }
        }

        return ans;
    }

    boolean match(String word, String pattern) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            char b = pattern.charAt(i);

            if (map.containsKey(a)) {
                if (map.get(a) != b) return false;
            } else {
                if (used.contains(b)) return false;
                map.put(a, b);
                used.add(b);
            }
        }

        return true;
    }
}