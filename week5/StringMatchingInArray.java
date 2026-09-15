// Week 5 Task 9
// Question: String Matching in an Array
// Platform: LeetCode
// https://leetcode.com/problems/string-matching-in-an-array/

import java.util.*;

class StringMatchingInArray {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }
        }

        return ans;
    }
}