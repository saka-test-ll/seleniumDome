package testCase;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import business.CreateFlowBusiness;
import org.testng.annotations.*;


public class CreateFlowCase extends CaseBase {

    public DriverBase driver;
    public ProUtil proUtil;
    public HandleCookie handleCookie;
    public CreateFlowBusiness createFlowBusiness;


    @BeforeClass
    public void createFormBeforeClass() {
        this.driver = InitDriver("chrowe");
        proUtil = new ProUtil("src\\main\\resources\\loginTest.properties");
        createFlowBusiness = new CreateFlowBusiness(driver);
        handleCookie = new HandleCookie(driver);
        driver.getUrl(proUtil.getPro("homeURL"));
        handleCookie.delectCookie();
        handleCookie.setCookie();
        driver.getUrl(proUtil.getPro("homeURL"));
        driver.windowMax();
    }

    @Test()
    public void FlowDesign() {
        createFlowBusiness.addFlow();

    }
}