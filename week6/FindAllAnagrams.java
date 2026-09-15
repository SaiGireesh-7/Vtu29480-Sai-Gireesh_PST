// Week 6 Task 6
// Question: Find All Anagrams in a String
// Platform: LeetCode
// https://leetcode.com/problems/find-all-anagrams-in-a-string/
import java.util.*;
class FindAllAnagrams { public List<Integer> findAnagrams(String s,String p){List<Integer>r=new ArrayList<>();if(s.length()<p.length())return r;int[]a=new int[26],b=new int[26];for(char c:p.toCharArray())a[c-'a']++;for(int i=0;i<s.length();i++){b[s.charAt(i)-'a']++;if(i>=p.length())b[s.charAt(i-p.length())-'a']--;if(Arrays.equals(a,b))r.add(i-p.length()+1);}return r;} }
