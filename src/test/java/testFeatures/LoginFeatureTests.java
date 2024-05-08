package testFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

import appFeatures.AppLogin;

public class LoginFeatureTests {
	
	AppLogin apl = new AppLogin();
	
	@Test
	void login_test1() {
		
		boolean status = apl.login("admin", "admin");
		Assert.assertEquals(status, true);
		
	}
	
	@Test
	void login_test2() {
		
		boolean status = apl.login("admin123", "admin123");
		Assert.assertEquals(status, false);
		
	}

}
