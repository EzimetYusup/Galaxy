package cucumber;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by yyakup on 3/20/17.
 */
public class CucumberTest {
    private Object object;

    @When("Login happen")
    public void test() {
        object = new String("Yari aykup");
          System.out.print("yes happen");
    }

    @Then("Assert message")
    public void thenAssert() {
        boolean yes = object instanceof String;

    }
}
