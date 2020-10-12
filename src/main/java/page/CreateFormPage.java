package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *  Ԫ�ز�
 */
public class CreateFormPage extends BasePage {

    /**
     * ���췽��
     *
     * @param driver
     */
    public CreateFormPage(DriverBase driver) {
        super(driver);
    }

    //��ȡ�˵������̹���ElementԪ��
    public WebElement getFlowManagerMenuForm() {
        return element(GetByLocator.getLocator("flowManagerMenuform"));
    }

    //��ȡ������ElementԪ��
    public WebElement getFormManagerMenuForm() {
        return element(GetByLocator.getLocator("formManagerMenuform"));
    }

    //��ȡ�Զ�����˵���
    public WebElement getFormMenu(){
        return element(GetByLocator.getLocator("formMenu"));
    }

    //��ȡ�Զ����Iframe
    public WebElement getFormIframe(){
        return element(GetByLocator.getLocator("formIframe"));
    }

    //��ȡ�����Զ��������ӡ���ť
    public WebElement getAddFormButton(){
        return element(GetByLocator.getLocator("addFormButton"));
    }

    //��ȡ��ӱ�Iframeҳ��
    public WebElement getAddFormIframe(){
        return element(GetByLocator.getLocator("addFormIframe"));
    }

    //��ȡ��ӱ�ҳ�桰�����⡱�ֶ�
    public WebElement getFormSubject(){
        return element(GetByLocator.getLocator("formSubject"));
    }

    //��ȡ��ӱ�ҳ�桰���������ֶ�
    public WebElement getFormKey(){
        return element(GetByLocator.getLocator("formKey"));
    }

    //��ȡ��ӱ�ҳ�桰������ͼ��
    public WebElement getSerchTableIconButton(){
        return element(GetByLocator.getLocator("serchTableIconButton"));
    }

    //��ȡ��ӱ�ʱѡ���Iframe
    public WebElement getSelectTableIframe(){
        return element(GetByLocator.getLocator("selectTableIframe"));
    }

/*    //��ȡѡ����form
    public WebElement getSelectTableForm(){
        return element(GetByLocator.getLocator("selectTableForm"));
    }*/

    //��ӱ�ѡ���ҳ���ѯ������������
    public WebElement getQueryTableName(){
        return element(GetByLocator.getLocator("queryTableName"));
    }

    //��ӱ�ѡ���ҳ��"��ѯ"��ť
    public WebElement getSerchTableButton(){
        return element(GetByLocator.getLocator("serchTableButton"));
    }

    //��ӱ�ѡ���ҳ�湴ѡ��
    public WebElement getSelectTable(){
        return element(GetByLocator.getLocator("selectTable"));
    }

    //��ӱ�ѡ���ҳ�湴ѡ��ȷ����ť
    public WebElement getChooseTableButton(){
        return element(GetByLocator.getLocator("chooseTableButton"));
    }

    //��ӱ�ҳ�桰��һ������ť
    public WebElement getChooseFormNextStepButton(){
        return element(GetByLocator.getLocator("chooseFormNextStepButton"));
    }

    //ѡ���ģ��Iframe
    public WebElement getChooseFormTemplateIframe(){
        return element(GetByLocator.getLocator("chooseFormTemplateIframe"));
    }

    //ѡ���ģ�塰��һ������ť
    public WebElement getchooseTemplateButton(){
        return element(GetByLocator.getLocator("chooseTemplateButton"));
    }

}
