package collection;

import org.junit.Test;
import star.Star;
import util.StarComparator;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yyakup on 8/23/16.
 */
public class MapTest {

    public static void main(String[] args) {
        // testHashMap();
         // testTreeMap();
      //  sortString("Hi There ! Yari Chood you rock");
        Class clz = ArrayList.class;
        System.out.print(clz.getClassLoader().getParent());
//
    }
    @Test
    public  void testHashMap() {
        ArrayList arrayList =  new ArrayList();
        arrayList.add(123);

        Star st1 = new Star(1, "Star1");
        Star st2 = new Star(2, "Star2");
        Star st3 = new Star(3, "Star3");
        Star st4 = new Star(4, "Star4");
        Map maps =  new ConcurrentHashMap();
        maps.put(123,123);
        maps.put(st1,st1);
        maps.put(st2,st2);
        maps.put(st3,st3);
        maps.put(st4,st4);
        Iterator<Star> keyIterate = maps.keySet().iterator();


        while (keyIterate.hasNext()) {
            System.out.println(keyIterate.next());
           // maps.remove(st1);
        }
        System.out.print(maps.size());

    }
    @Test
    public  void testTreeMap() {
        Star st1 = new Star(1, "Star1");
        Star st2 = new Star(2, "Star2");
        Star st3 = new Star(3, "Star3");
        Star st4 = new Star(4, "Star4");
        Map<Star, Star> maps =  new TreeMap<Star, Star>(new StarComparator());
        maps.put(st1,st1);
        maps.put(st2,st2);
        maps.put(st3,st3);
        maps.put(st4,st4);
        Iterator<Map.Entry<Star, Star>> keyIterate = maps.entrySet().iterator();
        while (keyIterate.hasNext()) {
            System.out.println(keyIterate.next().getKey());
        }
    }


    public static void sortString(String strings) {
        String[] needSort = strings.split("\\s");
        String tempS;
        boolean sorted = true;
        while (sorted) {
            sorted = false;
            for (int i = 0; i < needSort.length - 1; i++) {
                if (needSort[i].length() > needSort[i+1].length()) {
                    tempS = needSort[i+1];
                    needSort[i+1] = needSort[i];
                    needSort[i] = tempS;
                    sorted = true;
                }
            }
        }
    }
    @Test
    public void testIterator() {
     Map<String, String> hashMap = new HashMap();
    }

    @Test
    public void linkedHashMap() {
        Map<String, String> hashMap = new LinkedHashMap<String, String>();
        hashMap.put("YARI", "yAKUP");
        System.out.println(hashMap.getClass().getClass());
        Object[] objects = hashMap.getClass().getMethods();
        for (Object obj : objects) {
            System.out.print(obj.toString());
        }

    }
}
