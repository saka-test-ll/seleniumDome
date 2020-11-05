package handle;

import Base.DriverBase;
import org.openqa.selenium.WebElement;
import page.CreateFlowPage;
import page.CreateTablePage;

import java.util.ArrayList;
import java.util.List;

public class CreateFlowHandle {

    public DriverBase driver;
    public CreateFlowPage createFlowPage;

    /**
     * 构造方法
     *
     *
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

    //获取新增流程Iframe
    public void goTocreateFlowIframe() {
        createFlowPage.findIframeElement(createFlowPage.getCreateFlowIframe());
    }

    /**
     * 退出新增流程Iframe
     */
    public void outflowIframe() {
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

    //设置全局表单为在线表单
    public void clickselectFormBox(){createFlowPage.leftClickMouse(createFlowPage.getselectFormBox());}
    public void clickselectOnlineForm(){createFlowPage.leftClickMouse(createFlowPage.getselectOnlineForm());}

    //选择全局表单的具体表单
    public void clickselectFlowFormIcon(){createFlowPage.leftClickMouse(createFlowPage.getselectFlowFormIcon());}

    //进入选择表单的Iframe
    public void goToselectFlowFormIframe(){createFlowPage.findIframeElement(createFlowPage.getselectFlowFormIframe());}
    //退出选择表单的Iframe
    public void outselectFlowFormIframe(){driver.outIframeElement();}

    //选择表单页面的查询条件“标题”
    public void sendkeyflowFormSubject(String flowFormSubject){createFlowPage.sendKeys(createFlowPage.getflowFormSubject(),flowFormSubject);}

    //选择表单页面的"查询"按钮
    public void clickqueryFlowFormButton(){createFlowPage.click(createFlowPage.getqueryFlowFormButton());}

    //选择表单页面--选择具体的表单
    public void clickselectFlowForm(){createFlowPage.click(createFlowPage.getselectFlowForm());}

    //选择表单页面--选择具体的表单后的“选择”按钮
    public void clickselectFlowFormButton(){createFlowPage.click(createFlowPage.getselectFlowFormButton());}

    //设置完流程的表单后，“保存”按钮
    public void clicksaveFlowFormButton(){createFlowPage.click(createFlowPage.getsaveFlowFormButton());}

    //设置表单成功提示框的确定按钮
    public void clicksureFlowFormSucButton(){createFlowPage.click(createFlowPage.getsureFlowFormSucButton());}

    /**
     * 设置流程页面的“人员”设置
     */
    public void clickdesignFlowPerson(){createFlowPage.leftClickMouse(createFlowPage.getdesignFlowPerson());}

    //进入设置流程人员页面的配置人员Iframe
    public void goToflowConfigPersonIframe() {
        createFlowPage.findIframeElement(createFlowPage.getflowConfigPersonIframe());
    }
    public void goToflowConfigPersonIframe1() {
        createFlowPage.findIframeElement(createFlowPage.getflowConfigPersonIframe1());
    }
    public void goToflowConfigPersonIframe2() {
        createFlowPage.findIframeElement(createFlowPage.getflowConfigPersonIframe2());
    }

    //退出设置流程人员页面的配置人员Iframe
    public void outflowConfigPersonIframe(){
        driver.outIframeElement();
    }

    /**
     * 设置流程人员页面的“添加”人员按钮
     */
//    List<WebElement>   addBtns = new ArrayList<WebElement>();
//    public void findflowAddPersonButtonElement() {
//        addBtns = createFlowPage.getflowAddPersonButton();
//    }
//    public void clickflowAddPersonButton0(){ createFlowPage.click(addBtns.get(0)); }
//    public void clickflowAddPersonButton1(){ createFlowPage.click(addBtns.get(1)); }
//    public void clickflowAddPersonButton2(){ createFlowPage.click(addBtns.get(2)); }
////    public void clickflowAddPersonButton0(){ createFlowPage.click(createFlowPage.getflowAddPersonButton().get(0)); }
////    public void clickflowAddPersonButton1(){ createFlowPage.click(createFlowPage.getflowAddPersonButton1().get(1)); }
////    public void clickflowAddPersonButton2(){ createFlowPage.click(createFlowPage.getflowAddPersonButton2().get(2)); }
        public void clickflowAddPersonButton0(){
            createFlowPage.click(createFlowPage.getflowAddPersonButton().get(0));
        }
        public void clickflowAddPersonButton1(){
            createFlowPage.click(createFlowPage.getflowAddPersonButton().get(1));
        }
        public void clickflowAddPersonButton2(){
            createFlowPage.click(createFlowPage.getflowAddPersonButton().get(2));
        }

    //设置流程人员页面的配置用户类型的"保存"按钮
    public void clickflowConfigPersonSaveButton(){createFlowPage.click(createFlowPage.getflowConfigPersonSaveButton());}

    //启动流程的Iframe页面
    public void goTostartFlowIframe(){createFlowPage.findIframeElement(createFlowPage.getstartFlowIframe());}

    //启动流程页面的“启动流程”按钮
    public void clickstartFlowButton1(){createFlowPage.click(createFlowPage.getstartFlowButton1());}

    //启动流程成功后弹出框的确定按钮
    public void clickflowSucSureButton(){createFlowPage.click(createFlowPage.getflowSucSureButton());}

}