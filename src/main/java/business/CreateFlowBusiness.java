package business;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import handle.CreateFlowHandle;
import handle.CreateFormHandle;
import org.testng.annotations.*;
import testCase.CaseBase;
import Base.BasePage;

public class CreateFlowBusiness{
    public DriverBase driver;
    public ProUtil proUtil;
    public CreateFlowHandle createFlowHandle;
    public CreateFlowBusiness(DriverBase driver) {
        this.driver = driver;
        createFlowHandle = new CreateFlowHandle(driver);
    }

    //进入流程管理菜单及Iframe页面
    public void goToFlowManager(){
        createFlowHandle.clickflowManagerMenu();
        driver.implicitlywait();
        createFlowHandle.clickflowManagerMenu1();
        driver.implicitlywait();
        createFlowHandle.clickactDefModel();
        driver.implicitlywait();
        createFlowHandle.goToflowManagerIframe();
        driver.implicitlywait();
    }

    //新增流程设计
    public void addFlow() {
        createFlowHandle.clickcreateFlowButton();
        driver.implicitlywait();
        createFlowHandle.goTocreateFlowIframe();
        driver.implicitlywait();
        createFlowHandle.clickstartEvent();
        driver.implicitlywait();
        createFlowHandle.clickcreateUserTaskImg();
        driver.implicitlywait();
        createFlowHandle.clickcreateUserTask0();
        driver.implicitlywait();
        createFlowHandle.clickcreateUserTaskImg();
        driver.implicitlywait();
        createFlowHandle.clickcreateUserTask1();
        driver.implicitlywait();
        createFlowHandle.clickcreateUserTaskImg();
        driver.implicitlywait();
        createFlowHandle.clickcreateUserTask2();
        driver.implicitlywait();
        createFlowHandle.clickendEventImg();
        driver.implicitlywait();
        createFlowHandle.clicksaveFlowButton();
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String flowNameField = proutil.getPro("flowSubject");
        createFlowHandle.sendkeyflowNameField(flowNameField);
        createFlowHandle.clickflowKeyField();
        createFlowHandle.clickpublishFlowButton();
    }

    //查询流程
    public void queryFlow(){
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String flowSubjectBox = proutil.getPro("flowSubject");
        createFlowHandle.sendkeyflowSubjectBox(flowSubjectBox);
        createFlowHandle.clickqueryFlowButton();
    }

    //进入管理下的“设置页面”
    public void designFlow(){
        createFlowHandle.moveTooperateFlow();
        createFlowHandle.moveTooperateFlow1();
        createFlowHandle.clickdesignFlowButton();
        createFlowHandle.clickdesignFlowForm();
    }

}

