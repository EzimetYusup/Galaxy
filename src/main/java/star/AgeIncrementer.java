package star;

/**
 * Created by yyakup on 6/13/16.
 */
public class AgeIncrementer implements Runnable {
    private static Earth e;


    public AgeIncrementer(Earth e) {
      this.e = e;

    }

    public void run() {
      e.addAge();

    }
}
