package drugiZjazd.onet.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class OnetMainPage extends BasePage {

  private String regexppatern = "\\bj\\S*";

  public OnetMainPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(how = How.XPATH, using = "//span")
  WebElement jWords;

  @FindBy(how = How.XPATH, using = "//button[@class='cmp-button_button cmp-intro_acceptAll ']")
  WebElement introAcceptAll;

  public OnetMainPage GetOnetMainPage() throws InterruptedException {
    driver.get("https://www.onet.pl/");
    waitForElementToAppear(introAcceptAll);
    introAcceptAll.click();
    Thread.sleep(4000);
    return this;
  }


  public OnetMainPage showWordsThatStartsWithJ() {

    List<WebElement> elements = driver.findElements(By.xpath("//span"));



    for (int i = 1; i < elements.size(); i++) {
      System.out.println(elements.get(i).getText());
    }
    // Set<String> test = new HashSet<String>(Collections.singleton(pageSource));

    // System.out.println(test);

    return this;

  }
}
