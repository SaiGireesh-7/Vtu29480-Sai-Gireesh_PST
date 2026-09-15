// Week 8 - Task 1
// Question: Override getNumberOfTeamMembers() in Soccer to print 11 players.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-method-overriding/
class Sports {
    String getName(){ return "Generic Sports"; }
    void getNumberOfTeamMembers(){ System.out.println("Each team has n players in " + getName()); }
}
class Soccer extends Sports {
    @Override String getName(){ return "Soccer Class"; }
    @Override void getNumberOfTeamMembers(){ System.out.println("Each team has 11 players in " + getName()); }
}
public class JavaMethodOverriding {
    public static void main(String[] args) {
        Sports s = new Sports(); s.getNumberOfTeamMembers();
        Soccer soccer = new Soccer(); soccer.getNumberOfTeamMembers();
    }
}
