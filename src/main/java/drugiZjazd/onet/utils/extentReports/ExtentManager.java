package drugiZjazd.onet.utils.extentReports;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentManager {

  private static ExtentReports extent;
  private static ExtentTest logger;


  public synchronized static ExtentReports getReporter() {
    if (extent == null) {
      String workingDir = System.getProperty("user.dir");
      extent =
          new ExtentReports(workingDir
                            + "/src/test/java/utils/extentReports/test.html",
                            false);
    }
    return extent;
  }


}
