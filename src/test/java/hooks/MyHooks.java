package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class MyHooks {
	@Before(order=1)
	public void setUp1() {
		System.out.println("This is start1");
	}
	
	@Before(order=2)
	public void setUp2() {
		System.out.println("This is start2");
		}
	
	@BeforeStep // this can be used to write a method that takes screenshots after every step
	public void beforeEveryStep() {
		System.out.println("This step comes before every step");
	}
	
	@Before("@Smoke")
	public void hookWithTag(Scenario sc) {
		System.out.println("This is before hook with tag");
	    System.out.println(sc.getName());
	}
	
	@After(order=1)
	public void tearDown1() {
		System.out.println("This is end1");
	}
	
	@After(order=2)
	public void tearDown2() {
		System.out.println("This is end2");
	}	

}
