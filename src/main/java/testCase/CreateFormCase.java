package testCase;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import business.CreateFlowBusiness;
import business.CreateFormBusiness;
import handle.CreateFlowHandle;
import handle.CreateFormHandle;
import org.testng.annotations.*;


public class CreateFormCase extends CaseBase {

    public DriverBase driver;
    public ProUtil proUtil;
    public HandleCookie handleCookie;
    public CreateFormBusiness createFormBusiness;
    public CreateFormHandle createFormHandle;


    @BeforeClass
    public void createFormBeforeClass() {
        this.driver = InitDriver("chrowe");
        proUtil = new ProUtil("src\\main\\resources\\loginTest.properties");
        createFormBusiness = new CreateFormBusiness(driver);
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
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //添加自定义表
    @Test
    public void addForm(){
        createFormBusiness.goToFlowManager();
        createFormBusiness.addForm();
    }

    //查询、发布自定义表
    @Test
    public void publishForm(){
        createFormBusiness.queryForm();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFormBusiness.publishForm();
    }
}
