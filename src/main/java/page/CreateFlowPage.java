package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *  Ԫ�ز�
 */
public class CreateFlowPage extends BasePage {

    /**
     * ���췽��
     *
     * @param driver
     */
    public CreateFlowPage(DriverBase driver) {
        super(driver);
    }

    //��ȡ�˵������̹���ElementԪ��
    public WebElement getflowManagerMenu() {
        return element(GetByLocator.getLocator("flowManagerMenu"));
    }

    //��ȡ���̹����Ӳ˵�ElementԪ��
    public WebElement getFormManagerMenu1() {
        return element(GetByLocator.getLocator("flowManagerMenu1"));
    }

    //��ȡ���̶������˵���
    public WebElement getActDefModel() {
        return element(GetByLocator.getLocator("actDefModel"));
    }

    //��ȡ���̶������Iframe
    public WebElement getFlowManagerIframe(){
        return element(GetByLocator.getLocator("flowManagerIframe"));
    }

    //��ȡ�������̡�����������ơ���ť
    public WebElement getCreateFlowButton() {
        return element(GetByLocator.getLocator("createFlowButton"));
    }

    //��ȡ��������Iframe
    public WebElement getCreateFlowIframe() {
        return element(GetByLocator.getLocator("createFlowIframe"));
    }

    //��ȡ����ʼ�¼���element
    public WebElement getstartEvent(){
        return element(GetByLocator.getLocator("startEvent"));
    }

    //��ȡ�����û�����ͼ��
    public WebElement getcreateUserTaskImg(){
        return element(GetByLocator.getLocator("createUserTaskImg"));
    }
}

