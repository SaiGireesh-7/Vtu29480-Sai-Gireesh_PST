// Week 5 Task 10
// Question: Naive Pattern Searching
// Platform: GeeksforGeeks
// https://www.geeksforgeeks.org/dsa/naive-algorithm-for-pattern-searching/
public class NaivePatternSearching { public static void search(String text,String pat){for(int i=0;i<=text.length()-pat.length();i++){int j=0;while(j<pat.length()&&text.charAt(i+j)==pat.charAt(j))j++;if(j==pat.length())System.out.println(i);}} }
