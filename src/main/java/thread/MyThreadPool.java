package thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by yyakup on 2/15/17.
 */
public class MyThreadPool {
   public int i;

    public static void getReady(LinkedList<Thread> listOfThread) throws InterruptedException {
        Iterator<Thread> iterator = listOfThread.iterator();

        while(iterator.hasNext()) {
            Thread thread = iterator.next();
            thread.start();
            thread.join();
        }

    }

    {
         i =11123123;
    }
}
