package thread;

import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.PlatformLoggingMXBean;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by yyakup on 2/15/17.
 */
public class ThreadTest {


    @Test
    public void testThread() {
//        Mythread my1 = new Mythread();
//        Mythread my2 = new Mythread();
//        Mythread my3 = new Mythread();
//        LinkedList<Thread> linkedList = new LinkedList<Thread>();
//        linkedList.add(my1);
//        linkedList.add(my1);
//        linkedList.add(my1);
//        try {
//            MyThreadPool.getReady(linkedList);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        MyThreadPool myThreadPool = new MyThreadPool();
//        System.out.print(myThreadPool.i);
//        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
//        bean.findDeadlockedThreads();
        Thread th = new Thread(new Mythread());
          th.run();
       // System.out.println(bean.findDeadlockedThreads().length);
    }
    @Test
    public void testThreadExcutionService() {
        BlockingQueue<Runnable> pool = new ArrayBlockingQueue<Runnable>(10);
        ThreadPoolExecutor tp = new ThreadPoolExecutor(10,12,50000L, TimeUnit.MICROSECONDS, pool);
        for (int i =0 ; i< 20; i++) {
            System.out.print(i);
            tp.execute(new Mythread());
        }
      //  tp.execute(new Mythread());
    }
}
