package Stepdfs;

import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
      driver= new ChromeDriver();
      driver.get("https://minidemo.skilledems.com/login");

    }

    @When("the user enters valid credentials username {string} pwd {string}")
    public void theUserEntersValidCredentialsUsernamePwd(String username, String pwd) {
        LoginPage bc = new LoginPage(driver);
        bc.setuserName(username);
        bc.setPassword(pwd);

    }

    @And("clicks the login button")
    public void clicksTheLoginButton() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("the user should be redirected to the dashboard")
    public void theUserShouldBeRedirectedToTheDashboard() {
        boolean status= driver.findElement(By.xpath("//a[@class='navbar-brand']")).isDisplayed();
        Assert.assertEquals(status, true);
    }


}
