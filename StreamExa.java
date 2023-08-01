/*
 * Stream Example
 */

import java.util.*;
import java.util.stream.Stream;
public class StreamExa {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>(); //Collection Class
        al.add(2);
        al.add(43);
        al.add(89);
        al.add(8);
        al.add(38);

        Stream<Integer> streamData = al.stream();
        Stream<Integer> sorted = streamData.sorted();
        sorted.forEach(n->System.out.println(n));
    }
}
