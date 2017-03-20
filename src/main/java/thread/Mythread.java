package thread;

import collection.Run;

import java.util.concurrent.Callable;

/**
 * Created by yyakup on 2/15/17.
 */
public class Mythread implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
       System.out.println("Now its time: " + System.currentTimeMillis());
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    public String call() throws Exception {
        return "Yari";
    }
}
