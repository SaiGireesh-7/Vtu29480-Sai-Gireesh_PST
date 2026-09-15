// Week 4 Task 6
// Question: Move Zeroes
// Platform: LeetCode
// https://leetcode.com/problems/move-zeroes/
class MoveZeroes { public void moveZeroes(int[] nums){int k=0;for(int x:nums)if(x!=0)nums[k++]=x;while(k<nums.length)nums[k++]=0;} }
