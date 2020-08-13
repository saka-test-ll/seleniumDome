package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestngRetry implements IRetryAnalyzer {

    /**
     *  测试用例最大失败次数
     */
    private static int maxRetryCount = 3;
    /**
     *  统计测试用例失败的次数
     */
    private int retryCount = 1;

    @Override
    public boolean retry(ITestResult result) {
        System.out.println(result);
        if (retryCount <= maxRetryCount) {
            String message = "执行用例："+result.getName()+"第"+retryCount+"次运行失败";
//                    "Running retry for '" + result.getName()
//                    + "' on class " + this.getClass().getName() + " Retrying "
//                    + retryCount + " times";
            Reporter.setCurrentTestResult(result);
            Reporter.log(message);
            retryCount++;
            return true;
        }
        return false;
    }
}
