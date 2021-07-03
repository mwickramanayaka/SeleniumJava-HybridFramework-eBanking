/**
 * 
 */
package eBanking.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import eBanking.pageObjects.LoginPage;

/**
 * @author manul.wickramanayaka
 *
 */
public class TC_LoginTest_01 extends BaseClass {

	@Test
	public void loginTest() {

		driver.get(baseURL);
		logger.info("URL is Opened");

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(userName);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickLogin();

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login test passed");
		}else {
			Assert.assertTrue(false);
			logger.error("login test failed");
		}


	}
}