package Tests;

import com.intuit.karate.junit5.Karate;

public class RunnerTest {
	
	  @Karate.Test
	    Karate testSample() {
	        return Karate.run("login").relativeTo(getClass());
	    }

}
