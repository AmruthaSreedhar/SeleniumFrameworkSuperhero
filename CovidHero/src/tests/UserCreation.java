package tests;

import java.io.IOException;


import org.testng.annotations.Test;

public class UserCreation extends TestBase{
		@Test
		public void setup () throws IOException {
			initialize() ;
		}
	
@Test
		public void loginTest() throws InterruptedException {
			System.out.print("Executing login test");
			driver.get(CONFIG.getProperty("testSiteName"));
			TestIUtil.doLogin("AMR");
			Thread.sleep(5000L);
		}
}
