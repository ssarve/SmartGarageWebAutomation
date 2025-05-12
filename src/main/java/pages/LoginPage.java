package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    By loginPopupButton = By.xpath("//div[text()='LOG IN']");
    By phoneInput = By.name("Mobile");
    By sendOtpButton = By.xpath("//div[text()='SEND OTP']");
    By otpInput = By.xpath("//input[@placeholder='Enter OTP']");
    By loginButton = By.xpath("//div[text()='LOGIN']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String phone, String otp) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(loginPopupButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneInput)).sendKeys(phone);
        wait.until(ExpectedConditions.elementToBeClickable(sendOtpButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(otpInput)).sendKeys(otp);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}
