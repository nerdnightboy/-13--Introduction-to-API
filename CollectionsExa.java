/*
 * Collections Example
 */
import java.util.*;

public class CollectionsExa {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>(); //Collection Class
        al.add(2);
        al.add(43);
        al.add(89);
        al.add(8);
        al.add(38);

        for(int a : al){
            System.out.println(a);
        }
    }
}
