import java.util.*;

public class Exercise21_01 {
    public static void main(String[] args) {
        String[] s1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        String[] s2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(s1));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(s2));
        
        System.out.println("The union of the two sets is " + union(set1,set2));
        System.out.println("The difference of the two sets is " + difference(set1,set2));
        Set<String> set3 = new LinkedHashSet<>(Arrays.asList(s1));
        System.out.println(set2);
        System.out.println("The intersection of the two sets is "+ intersect(set3,set2));
        
    }
       
    public static Set union(Set s1, Set s2) {
        s1.addAll(s2);
        return s1;
        
    }
    
    public static Set difference(Set s1, Set s2) {
        s1.removeAll(s2);
        return s1; 
    }
    
    public static Set intersect(Set s1, Set s2) {
        s1.retainAll(s2);
        return s1;
        
    }
}
/*

The union of the two sets is [George, Jim, John, Blake, Kevin, Michael, Katie, Michelle, Ryan]

The difference of the two sets is [Jim, John, Blake, Michael]

The intersection of the two sets is [George, Kevin]

*/
