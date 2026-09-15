// Week 7 - Task 3
// Question: Track check-ins/check-outs and return average travel time between stations.
// Platform: LeetCode
// https://leetcode.com/problems/design-underground-system/
import java.util.*;
class UndergroundSystem {
    Map<Integer, String> station = new HashMap<>();
    Map<Integer, Integer> time = new HashMap<>();
    Map<String, long[]> trips = new HashMap<>();
    public void checkIn(int id, String stationName, int t) {
        station.put(id, stationName); time.put(id, t);
    }
    public void checkOut(int id, String stationName, int t) {
        String key = station.get(id) + "#" + stationName;
        long[] a = trips.getOrDefault(key, new long[2]);
        a[0] += t - time.get(id); a[1]++;
        trips.put(key, a);
    }
    public double getAverageTime(String startStation, String endStation) {
        long[] a = trips.get(startStation + "#" + endStation);
        return (double)a[0] / a[1];
    }
}
