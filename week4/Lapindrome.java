// Week 4 Task 2
// Question: Lapindrome
// Platform: CodeChef
// https://www.codechef.com/problems/LAPIN

import java.util.*;

public class Lapindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int m = n / 2;
            int[] a = new int[26];

            for (int i = 0; i < m; i++) {
                a[s.charAt(i) - 'a']++;
            }

            for (int i = (n + 1) / 2; i < n; i++) {
                a[s.charAt(i) - 'a']--;
            }

            boolean ok = true;
            for (int x : a) {
                if (x != 0) {
                    ok = false;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}