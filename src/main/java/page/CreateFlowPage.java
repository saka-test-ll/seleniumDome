package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
    public WebElement getcreateUserTaskImg(){
        return element(GetByLocator.getLocator("createUserTaskImg"));
    }
}

