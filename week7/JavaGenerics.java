// Week 7 - Task 9
// Question: Write one generic printArray method that prints integer and string arrays.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-generics/problem
class JavaGenerics {
    public static <T> void printArray(T[] array) {
        for (T x : array) System.out.println(x);
    }
}
