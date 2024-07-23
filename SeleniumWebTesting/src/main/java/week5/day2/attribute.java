package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class attribute {
	@Test(priority =  - 1)
	public void eatnoodles() {
		System.out.println("chicken noodles");
		// TODO Auto-generated method stub

	}
	@Test
    public void friedrice() {
		// TODO Auto-generated method stub
     System.out.println("your fried rice is ready");
	}
    @Test(enabled=true)
    public void biriyani() {
		// TODO Auto-generated method stub
   System.out.println("mutton biriyani");
	}
    @Ignore
    @Test
    public void tiffin() {
		// TODO Auto-generated method stub

    	System.out.println("ur idly is ready");
	}
    

}
