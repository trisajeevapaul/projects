package week5.day2;

import org.testng.annotations.Test;

public class invocation {
	@Test(invocationCount=3,invocationTimeOut=3000,threadPoolSize=2)
	public void biriyani() throws InterruptedException {
    Thread.sleep(2000);
		System.out.println("adyar anandha bhavan");
	}
	@Test
	private void garlicnaan() {
		System.out.println("ramanas");// TODO Auto-generated method stub

	}

}


