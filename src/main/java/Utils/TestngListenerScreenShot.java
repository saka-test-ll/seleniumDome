package Utils;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import testCase.CaseBase;

public class TestngListenerScreenShot extends TestListenerAdapter {

    @Override
    public void onTestSuccess(ITestResult tr){
        super.onTestSuccess(tr);
    }

    @Override
    public void onTestFailure(ITestResult tr){
        super.onTestFailure(tr);
        takeScreenShot(tr);
    }

    private void takeScreenShot(ITestResult tr){
        CaseBase base = (CaseBase) tr.getInstance();
        base.driver.takeScreenShot();
    }

    @Override
    public void onTestSkipped(ITestResult tr){
        super.onTestSkipped(tr);
    }

    @Override
    public void onTestStart(ITestResult result){
        super.onTestStart(result);
    }

    @Override
    public void onStart(ITestContext testContext){
        super.onStart(testContext);
    }

    @Override
    public void onFinish(ITestContext testContext){
        super.onFinish(testContext);
    }

}
