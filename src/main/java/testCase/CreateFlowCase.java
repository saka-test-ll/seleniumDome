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
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //新增并发布流程
    @Test
    public void AddFlowDesign() {
        createFlowBusiness.goToFlowManager();
        createFlowBusiness.addFlow();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //查询流程
    @Test
    public void queryFlow(){
        createFlowBusiness.goToFlowManager();
        createFlowBusiness.queryFlow();
    }

    //设置流程表单
    @Test
    public void designFlowForm(){
        createFlowBusiness.goToFlowManager();
        createFlowBusiness.queryFlow();
        createFlowBusiness.designFlowForm();
    }

    @Test
    public void designFlowPerson(){
        createFlowBusiness.goToFlowManager();
        createFlowBusiness.queryFlow();
        createFlowBusiness.designFlowPerson();
    }

    //调试程序启动流程页面可以关闭，正常执行启动流程页面未关闭
    @Test
    public void startFlow(){
        createFlowBusiness.goToFlowManager();
        createFlowBusiness.queryFlow();
        createFlowBusiness.startFlow();
    }
}