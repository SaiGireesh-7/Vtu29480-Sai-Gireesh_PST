// Week 6 Task 9
// Question: Longest Palindromic Substring
// Platform: LeetCode
// https://leetcode.com/problems/longest-palindromic-substring/
class LongestPalindromicSubstring { public String longestPalindrome(String s){if(s.length()<2)return s;int st=0,en=0;for(int i=0;i<s.length();i++){int a=expand(s,i,i),b=expand(s,i,i+1),len=Math.max(a,b);if(len>en-st+1){st=i-(len-1)/2;en=i+len/2;}}return s.substring(st,en+1);}int expand(String s,int l,int r){while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){l--;r++;}return r-l-1;} }
