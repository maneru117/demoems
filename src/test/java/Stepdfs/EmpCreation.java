package Stepdfs;

import PageObjects.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class EmpCreation {
    WebDriver driver;
    HomePage hm = new HomePage(driver);
    @Given("the user is on the open page")
    public void theUserIsOnTheOpenPage() {
        hm.Clickemployee();

    }

    @And("the user clicks on the Employees link")
    public void theUserClicksOnTheEmployeesLink() {
        hm.Clickemployee();
    }

    @When("the user enters the employees page")
    public void theUserEntersTheEmployeesPage() {
    }

    @And("the user clicks on the Create Employee button")
    public void theUserClicksOnTheCreateEmployeeButton() {
        hm.Clickcreateemployee();
    }

    @And("the user fills in the employee details as follows:")
    public void theUserFillsInTheEmployeeDetailsAsFollows(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : data) {
            hm.setFirstname(row.get("First Name"));
            hm.setLastname(row.get("Last Name"));
            hm.setEmpemail(row.get("Email"));
            hm.setPosition(row.get("Position"));
            hm.setReference(row.get("Reference"));
        }
    }
    @And("the user clicks the Create Employee button")
    public void theUserClicksTheCreateEmployeeButton() {
        hm.Clickcreateemployee();
    }

    @Then("the user should see the new employee on the employee details page")
    public void theUserShouldSeeTheNewEmployeeOnTheEmployeeDetailsPage() {
        boolean status= driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed();
        Assert.assertEquals(status, true);
    }

}
