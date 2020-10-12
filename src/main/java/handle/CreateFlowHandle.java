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
        createFlowPage.leftClickMouse(createFlowPage.getcreateUserTaskImg());
    }

}