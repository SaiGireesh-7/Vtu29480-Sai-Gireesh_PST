// Week 5 Task 4
// Question: Maximum Sum Circular Subarray
// Platform: LeetCode
// https://leetcode.com/problems/maximum-sum-circular-subarray/

class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] a) {
        int total = 0;
        int curMax = 0;
        int max = a[0];
        int curMin = 0;
        int min = a[0];

        for (int x : a) {
            curMax = Math.max(x, curMax + x);
            max = Math.max(max, curMax);

            curMin = Math.min(x, curMin + x);
            min = Math.min(min, curMin);

            total += x;
        }

        return max < 0 ? max : Math.max(max, total - min);
    }
}