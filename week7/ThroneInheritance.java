// Week 7 - Task 10
// Question: Implement birth, death and inheritance order for a family tree.
// Platform: LeetCode
// https://leetcode.com/problems/throne-inheritance/
import java.util.*;
class ThroneInheritance {
    String king;
    Map<String,List<String>> children = new HashMap<>();
    Set<String> dead = new HashSet<>();
    ThroneInheritance(String kingName) { king = kingName; }
    public void birth(String parentName, String childName) {
        children.computeIfAbsent(parentName, k -> new ArrayList<>()).add(childName);
    }
    public void death(String name) { dead.add(name); }
    public List<String> getInheritanceOrder() {
        List<String> ans = new ArrayList<>();
        dfs(king, ans);
        return ans;
    }
    void dfs(String name, List<String> ans) {
        if (!dead.contains(name)) ans.add(name);
        for (String child : children.getOrDefault(name, new ArrayList<>())) dfs(child, ans);
    }
}
