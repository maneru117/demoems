package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    //WebElement Head() {
      //  return driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg btn-block text-wrap home-buttons']"));
    //}
    WebElement Employee(){
        return driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg btn-block text-wrap home-buttons']"));
    }
    WebElement Createemployee() {
        return driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm mb-3 bottom-margin']"));
    }
    WebElement Clicktitle() {
        return driver.findElement(By.xpath("//select[@id='title']"));
    }
    WebElement Selecttitle() {
        return driver.findElement(By.xpath("//*[@id=\"title\"]/option[2]"));
    }
    WebElement Firstname() {
        return driver.findElement(By.xpath("//input[@id='firstName']"));
    }
    WebElement Lastname() {
        return driver.findElement(By.xpath("//input[@id='lastName']"));
    }
    WebElement Empemail() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }
    WebElement Position() {
        return driver.findElement(By.xpath("//input[@id='positionApplied']"));
    }
    WebElement Reference() {
        return driver.findElement(By.xpath("//input[@id='referenceNumber']"));
    }
    //WebElement Success() {
      //  return driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed();
    //}


    WebElement Createemp(){
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }
  /*  public boolean checkHomePageDisplay() {
        try {
            return Head().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }*/
  public void setFirstname(String firstname) {
      Firstname().sendKeys(firstname);
  }
    public  void setLastname(String lastname){
        Lastname().sendKeys(lastname);
    }
    public void setEmpemail(String email) {
        Empemail().sendKeys(email);
    }
    public  void setPosition(String Position){
        Position().sendKeys(Position);
    }
    public  void setReference(String Reference){
        Reference().sendKeys(Reference);
    }
    public void ClickLogout(){
        Createemp().click();
}
    public void Clickemployee(){
        Employee().click();
    }
    public void Clickcreateemployee(){
        Createemployee().click();
    }
}
