package business;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import handle.CreateFlowHandle;
import handle.HomeHandle;
import org.testng.annotations.*;
import testCase.CaseBase;
import Base.BasePage;

public class CreateFlowBusiness{
    public DriverBase driver;
    public ProUtil proUtil;
    public CreateFlowHandle createFlowHandle;
    public HomeHandle homeHandle;
    public CreateFlowBusiness(DriverBase driver) {
        this.driver = driver;
        createFlowHandle = new CreateFlowHandle(driver);
        homeHandle = new HomeHandle(driver);
    }

    //进入流程管理菜单及Iframe页面
    public void goToFlowManager(){
        homeHandle.clickcloseImWindow();
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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFlowHandle.clickpublishFlowButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFlowHandle.clickpublishFlowButton();
        createFlowHandle.outflowIframe();
    }

    //查询流程
    public void queryFlow(){
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String flowSubjectBox = proutil.getPro("flowSubject");
        createFlowHandle.sendkeyflowSubjectBox(flowSubjectBox);
        createFlowHandle.clickqueryFlowButton();
    }

    //设置流程的“表单”
    public void designFlowForm(){
        createFlowHandle.moveTooperateFlow();
        createFlowHandle.moveTooperateFlow1();
        createFlowHandle.clickdesignFlowButton();
        createFlowHandle.clickdesignFlowForm();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFlowHandle.clickselectFormBox();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFlowHandle.clickselectOnlineForm();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFlowHandle.clickselectFlowFormIcon();
        createFlowHandle.goToselectFlowFormIframe();
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String flowFormSubject = proutil.getPro("formSubjectValue");
        createFlowHandle.sendkeyflowFormSubject(flowFormSubject);
        createFlowHandle.clickqueryFlowFormButton();
        createFlowHandle.clickselectFlowForm();
        createFlowHandle.clickselectFlowFormButton();
        createFlowHandle.outselectFlowFormIframe();
        createFlowHandle.clicksaveFlowFormButton();
        driver.implicitlywait();
        createFlowHandle.outselectFlowFormIframe();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFlowHandle.clicksureFlowFormSucButton();
    }

    //设置流程的“人员”
    public void designFlowPerson(){
        createFlowHandle.moveTooperateFlow();
        createFlowHandle.moveTooperateFlow1();
        createFlowHandle.clickdesignFlowButton();
        createFlowHandle.clickdesignFlowPerson();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        createFlowHandle.findflowAddPersonButtonElement();
        createFlowHandle.clickflowAddPersonButton0();
        createFlowHandle.outflowIframe();
        createFlowHandle.goToflowConfigPersonIframe();
        createFlowHandle.outflowConfigPersonIframe();
        driver.implicitlywait();
        createFlowHandle.clickflowConfigPersonSaveButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFlowHandle.goToflowManagerIframe();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFlowHandle.clickflowAddPersonButton1();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFlowHandle.goToflowConfigPersonIframe1();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFlowHandle.outflowConfigPersonIframe();
        driver.implicitlywait();
        createFlowHandle.clickflowConfigPersonSaveButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.implicitlywait();
        createFlowHandle.goToflowManagerIframe();
        createFlowHandle.clickflowAddPersonButton2();
        driver.implicitlywait();
        createFlowHandle.goToflowConfigPersonIframe2();
        driver.implicitlywait();
        createFlowHandle.outflowConfigPersonIframe();
        driver.implicitlywait();
        createFlowHandle.clickflowConfigPersonSaveButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //启动流程
    public void startFlow(){
        createFlowHandle.moveTooperateFlow();
        createFlowHandle.moveTooperateFlow1();
        createFlowHandle.clickstartFlowButton();
        createFlowHandle.outflowIframe();
        createFlowHandle.goTostartFlowIframe();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFlowHandle.clickstartFlowButton1();
        createFlowHandle.clickflowSucSureButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

