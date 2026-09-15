// Week 7 - Task 4
// Question: Design browser history with visit, back and forward operations.
// Platform: LeetCode
// https://leetcode.com/problems/design-browser-history/
import java.util.*;
class BrowserHistory {
    List<String> history = new ArrayList<>();
    int current = 0;
    BrowserHistory(String homepage) { history.add(homepage); }
    public void visit(String url) {
        while (history.size() > current + 1) history.remove(history.size() - 1);
        history.add(url); current++;
    }
    public String back(int steps) {
        current = Math.max(0, current - steps); return history.get(current);
    }
    public String forward(int steps) {
        current = Math.min(history.size() - 1, current + steps); return history.get(current);
    }
}
