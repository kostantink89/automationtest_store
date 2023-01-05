package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BasePage implements ITestListener {


    public void onTestFailure(ITestResult result) {

        try {
            takeSnapShot(result.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

