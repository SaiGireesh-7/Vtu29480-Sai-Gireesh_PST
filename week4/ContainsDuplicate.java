// Week 4 Task 4
// Question: Contains Duplicate
// Platform: LeetCode
// https://leetcode.com/problems/contains-duplicate/

import java.util.*;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }

        return false;
    }
}