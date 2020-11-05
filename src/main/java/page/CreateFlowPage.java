package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 *  元素层
 */
public class CreateFlowPage extends BasePage {

    /**
     * 构造方法
     *
     *
     */
    public CreateFlowPage(DriverBase driver) {
        super(driver);
    }

    //获取菜单栏流程管理Element元素
    public WebElement getflowManagerMenu() {
        return element(GetByLocator.getLocator("flowManagerMenu"));
    }

    //获取流程管理子菜单Element元素
    public WebElement getFormManagerMenu1() {
        return element(GetByLocator.getLocator("flowManagerMenu1"));
    }

    //获取流程定义管理菜单项
    public WebElement getActDefModel() {
        return element(GetByLocator.getLocator("actDefModel"));
    }

    //获取流程定义管理Iframe
    public WebElement getFlowManagerIframe(){
        return element(GetByLocator.getLocator("flowManagerIframe"));
    }

    //获取新增流程“在线流程设计”按钮
    public WebElement getCreateFlowButton() {
        return element(GetByLocator.getLocator("createFlowButton"));
    }

    //获取新增流程Iframe
    public WebElement getCreateFlowIframe() {
        return element(GetByLocator.getLocator("createFlowIframe"));
    }

    //获取“开始事件”element
    public WebElement getstartEvent(){
        return element(GetByLocator.getLocator("startEvent"));
    }

    //获取创建用户任务图标
    public List<WebElement> getcreateUserTaskImg(){

        return elementList(GetByLocator.getLocator("createUserTaskImg"));
    }

    //创建用户任务
    public List<WebElement> getcreateUserTask(){
        return elementList(GetByLocator.getLocator("createUserTask"));
    }

    //获取“结束”事件
    public WebElement getendEventImg(){
        return element(GetByLocator.getLocator("endEventImg"));
    }

    //获取“保存”流程按钮
    public WebElement getsaveFlowButton(){
        return element(GetByLocator.getLocator("saveFlowButton"));
    }

    //保存模型页面“名称”字段
    public WebElement getflowNameField(){
        return element(GetByLocator.getLocator("flowNameField"));
    }

    //保存模型页面“key”字段
    public WebElement getflowKeyField(){
        return element(GetByLocator.getLocator("flowKeyField"));
    }

    //保存模型页面“发布”按钮
    public WebElement getpublishFlowButton(){
        return element(GetByLocator.getLocator("publishFlowButton"));
    }

    //流程定义管理页面查询条件“标题”的输入框
    public WebElement getflowSubjectBox(){
        return element(GetByLocator.getLocator("flowSubjectBox"));
    }

    //流程定义管理页面“查询”按钮
    public WebElement getqueryFlowButton(){
        return element(GetByLocator.getLocator("queryFlowButton"));
    }

    //流程定义管理“设置”按钮
    public WebElement getoperateFlow(){
        return element(GetByLocator.getLocator("operateFlow"));
    }
    public WebElement getoperateFlow1(){
        return element(GetByLocator.getLocator("operateFlow1"));
    }
    public WebElement getdesignFlowButton(){
        return element(GetByLocator.getLocator("designFlowButton"));
    }

    //设置流程页面的“表单”设置
    public WebElement getdesignFlowForm(){
        return element(GetByLocator.getLocator("designFlowForm"));
    }

    //设置全局表单为在线表单
    public WebElement getselectFormBox(){return element(GetByLocator.getLocator("selectFormBox"));}
    public WebElement getselectOnlineForm(){return element(GetByLocator.getLocator("selectOnlineForm"));}

    //选择全局表单的具体表单
    public WebElement getselectFlowFormIcon(){return element(GetByLocator.getLocator("selectFlowFormIcon"));}

    //进入选择表单的Iframe
    public WebElement getselectFlowFormIframe(){return element(GetByLocator.getLocator("selectFlowFormIframe"));}

    //选择表单页面的查询条件“标题”
    public WebElement getflowFormSubject(){return element(GetByLocator.getLocator("flowFormSubject"));}

    //选择表单页面的"查询"按钮
    public WebElement getqueryFlowFormButton(){return element(GetByLocator.getLocator("queryFlowFormButton"));}

    //选择表单页面--选择具体的表单
    public WebElement getselectFlowForm(){return element(GetByLocator.getLocator("selectFlowForm"));}

    //选择表单页面--选择具体的表单后的“选择”按钮
    public WebElement getselectFlowFormButton(){return element(GetByLocator.getLocator("selectFlowFormButton"));}

    //设置完流程的表单后，“保存”按钮
    public WebElement getsaveFlowFormButton(){return element(GetByLocator.getLocator("saveFlowFormButton"));}

    //设置表单成功提示框的确定按钮
    public WebElement getsureFlowFormSucButton(){return element(GetByLocator.getLocator("sureFlowFormSucButton"));}

    //设置流程页面的“人员”设置
    public WebElement getdesignFlowPerson(){ return element(GetByLocator.getLocator("designFlowPerson")); }

    //设置流程人员页面的配置人员Iframe
    public WebElement getflowConfigPersonIframe(){return element(GetByLocator.getLocator("flowConfigPersonIframe"));}
    public WebElement getflowConfigPersonIframe1(){return element(GetByLocator.getLocator("flowConfigPersonIframe1"));}
    public WebElement getflowConfigPersonIframe2(){return element(GetByLocator.getLocator("flowConfigPersonIframe2"));}

    //设置流程人员页面的“添加”人员按钮
    public List<WebElement> getflowAddPersonButton(){
        return elementList(GetByLocator.getLocator("flowAddPersonButton"));
    }
//    public List<WebElement> getflowAddPersonButton(){return elementList(GetByLocator.getLocator("flowAddPersonButton"));}
//    public List<WebElement> getflowAddPersonButton1(){return elementList(GetByLocator.getLocator("flowAddPersonButton1"));}
//    public List<WebElement> getflowAddPersonButton2(){return elementList(GetByLocator.getLocator("flowAddPersonButton2"));}

    //设置流程人员页面的配置用户类型的"保存"按钮
    public WebElement getflowConfigPersonSaveButton(){return element(GetByLocator.getLocator("flowConfigPersonSaveButton"));}

    //流程定义管理“启动”按钮
    public WebElement getstartFlowButton(){
        return element(GetByLocator.getLocator("startFlowButton"));
    }

    //启动流程的Iframe页面
    public WebElement getstartFlowIframe(){return element(GetByLocator.getLocator("startFlowIframe"));}

    //启动流程页面的“启动流程”按钮
    public WebElement getstartFlowButton1(){return element(GetByLocator.getLocator("startFlowButton1"));}

    //启动流程成功后弹出框的确定按钮
    public WebElement getflowSucSureButton(){return element(GetByLocator.getLocator("flowSucSureButton"));}


}



