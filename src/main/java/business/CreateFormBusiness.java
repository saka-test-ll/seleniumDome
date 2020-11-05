package business;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import handle.CreateFormHandle;
import handle.CreateFormHandle;
import handle.HomeHandle;
import handle.HomeHandle;


public class CreateFormBusiness {
    public DriverBase driver;
    public ProUtil proUtil;
    public CreateFormHandle createFormHandle;
    public HomeHandle homeHandle;
    public CreateFormBusiness(DriverBase driver) {
        this.driver = driver;
        createFormHandle = new CreateFormHandle(driver);
        homeHandle = new HomeHandle(driver);
    }

    //进入流程管理菜单及Iframe页面
    public void goToFlowManager() {
        homeHandle.clickcloseImWindow();
        driver.implicitlywait();
        createFormHandle.clickflowManagerMenuForm();
        driver.implicitlywait();
        createFormHandle.clickformManagerMenuForm();
        driver.implicitlywait();
        createFormHandle.clickformMenu();
        driver.implicitlywait();
        createFormHandle.goToformIframe();
        driver.implicitlywait();
    }

    //新增自定义表单
    public void addForm() {
        createFormHandle.goToaddFormButton();
        createFormHandle.goToaddFormIframe();
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String formSubject = proutil.getPro("formSubjectValue");
        createFormHandle.sendkeyformSubject(formSubject);
        createFormHandle.clickformKey();
        createFormHandle.clickserchTableIconButton();
        createFormHandle.outaddFormIframe();
        createFormHandle.goToselectTableIframe();
        String queryTableName = proutil.getPro("tableDesc");
        createFormHandle.sendkeyqueryTableName(queryTableName);
          createFormHandle.clickserchTableButton();
        createFormHandle.clickselectTable();
        createFormHandle.clickchooseTableButton();
         createFormHandle.outselectTableIframe();
        createFormHandle.goToaddFormIframe();
        createFormHandle.clickchooseFormNextStepButton();
        createFormHandle.outaddFormIframe();
        createFormHandle.goTochooseFormTemplateIframe();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFormHandle.clickchooseTemplateButton();
        driver.implicitlywait();
        createFormHandle.outchooseFormTemplateIframe();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchWindow();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        createFormHandle.findaddFieldToFormElement();
        createFormHandle.clickaddFieldToForm0();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFormHandle.clickaddFieldToForm1();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFormHandle.clickFormDesignPagesaveButton();
        createFormHandle.clickcancelContinueFormDesignButton();
        driver.switchOldwindows();
    }

    //查询自定义表单
    public void queryForm(){
        createFormHandle.goToformIframe();
        driver.implicitlywait();
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String queryTableName = proutil.getPro("formSubjectValue");
        createFormHandle.sendkeyformSubjectBox(queryTableName);
        createFormHandle.clickqueryFormButton();
    }

    //
    public void publishForm(){
        createFormHandle.movemovePublishForm();
        createFormHandle.movemovePublishForm1();
        createFormHandle.clickpublishFormButton();
        createFormHandle.clicksurePublishFormButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createFormHandle.clicksurePublishFormSucButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}