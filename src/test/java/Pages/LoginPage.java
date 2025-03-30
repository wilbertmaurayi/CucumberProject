package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
// @findby pagetitle
    @FindBy(id = "user-name")
    WebElement id_username;

    @FindBy(id = "password")
    WebElement id_password;

    @FindBy(id = "login-button")
    WebElement id_login_button;

    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(id_username));
        id_username.sendKeys(username);
    }
    public void enterPassword(String password) {
        id_password.sendKeys(password);
    }
    public void clickLoginButton() {
        id_login_button.click();
    }

}
