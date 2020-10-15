package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.WebElement;
import java.util.List;

/**
 *  元素层
 */
public class MyPendingTaskPage extends BasePage {

    /**
     * 构造方法
     *
     * @param driver
     */
    public MyPendingTaskPage(DriverBase driver) {
        super(driver);
    }

    //获取菜单栏个人办公菜单Element元素
    public WebElement getpersonWorkMenu() {
        return element(GetByLocator.getLocator("personWorkMenu"));
    }

    //获取个人办公->流程中心Element元素
    public WebElement getpersonFlowCenterMenu() {
        return element(GetByLocator.getLocator("personFlowCenterMenu"));
    }

    //个人办公->流程中心->我承接的流程
    public WebElement getmyUndertakeFlowMenu() {
        return element(GetByLocator.getLocator("myUndertakeFlowMenu"));
    }

    //获取个人办公->流程中心->我承接的流程->待办事宜菜单项
    public WebElement getmyPendingTaskMenu() {
        return element(GetByLocator.getLocator("myPendingTaskMenu"));
    }

    //待办事宜的Iframe
    public WebElement getmyPendingTaskIframe(){
        return element(GetByLocator.getLocator("myPendingTaskIframe"));
    }

    //待办事宜的查询条件“请求标题”
    public WebElement getinputFlowSubject() {
        return element(GetByLocator.getLocator("inputFlowSubject"));
    }

    //待办事宜的“查询”按钮
    public WebElement getqueryPendingTaskButton() {
        return element(GetByLocator.getLocator("queryPendingTaskButton"));
    }

    //台账列表待办事宜的请求标题
    public List<WebElement> getpendingTaskSubject(){
        return elementList(GetByLocator.getLocator("pendingTaskSubject"));
    }

    //进入处理任务的Iframe页面
    public WebElement getapprovalTaskIframe(){
        return element(GetByLocator.getLocator("approvalTaskIframe"));
    }

    //"任务审批处理"页面的“同意”按钮
    public WebElement getagreeTaskButton(){
        return element(GetByLocator.getLocator("agreeTaskButton"));
    }

    //任务审批同意的"审批意见"输入框
    public WebElement getapprovalTaskContent(){
        return element(GetByLocator.getLocator("approvalTaskContent"));
    }

    //任务审批同意的"保存意见"按钮
    public WebElement getsaveApprovalTaskContentButton(){
        return element(GetByLocator.getLocator("saveApprovalTaskContentButton"));
    }

    //任务审批同意后的“任务成功完成”的“确定”按钮
    public WebElement getsureApprovalTaskButton(){
        return element(GetByLocator.getLocator("sureApprovalTaskButton"));
    }
}