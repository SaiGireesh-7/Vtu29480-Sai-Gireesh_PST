// Week 5 Task 7
// Question: Longest Substring Without Repeating Characters
// Platform: LeetCode
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
import java.util.*;
class LongestSubstringWithoutRepeating { public int lengthOfLongestSubstring(String s){Set<Character>set=new HashSet<>();int l=0,ans=0;for(int r=0;r<s.length();r++){while(set.contains(s.charAt(r)))set.remove(s.charAt(l++));set.add(s.charAt(r));ans=Math.max(ans,r-l+1);}return ans;} }
