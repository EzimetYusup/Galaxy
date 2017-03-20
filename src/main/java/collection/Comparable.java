package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yyakup on 2/14/17.
 */
public class Comparable {


    @org.junit.Test
    public void testOrder() {
//        List<Car> list = new ArrayList<Car>();
//        Car car1 = new Car(2013, "Honda");
//        Car car2 = new Car(2000, "Acuura");
//        System.out.println(car1.compareTo(car2));
//
//        list.add(car1);
//        list.add(car2);
////        list.add(new Car(2000, "Audi"));
////        list.add(new Car(1989, "Benz"));
////        list.add(new Car(2000, "Acuura"));
//
//        Collections.sort(list);
//        for (Car car: list) {
//            System.out.println(car.toString());
//        }
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("YariYakup");
        linkedList.add("YariYakup");
        linkedList.add("YariYakup");
        linkedList.add("YariYakup");
        String value = linkedList.get(1);
    }
}
