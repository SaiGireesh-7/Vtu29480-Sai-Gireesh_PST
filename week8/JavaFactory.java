// Week 8 - Task 8
// Question: Implement FoodFactory.getFood(String) to return Pizza or Cake.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-factory/problem
interface Food { String getType(); }
class Pizza implements Food { public String getType(){ return "Someone ordered Fast Food!"; } }
class Cake implements Food { public String getType(){ return "Someone ordered a Dessert!"; } }
class FoodFactory {
    public Food getFood(String order) {
        if(order.equals("pizza")) return new Pizza();
        return new Cake();
    }
}
