package collection;

import org.junit.*;
import org.junit.Test;
import star.Star;
import util.StarComparator;

import java.util.*;

/**
 * Created by yyakup on 8/19/16.
 */
public class Run {

    public static void main(String[] args) {
        // testHashMap();
        // testTreeMap();
      //  testHashSet();
       // testTreeSet();
    }
    @Test
    public  void testHashSet() {
        Star st1 = new Star(1, "Star1");
        Star st2 = new Star(2, "Star2");
        Star st3 = new Star(3, "Star3");
        Star st4 = new Star(4, "Star4");
        Star st5 = new Star(4, "Star4");


        Set<Star> sets =  new HashSet<Star>();
        sets.add(st1);
        sets.add(st2);
        sets.add(st3);
        sets.add(st4);
        sets.add(st5);
        Iterator<Star> keyIterate = sets.iterator();
        while (keyIterate.hasNext()) {
            System.out.println(keyIterate.next().getName());
        }
    }
    @org.junit.Test
    public  void testTreeSet() {
        Star st1 = new Star(1, "Star1");
        Star st2 = new Star(2, "Star2");
        Star st3 = new Star(3, "Star3");
        Star st4 = new Star(4, "Star4");
        Star st5 = new Star(4, "Star4");

        Set<Star> sets =  new TreeSet<Star>(new StarComparator());
        sets.add(st1);
        sets.add(st2);
        sets.add(st3);
        sets.add(st4);
        sets.add(st5);
        Iterator<Star> keyIterate = sets.iterator();
        while (keyIterate.hasNext()) {
            System.out.println(keyIterate.next().getName());
        }
    }
    @Test
    public void testSortedSet() {
        Set<String> sets = new HashSet<String>();
        sets.add("Yari");
        sets.add("Yari");
        sets.isEmpty();
    }

    public  <T extends Collection<Number>> T testGenericCollection(T t) {
        T name = t;
        t.iterator();
        return name;

    }
}
