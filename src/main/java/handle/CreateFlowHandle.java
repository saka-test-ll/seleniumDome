package handle;

import Base.DriverBase;
import page.CreateFlowPage;
import page.CreateTablePage;

public class CreateFlowHandle {

    public DriverBase driver;
    public CreateFlowPage createFlowPage;

    /**
     * ���췽��
     *
     * @param driver
     */
    public CreateFlowHandle(DriverBase driver) {
        this.driver = driver;
        createFlowPage = new CreateFlowPage(driver);
    }

    //������̹���Menu
    public void clickflowManagerMenu() {
        createFlowPage.leftClickMouse(createFlowPage.getflowManagerMenu());
    }

    //������̹�����Menu
    public void clickflowManagerMenu1() {
        createFlowPage.leftClickMouse(createFlowPage.getFormManagerMenu1());
    }

    //������̶������Menu
    public void clickactDefModel() {
        createFlowPage.leftClickMouse(createFlowPage.getActDefModel());
    }
    //�������̶������Iframe
    public void goToflowManagerIframe(){
        createFlowPage.findIframeElement(createFlowPage.getFlowManagerIframe());
    }

    //���������������ơ���ť
    public void clickcreateFlowButton() {
        createFlowPage.click(createFlowPage.getCreateFlowButton());
    }

    //�����Զ����iframeҳ��
    public void goTocreateFlowIframe() {
        createFlowPage.findIframeElement(createFlowPage.getCreateFlowIframe());
    }

    //�˳��Զ����iframeҳ��
    public void outformIframe() {
        driver.outIframeElement();
    }

    //�������ʼ�¼���
    public void clickstartEvent(){
        createFlowPage.leftClickMouse(createFlowPage.getstartEvent());
    }

    //����������û�����
    public void clickcreateUserTaskImg(){
        createFlowPage.leftClickMouse(createFlowPage.getcreateUserTaskImg());
    }

}