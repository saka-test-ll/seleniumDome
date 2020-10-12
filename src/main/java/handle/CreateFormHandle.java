package handle;

import Base.DriverBase;
import page.CreateFormPage;
import page.CreateTablePage;

public class CreateFormHandle {

    public DriverBase driver;
    public CreateFormPage createFormPage;

    /**
     * ���췽��
     *
     * @param driver
     */
    public CreateFormHandle(DriverBase driver) {
        this.driver = driver;
        createFormPage = new CreateFormPage(driver);
    }

    //������̹���Menu
    public void clickflowManagerMenuForm() {
        createFormPage.leftClickMouse(createFormPage.getFlowManagerMenuForm());
    }

    //���������Menu
    public void clickformManagerMenuForm() {
        createFormPage.leftClickMouse(createFormPage.getFormManagerMenuForm());
    }

    //����Զ����Menu
    public void clickformMenu() {
        createFormPage.leftClickMouse(createFormPage.getFormMenu());
    }

    //�����Զ����iframeҳ��
    public void goToformIframe() {
        createFormPage.findIframeElement(createFormPage.getFormIframe());
    }

    //�˳��Զ����iframeҳ��
    public void outformIframe(){
        driver.outIframeElement();
    }

    //��������Զ��������ӡ���ť
    public void goToaddFormButton(){
        createFormPage.click(createFormPage.getAddFormButton());
    }

    //������ӱ�Iframeҳ��
    public void goToaddFormIframe(){
        createFormPage.findIframeElement(createFormPage.getAddFormIframe());
    }

    //�˳���ӱ�Iframeҳ��
    public void outaddFormIframe(){
        driver.outIframeElement();
    }

    //��ӱ�ҳ�桰�����⡱�ֶ�
    public void sendkeyformSubject(String formSubject){
        createFormPage.sendKeys(createFormPage.getFormSubject(),formSubject);
    }

    //��������������ֶΣ����ݡ������⡱�Զ���ȡ���ֶ�ֵ
    public void clickformKey(){
        createFormPage.leftClickMouse(createFormPage.getFormKey());
    }

    //�����ӱ�ҳ�桰������ͼ��
    public void clickserchTableIconButton(){
        createFormPage.click(createFormPage.getSerchTableIconButton());
    }

    //������ӱ�ʱѡ���Iframe
    public void goToselectTableIframe(){
        createFormPage.findIframeElement(createFormPage.getSelectTableIframe());
    }

    //�˳���ӱ�ʱѡ���Iframe
    public void outselectTableIframe(){
        driver.outIframeElement();
    }

    //ѡ����form
    //public void goToselectTableForm(){createFormPage.getSelectTableForm();}

    //��ӱ�ѡ���ҳ���ѯ������������
    public void clickqueryTableName(){
        createFormPage.click(createFormPage.getQueryTableName());
    }
    public void sendkeyqueryTableName(String queryTableName){
        createFormPage.sendKeys(createFormPage.getQueryTableName(),queryTableName);
    }

    //��ӱ�ѡ���ҳ��"��ѯ"��ť
    public void clickserchTableButton(){
        createFormPage.click(createFormPage.getSerchTableButton());
    }

    //��ӱ�ѡ���ҳ�湴ѡ��
    public void clickselectTable(){
        createFormPage.leftClickMouse(createFormPage.getSelectTable());
    }

    //��ӱ�ѡ���ҳ�湴ѡ��ȷ����ť
    public void clickchooseTableButton(){
        createFormPage.click(createFormPage.getChooseTableButton());
    }

    //��ӱ�ҳ�桰��һ������ť
    public void clickchooseFormNextStepButton(){
        createFormPage.click(createFormPage.getChooseFormNextStepButton());
    }

    //����ѡ���ģ��Iframe
    public void goTochooseFormTemplateIframe(){
        createFormPage.findIframeElement(createFormPage.getChooseFormTemplateIframe());
    }

    //�˳�ѡ���ģ��Iframe
    public void outchooseFormTemplateIframe(){
        driver.outIframeElement();
    }

    //ѡ���ģ�塰��һ������ť
    public void clickchooseTemplateButton(){
        createFormPage.click(createFormPage.getchooseTemplateButton());
    }

}
