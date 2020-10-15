package business;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import handle.MyPendingTaskHandle;
import org.testng.annotations.*;
import testCase.CaseBase;
import Base.BasePage;

import javax.annotation.Resource;
public class MyPendingTaskBusiness {
    public DriverBase driver;
    public ProUtil proUtil;
    public MyPendingTaskHandle myPendingTaskHandle;
    public MyPendingTaskBusiness(DriverBase driver) {
        this.driver = driver;
        myPendingTaskHandle = new MyPendingTaskHandle(driver);
    }

    //进入个人办公->流程中心->我承接的流程->待办事宜Iframe页面
    public void goToMyPendingTask() {
        myPendingTaskHandle.clickpersonWorkMenu();
        driver.implicitlywait();
        myPendingTaskHandle.clickpersonFlowCenterMenu();
        driver.implicitlywait();
        myPendingTaskHandle.clickmyUndertakeFlowMenu();
        driver.implicitlywait();
        myPendingTaskHandle.clickmyPendingTaskMenu();
        driver.implicitlywait();
        myPendingTaskHandle.goTomyPendingTaskIframe();
        driver.implicitlywait();
    }

    //查询待办事宜
    public void queryPendingTask(){
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String inputFlowSubject = proutil.getPro("FlowSubject");
        myPendingTaskHandle.sendkeyinputFlowSubject(inputFlowSubject);
        myPendingTaskHandle.clickqueryPendingTaskButton();
    }

    //待办事宜审批同意
    public void agreeMypendingTask(){
        myPendingTaskHandle.clickpendingTaskSubject0();
        myPendingTaskHandle.outmyPendingTaskIframe();
        myPendingTaskHandle.goToapprovalTaskIframe();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myPendingTaskHandle.clickagreeTaskButton();
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String approvalTaskContent = proutil.getPro("approvalTaskContent");
        myPendingTaskHandle.sendkeyapprovalTaskContent(approvalTaskContent);
        myPendingTaskHandle.clicksaveApprovalTaskContentButton();
        myPendingTaskHandle.clicksureApprovalTaskButton();
        myPendingTaskHandle.outapprovalTaskIframe();
    }
}
