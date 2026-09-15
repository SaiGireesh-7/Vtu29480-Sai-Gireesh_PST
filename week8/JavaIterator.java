// Week 8 - Task 5
// Question: Print only elements after the special string ### using Iterator.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-iterator/problem
import java.util.*;
class JavaIterator {
    static void func(ArrayList<Object> mylist) {
        Iterator<Object> it = mylist.iterator();
        while (it.hasNext()) {
            if (it.next().equals("###")) break;
        }
        while (it.hasNext()) System.out.println(it.next());
    }
}
