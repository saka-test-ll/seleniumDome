package Utils;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestngRetry implements IRetryAnalyzer {
    private static Logger logger = Logger.getLogger(TestngRetry.class);
    //测试用例最大失败次数
    private static int maxRetryCount = 3;
    //统计测试用例失败的次数
    private int retryCount = 1;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount <= maxRetryCount) {
            String message = "Running retry for '" + result.getName()
                    + "' on class " + this.getClass().getName() + " Retrying "
                    + retryCount + " times";
            logger.info(message);
            Reporter.setCurrentTestResult(result);
            Reporter.log("RunCount=" + (retryCount + 1));
            retryCount++;
            return true;
        }
        return false;
    }
}