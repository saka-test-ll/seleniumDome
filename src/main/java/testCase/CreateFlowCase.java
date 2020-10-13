package testCase;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import business.CreateFlowBusiness;
import handle.CreateFlowHandle;
import org.testng.annotations.*;


public class CreateFlowCase extends CaseBase {

    public DriverBase driver;
    public ProUtil proUtil;
    public HandleCookie handleCookie;
    public CreateFlowBusiness createFlowBusiness;
    public CreateFlowHandle createFlowHandle;


    @BeforeClass
    public void createFormBeforeClass() {
        this.driver = InitDriver("chrowe");
        proUtil = new ProUtil("src\\main\\resources\\loginTest.properties");
        createFlowBusiness = new CreateFlowBusiness(driver);
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
    public void FlowDesign() {
        createFlowBusiness.goToFlowManager();
        createFlowBusiness.addFlow();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void queryFlow(){
        createFlowBusiness.goToFlowManager();
        createFlowBusiness.queryFlow();
    }

    @Test
    public void designFlow(){
        createFlowBusiness.goToFlowManager();
        createFlowBusiness.queryFlow();
        createFlowBusiness.designFlow();
    }
}