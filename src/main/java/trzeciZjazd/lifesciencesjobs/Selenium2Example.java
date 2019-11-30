package trzeciZjazd.lifesciencesjobs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class Selenium2Example {

  @Test
  public void userCanLogInUsingCredentials() {

    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("http://lifesciencesjobs.pl/wp-login.php");

    String loginPageTitle = driver.getTitle();
    String expectedLoginPAgeTitle = "Log In ‹ WordPress — WordPress";
    Assert.assertEquals(loginPageTitle, expectedLoginPAgeTitle);

    WebElement loginInput = driver.findElement(By.id("user_login"));
    loginInput.sendKeys("lifescienceadmin");

    WebElement passwordInput = driver.findElement(By.id("user_pass"));
    passwordInput.sendKeys("Lifesciencepassword1");

    WebElement loginButton = driver.findElement(By.id("wp-submit"));
    loginButton.click();

    String dashboardPageTitle = driver.getTitle();
    String expectedDashboardPageTitle = "Dashboard ‹ WordPress — WordPress";
    Assert.assertEquals(dashboardPageTitle, expectedDashboardPageTitle);

    driver.quit();
  }

  @Test
  public void userCannotLoginWithincorretCredentials() throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("http://lifesciencesjobs.pl/wp-login.php");

    String loginPageTitle = driver.getTitle();
    String expectedLoginPAgeTitle = "Log In ‹ WordPress — WordPress";
    Assert.assertEquals(loginPageTitle, expectedLoginPAgeTitle);

    WebElement loginInput = driver.findElement(By.id("user_login"));
    loginInput.sendKeys("lifescienceadmin1");

    WebElement passwordInput = driver.findElement(By.id("user_pass"));
    passwordInput.sendKeys("Lifesciencepassworsd1");

    WebElement loginButton = driver.findElement(By.id("wp-submit"));
    loginButton.click();

    Assertions.assertTrue(driver.findElement(By.id("login_error")).isDisplayed());

    driver.quit();

  }

  public static void main(String[] args) throws InterruptedException {

    Selenium2Example selenium2Example = new Selenium2Example();

    selenium2Example.userCanLogInUsingCredentials();

    selenium2Example.userCannotLoginWithincorretCredentials();

  }
}
