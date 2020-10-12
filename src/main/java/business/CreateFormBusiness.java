package business;

import Base.DriverBase;
import handle.CreateFormHandle;

public class CreateFormBusiness {
    public CreateFormHandle createFormHandle;
    public CreateFormBusiness(DriverBase driver){
        createFormHandle = new CreateFormHandle(driver);
    }
    //������̹���Menu
    public void goToflowManagerMenu() {
        createFormHandle.clickflowManagerMenuForm();
    }
    //���������Menu
    public void goToformManagerMenu(){
        createFormHandle.clickformManagerMenuForm();
    }
    //����Զ����Menu
    public void goToformMenu(){
        createFormHandle.clickformMenu();
    }
    //�����Զ����Iframe
    public void goToformIframe(){
        createFormHandle.goToformIframe();
    }

    //�˳��Զ����Iframe
    public void outformIframe(){
        createFormHandle.outformIframe();
    }

    //��������Զ��������ӡ���ť
    public void goToaddFormButton(){
        createFormHandle.goToaddFormButton();
    }

    //������ӱ�Iframeҳ��
    public void goToaddFormIframe(){
        createFormHandle.goToaddFormIframe();
    }

    //�˳���ӱ�Iframeҳ��
    public void outaddFormIframe(){
        createFormHandle.outaddFormIframe();
    }

    //��ӱ�ҳ�桰�����⡱�ֶ�
    public void createForm(String formSubject){
        createFormHandle.sendkeyformSubject(formSubject);
    }

    //��������������ֶΣ����ݡ������⡱�Զ���ȡ���ֶ�ֵ
    public void goToformKey(){
        createFormHandle.clickformKey();
    }

    //�����ӱ�ҳ�桰������ͼ��
    public void goToserchTableIconButton(){
        createFormHandle.clickserchTableIconButton();
    }

    //������ӱ�ʱѡ���Iframe
    public void goToselectTableIframe(){
        createFormHandle.goToselectTableIframe();
    }

    //�˳���ӱ�ʱѡ���Iframe
    public void outselectTableIframe(){
        createFormHandle.outselectTableIframe();
    }

    //ѡ����form
/*    public void goToselectTableForm(){
        createFormHandle.goToselectTableForm();
    }*/

    //��ӱ�ѡ���ҳ���ѯ������������
    public void goToclickqueryTableName(){createFormHandle.clickqueryTableName();}
    public void createChooseTable(String queryTableName){
        createFormHandle.sendkeyqueryTableName(queryTableName);
    }

    //��ӱ�ѡ���ҳ��"��ѯ"��ť
    public void goToserchTableButton(){
        createFormHandle.clickserchTableButton();
    }

    //��ӱ�ѡ���ҳ�湴ѡ��
    public void goToselectTable(){
        createFormHandle.clickselectTable();
    }

    //��ӱ�ѡ���ҳ�湴ѡ��ȷ����ť
    public void goTochooseTableButton(){
        createFormHandle.clickchooseTableButton();
    }

    //��ӱ�ҳ�桰��һ������ť
    public void goTochooseFormNextStepButton(){
        createFormHandle.clickchooseFormNextStepButton();
    }

    //����ѡ���ģ��Iframe
    public void goTochooseFormTemplateIframe(){
        createFormHandle.goTochooseFormTemplateIframe();
    }

    //�˳�ѡ���ģ��Iframe
    public void outchooseFormTemplateIframe(){
        createFormHandle.outchooseFormTemplateIframe();
    }

    //ѡ���ģ�塰��һ������ť
    public void goTochooseTemplateButton(){
        createFormHandle.clickchooseTemplateButton();
    }

}
