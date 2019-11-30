package drugiZjazd.onet.testClasses;

import org.testng.annotations.Test;

import drugiZjazd.onet.PageObjects.BasePage;
import drugiZjazd.onet.PageObjects.OnetMainPage;
import drugiZjazd.onet.utils.extentReports.ExtentTestManager;

import java.lang.reflect.Method;

public class OnetMainPageTest extends BaseTest {



  @Test
  public void showWordsThatStartsWithj(Method method) throws InterruptedException {

    ExtentTestManager
        .startTest(method.getName(), "Go to ONET.pl and show all words that starts with j");


    OnetMainPage onetMainPage = new OnetMainPage(getDriver());
    onetMainPage.GetOnetMainPage();
    onetMainPage.showWordsThatStartsWithJ();

  }
}
