// Week 5 Task 8
// Question: Find and Replace Pattern
// Platform: LeetCode
// https://leetcode.com/problems/find-and-replace-pattern/
import java.util.*;
class FindAndReplacePattern { public List<String> findAndReplacePattern(String[] words,String p){List<String>r=new ArrayList<>();for(String w:words)if(ok(w,p))r.add(w);return r;}boolean ok(String w,String p){Map<Character,Character>a=new HashMap<>(),b=new HashMap<>();for(int i=0;i<w.length();i++){char x=w.charAt(i),y=p.charAt(i);if((a.containsKey(x)&&a.get(x)!=y)||(b.containsKey(y)&&b.get(y)!=x))return false;a.put(x,y);b.put(y,x);}return true;} }
