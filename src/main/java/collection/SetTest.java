package collection;

import org.junit.Test;
import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by yyakup on 2/14/17.
 */
public class SetTest {


    @Test
    public void testSet() {
       final Set<String> sets = new CopyOnWriteArraySet<String>();
        sets.add("ayaysdasdasdasd");
        sets.add("ayaysdasdasdasd");
        sets.add("ayaysdasdasdasd");
        sets.add("ayaysdasdasdasd");
        sets.add("ayaysdasdasdasdasdasdsd");
        System.out.print(sets.size());
        Iterator<String> it = sets.iterator();
        while (it.hasNext()) {
         //   sets.remove(it.next());
        }
        System.out.print(sets.size());

        Runnable runnable = new Runnable() {
            public void run() {
                // System.out.print("Yes yes");
                sets.add("yariasdasdasdasdsad");
                System.out.print(Thread.currentThread().getThreadGroup());
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
