package drugiZjazd.onet.PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

  public static final Logger log = LogManager.getLogger(BasePage.class.getName());
  private static final int TIMEOUT = 5; //seconds
  private static final int POLLING = 100; //milliseconds

  protected WebDriver driver;
  private WebDriverWait wait;

  public BasePage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, TIMEOUT, POLLING);
    PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
  }

  public void waitForElementToAppear(WebElement locator) {
    wait.until(ExpectedConditions.visibilityOf(locator));
  }

  public void waitForElementToDisappear(By locator) {
    wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
  }

  public void waitForTextToDisappear(By locator, String text) {
    wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
  }
}