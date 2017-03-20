package util;

import star.Star;

import java.util.Comparator;

/**
 * Created by yyakup on 8/19/16.
 */
public class StarComparator implements Comparator<Star> {
    public int compare(Star o1, Star o2) {

        if (o1.getAge() < o2.getAge()) {
            return -1;
        } else if (o1.getAge() > o2.getAge()) {
            return  1;
        } else {
            return 0;
        }
    }
}
