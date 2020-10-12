package business;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import handle.CreateFlowHandle;
import handle.CreateFormHandle;
import org.testng.annotations.*;
import testCase.CaseBase;
import Base.BasePage;



public class CreateFlowBusiness {
    public DriverBase driver;
    public CreateFlowHandle createFlowHandle;
    public CreateFlowBusiness(DriverBase driver){
        this.driver = driver;
        createFlowHandle = new CreateFlowHandle(driver);
    }

    public void addFlow() {
        //进入在线流程设计界面、切换iframe页面
        createFlowHandle.clickflowManagerMenu();
        driver.implicitlywait();
        createFlowHandle.clickflowManagerMenu1();
        driver.implicitlywait();
        createFlowHandle.clickactDefModel();
        driver.implicitlywait();
        createFlowHandle.goToflowManagerIframe();
        driver.implicitlywait();
        createFlowHandle.clickcreateFlowButton();
        driver.implicitlywait();
        createFlowHandle.goTocreateFlowIframe();
        driver.implicitlywait();
        createFlowHandle.clickstartEvent();
        driver.implicitlywait();
        createFlowHandle.clickcreateUserTaskImg();
    }
}