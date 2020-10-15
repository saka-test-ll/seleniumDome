package testCase;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import business.MyPendingTaskBusiness;
import handle.MyPendingTaskHandle;
import org.testng.annotations.*;


public class MyPendingTaskCase extends CaseBase {

    public DriverBase driver;
    public ProUtil proUtil;
    public HandleCookie handleCookie;
    public MyPendingTaskBusiness myPendingTaskBusiness;
    public MyPendingTaskHandle myPendingTaskHandle;


    @BeforeClass
    public void createFormBeforeClass() {
        this.driver = InitDriver("chrowe");
        proUtil = new ProUtil("src\\main\\resources\\loginTest.properties");
        myPendingTaskBusiness = new MyPendingTaskBusiness(driver);
        driver.implicitlywait();
        handleCookie = new HandleCookie(driver);
        driver.implicitlywait();
        driver.getUrl(proUtil.getPro("homeURL"));
        driver.implicitlywait();
        handleCookie.delectCookie();
        driver.implicitlywait();
        handleCookie.setCookie();
        driver.implicitlywait();
        driver.getUrl(proUtil.getPro("homeURL"));
        driver.windowMax();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void queryPendingTask() {
        myPendingTaskBusiness.goToMyPendingTask();
        myPendingTaskBusiness.queryPendingTask();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myPendingTaskBusiness.agreeMypendingTask();
    }
}
