package handle;

import Base.DriverBase;
import page.CreateFlowPage;
import page.CreateTablePage;

public class CreateFlowHandle {

    public DriverBase driver;
    public CreateFlowPage createFlowPage;

    /**
     * 构造方法
     *
     * @param driver
     */
    public CreateFlowHandle(DriverBase driver) {
        this.driver = driver;
        createFlowPage = new CreateFlowPage(driver);
    }

    //点击流程管理Menu
    public void clickflowManagerMenu() {
        createFlowPage.leftClickMouse(createFlowPage.getflowManagerMenu());
    }

    //点击流程管理子Menu
    public void clickflowManagerMenu1() {
        createFlowPage.leftClickMouse(createFlowPage.getFormManagerMenu1());
    }

    //点击流程定义管理Menu
    public void clickactDefModel() {
        createFlowPage.leftClickMouse(createFlowPage.getActDefModel());
    }
    //进入流程定义管理Iframe
    public void goToflowManagerIframe(){
        createFlowPage.findIframeElement(createFlowPage.getFlowManagerIframe());
    }

    //点击“在线流程设计”按钮
    public void clickcreateFlowButton() {
        createFlowPage.click(createFlowPage.getCreateFlowButton());
    }

    //进入自定义表iframe页面
    public void goTocreateFlowIframe() {
        createFlowPage.findIframeElement(createFlowPage.getCreateFlowIframe());
    }

    //退出自定义表iframe页面
    public void outformIframe() {
        driver.outIframeElement();
    }

    //点击“开始事件”
    public void clickstartEvent(){
        createFlowPage.leftClickMouse(createFlowPage.getstartEvent());
    }

    //点击“创建用户任务”
    public void clickcreateUserTaskImg(){
        createFlowPage.leftClickMouse(createFlowPage.getcreateUserTaskImg().get(0));
    }

    public void clickcreateUserTask0(){
        createFlowPage.leftClickMouse(createFlowPage.getcreateUserTask().get(0));
    }

    public void clickcreateUserTask1(){
        createFlowPage.leftClickMouse(createFlowPage.getcreateUserTask().get(1));
    }

    public void clickcreateUserTask2(){
        createFlowPage.leftClickMouse(createFlowPage.getcreateUserTask().get(2));
    }

    //点击创建结束任务
    public void clickendEventImg(){
        createFlowPage.leftClickMouse(createFlowPage.getcreateUserTaskImg().get(1));
    }

    //点击“保存”流程按钮
    public void clicksaveFlowButton(){
        createFlowPage.click(createFlowPage.getsaveFlowButton());
    }

    //保存模型页面“名称”字段
    public void sendkeyflowNameField(String flowNameField){
        createFlowPage.sendKeys(createFlowPage.getflowNameField(),flowNameField);
    }

    //保存模型页面“key”字段
    public void clickflowKeyField(){
        createFlowPage.leftClickMouse(createFlowPage.getflowKeyField());
    }

    //保存模型页面“发布”按钮
    public void clickpublishFlowButton(){
        createFlowPage.click(createFlowPage.getpublishFlowButton());
    }

    //流程定义管理页面查询条件“标题”的输入框
    public void sendkeyflowSubjectBox(String flowSubjectBox){
        createFlowPage.sendKeys(createFlowPage.getflowSubjectBox(),flowSubjectBox);
    }

    //流程定义管理页面“查询”按钮
    public void clickqueryFlowButton(){
        createFlowPage.click(createFlowPage.getqueryFlowButton());
    }

    //流程定义管理“设置”、“启动”按钮
    public void moveTooperateFlow(){
        createFlowPage.moveToElement(createFlowPage.getoperateFlow());
    }
    public void moveTooperateFlow1(){
        createFlowPage.moveToElement(createFlowPage.getoperateFlow1());
    }
    public void clickdesignFlowButton(){
        createFlowPage.click(createFlowPage.getdesignFlowButton());
    }
    public void clickstartFlowButton(){
        createFlowPage.click(createFlowPage.getstartFlowButton());
    }

    //设置流程页面的“表单”设置
    public void clickdesignFlowForm(){
        createFlowPage.leftClickMouse(createFlowPage.getdesignFlowForm());
    }

}