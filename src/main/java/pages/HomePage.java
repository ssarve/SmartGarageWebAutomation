package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By logo = By.cssSelector("img[alt='logo']");
    By menu = By.xpath("//h1[contains(text(), 'Get Best Car / Bike Services')]");
    By banner = By.xpath("//img[contains(@src, 'mainhomebanner')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public boolean isLogoDisplayed() {
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isMenuPresent() {
        return driver.findElement(menu).isDisplayed();
    }

    public boolean isBannerVisible() {
        return driver.findElement(banner).isDisplayed();
    }
}
