// Week 7 - Task 5
// Question: Design a HashSet without using built-in hash table libraries.
// Platform: LeetCode
// https://leetcode.com/problems/design-hashset/

class MyHashSet {
    boolean[] set = new boolean[1000001];

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}
