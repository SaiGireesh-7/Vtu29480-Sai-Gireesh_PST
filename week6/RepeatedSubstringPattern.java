// Week 6 Task 2
// Question: Repeated Substring Pattern
// Platform: LeetCode
// https://leetcode.com/problems/repeated-substring-pattern/
class RepeatedSubstringPattern { public boolean repeatedSubstringPattern(String s){String x=s+s;return x.substring(1,x.length()-1).contains(s);} }
