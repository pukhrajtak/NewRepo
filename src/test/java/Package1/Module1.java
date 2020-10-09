package Package1;
import org.testng.annotations.Test;

public class Module1 {
	
	@Test(groups= {"SmokeTest"}) 
		public void show1() {
		
		
		System.out.println("we are in Show1 of Module 1");
	}

	
	@Test(groups= {"SmokeTest"}) 
	public void show2() {
	
	
	System.out.println("we are in Show2 of Module 1");
}
	
	
	@Test
	public void show3() {
	
	
	System.out.println("we are in Show3 of Module 1");
}
	
}
