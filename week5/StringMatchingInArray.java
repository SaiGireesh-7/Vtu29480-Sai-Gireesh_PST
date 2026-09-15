// Week 5 Task 9
// Question: String Matching in an Array
// Platform: LeetCode
// https://leetcode.com/problems/string-matching-in-an-array/
import java.util.*;
class StringMatchingInArray { public List<String> stringMatching(String[]w){List<String>r=new ArrayList<>();for(int i=0;i<w.length;i++){for(int j=0;j<w.length;j++)if(i!=j&&w[j].contains(w[i])){r.add(w[i]);break;}}return r;} }
