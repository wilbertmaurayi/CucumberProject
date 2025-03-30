package Steps;

import Pages.LoginPage;
import Pages.ProductsPage;
import Utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;


public class StepDef {
    WebDriver driver;
    BrowserFactory browserFactory = new BrowserFactory();
    LoginPage loginPage;
    ProductsPage productsPage;

    @Given("I am on the Login Page")
    public void i_am_on_the_login_page() {
        driver = browserFactory.startApp("chrome", "https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @And("I enter the username admin")
    public void i_enter_the_username_admin() {
        loginPage.enterUsername("standard_user");
    }

    @And("I enter the password admin")
    public void i_enter_the_password_admin() {
        loginPage.enterPassword("secret_sauce");

    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
        productsPage= new ProductsPage(driver);
    }

    @Then("I must be directed to the Products Page")
    public void i_must_be_directed_to_the_products_page() {
        productsPage.verifyPageTitle();
        //browserFactory.quitApp();

    }
    @And("I click the Sauce Labs Backpack")
    public void i_click_the_sauce_labs_backpack() {

    }


}
