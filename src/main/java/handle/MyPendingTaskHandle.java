package handle;

import Base.DriverBase;
import page.MyPendingTaskPage;

public class MyPendingTaskHandle {

    public DriverBase driver;
    public MyPendingTaskPage myPendingTaskPage;

    /**
     * 构造方法
     *
     * @param driver
     */
    public MyPendingTaskHandle(DriverBase driver) {
        this.driver = driver;
        myPendingTaskPage = new MyPendingTaskPage(driver);
    }

    //获取菜单栏个人办公菜单
    public void clickpersonWorkMenu() {
        myPendingTaskPage.leftClickMouse(myPendingTaskPage.getpersonWorkMenu());
    }

    //获取个人办公->流程中心菜单
    public void clickpersonFlowCenterMenu() {
        myPendingTaskPage.leftClickMouse(myPendingTaskPage.getpersonFlowCenterMenu());
    }

    //个人办公->流程中心->我承接的流程
    public void clickmyUndertakeFlowMenu() {
        myPendingTaskPage.leftClickMouse(myPendingTaskPage.getmyUndertakeFlowMenu());
    }

    //获取个人办公->流程中心->我承接的流程->待办事宜菜单项
    public void clickmyPendingTaskMenu(){
        myPendingTaskPage.leftClickMouse(myPendingTaskPage.getmyPendingTaskMenu());
    }

    //进入待办事宜的Iframe
    public void goTomyPendingTaskIframe() {
        myPendingTaskPage.findIframeElement(myPendingTaskPage.getmyPendingTaskIframe());
    }

    //退出自定义表iframe页面
    public void outmyPendingTaskIframe() {
        driver.outIframeElement();
    }
    //待办事宜的查询条件“请求标题”
    public void sendkeyinputFlowSubject(String inputFlowSubject){
        myPendingTaskPage.sendKeys(myPendingTaskPage.getinputFlowSubject(),inputFlowSubject);
    }

    //添加表单选择表页面"查询"按钮
    public void clickqueryPendingTaskButton(){
        myPendingTaskPage.click(myPendingTaskPage.getqueryPendingTaskButton());
    }

    //#台账列表待办事宜的第一条数据的请求标题
    public void clickpendingTaskSubject0(){
        myPendingTaskPage.leftClickMouse(myPendingTaskPage.getpendingTaskSubject().get(0));
    }

    //进入处理任务的Iframe页面
    public void goToapprovalTaskIframe(){
        myPendingTaskPage.findIframeElement(myPendingTaskPage.getapprovalTaskIframe());
    }

    //退出处理任务的Iframe页面
    public void outapprovalTaskIframe(){
       driver.outIframeElement();
    }

    //"任务审批处理"页面的“同意”按钮
    public void clickagreeTaskButton(){
        myPendingTaskPage.click(myPendingTaskPage.getagreeTaskButton());
    }

    //任务审批同意的"审批意见"输入框
    public void sendkeyapprovalTaskContent(String approvalTaskContent){
        myPendingTaskPage.sendKeys(myPendingTaskPage.getapprovalTaskContent(),approvalTaskContent);
    }

    //任务审批同意的"保存意见"按钮
    public void clicksaveApprovalTaskContentButton(){
        myPendingTaskPage.click(myPendingTaskPage.getsaveApprovalTaskContentButton());
    }

    //任务审批同意后的“任务成功完成”的“确定”按钮
    public void clicksureApprovalTaskButton(){
        myPendingTaskPage.click(myPendingTaskPage.getsureApprovalTaskButton());
    }
}
