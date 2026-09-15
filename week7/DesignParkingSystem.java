// Week 7 - Task 1
// Question: Design Parking System
// Platform: LeetCode
// https://leetcode.com/problems/design-parking-system/

class ParkingSystem {
    int[] slot;

    ParkingSystem(int big, int medium, int small) {
        slot = new int[]{0, big, medium, small};
    }

    public boolean addCar(int carType) {
        if (slot[carType] > 0) {
            slot[carType]--;
            return true;
        }

        return false;
    }
}
