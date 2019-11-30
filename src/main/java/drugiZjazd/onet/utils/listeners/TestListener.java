package drugiZjazd.onet.utils.listeners;

import com.relevantcodes.extentreports.LogStatus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import drugiZjazd.onet.testClasses.BaseTest;
import drugiZjazd.onet.utils.extentReports.ExtentManager;
import drugiZjazd.onet.utils.extentReports.ExtentTestManager;

public class TestListener extends BaseTest implements ITestListener {


  public static final Logger log = LogManager.getLogger(TestListener.class.getName());

  private static String getTestMethodName(ITestResult iTestResult) {
    return iTestResult.getMethod().getConstructorOrMethod().getName();
  }

  public void onTestStart(ITestResult iTestResult) {
    System.out
        .println("I am in onTestStart method" + getTestMethodName(iTestResult) + " test started");
  }

  public void onTestSuccess(ITestResult iTestResult) {
    System.out
        .println(
            "I am in onTestSuccess method " + getTestMethodName(iTestResult) + " Test succeed");

    ExtentTestManager.getTest().log(LogStatus.PASS, " Test passed");
  }

  public void onTestFailure(ITestResult iTestResult) {
    System.out
        .println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " Test failed");

    Object testClass = iTestResult.getInstance();
    WebDriver webDriver = ((BaseTest) testClass).getDriver();

    //Take base64Screenshot screenshot.
    String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) webDriver).
        getScreenshotAs(OutputType.BASE64);

    //ExtentReports log and screenshot operations for failed tests.
    ExtentTestManager.getTest().log(LogStatus.FAIL, " Test Failed",
                                    ExtentTestManager.getTest()
                                        .addBase64ScreenShot(base64Screenshot));

  }

  public void onTestSkipped(ITestResult iTestResult) {
    System.out
        .println("I am in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
    //ExtentReports log operation for skipped tests.
    ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");

  }

  public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    System.out.println(
        "Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
  }


  public void onStart(ITestContext iTestContext) {
    System.out.println("I am in onStart method " + iTestContext.getName());
    iTestContext.setAttribute("WebDriver", this.getDriver());
  }

  public void onFinish(ITestContext iTestContext) {
    System.out.println("I am in onFinish method " + iTestContext.getName());
    //Do tier down operations for extentreports reporting!
    ExtentTestManager.endTest();
    ExtentManager.getReporter().flush();

  }
}
