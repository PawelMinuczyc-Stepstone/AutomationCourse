package drugiZjazd.onet.testClasses;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

  ChromeDriver driver;
  public static final Logger log = LogManager.getLogger(BaseTest.class.getName());


  @BeforeSuite
  public void beforeSuite() {

    System.setProperty("headless", "false");
    String headless = System.getProperty("headless");

    if ("true".equals(headless)) {
      ChromeOptions chromeOptions = new ChromeOptions();
      chromeOptions.addArguments("--headless");
      driver = new ChromeDriver(chromeOptions);
    } else {
      driver = new ChromeDriver();
    }
  }

  @AfterSuite
  public void afterSuite() {
    if (null != driver) {
      driver.close();
      driver.quit();
    }
  }

  public WebDriver getDriver() {
    return driver;
  }
}
