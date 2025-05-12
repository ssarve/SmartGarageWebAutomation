package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void customerLoginAndHomepageValidation() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("1234567890", "197360");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.getHomePageTitle().contains("Smart Garage"), "Incorrect page title!");
        Assert.assertTrue(homePage.isLogoDisplayed(), "Logo not displayed!");
        Assert.assertTrue(homePage.isMenuPresent(), "Menu not present!");
        Assert.assertTrue(homePage.isBannerVisible(), "Banner not visible!");
    }
}
