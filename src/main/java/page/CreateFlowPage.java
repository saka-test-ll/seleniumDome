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
     * @param driver
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

    //流程定义管理“设置”、“启动”按钮
    public WebElement getoperateFlow(){
        return element(GetByLocator.getLocator("operateFlow"));
    }
    public WebElement getoperateFlow1(){
        return element(GetByLocator.getLocator("operateFlow1"));
    }
    public WebElement getdesignFlowButton(){
        return element(GetByLocator.getLocator("designFlowButton"));
    }
    public WebElement getstartFlowButton(){
        return element(GetByLocator.getLocator("startFlowButton"));
    }

    //设置流程页面的“表单”设置
    public WebElement getdesignFlowForm(){
        return element(GetByLocator.getLocator("designFlowForm"));
    }

}



