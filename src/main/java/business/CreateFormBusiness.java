package business;

import Base.DriverBase;
import handle.CreateFormHandle;

public class CreateFormBusiness {
    public CreateFormHandle createFormHandle;
    public CreateFormBusiness(DriverBase driver){
        createFormHandle = new CreateFormHandle(driver);
    }
    //点击流程管理Menu
    public void goToflowManagerMenu() {
        createFormHandle.clickflowManagerMenuForm();
    }
    //点击表单管理Menu
    public void goToformManagerMenu(){
        createFormHandle.clickformManagerMenuForm();
    }
    //点击自定义表单Menu
    public void goToformMenu(){
        createFormHandle.clickformMenu();
    }
    //进入自定义表单Iframe
    public void goToformIframe(){
        createFormHandle.goToformIframe();
    }

    //退出自定义表单Iframe
    public void outformIframe(){
        createFormHandle.outformIframe();
    }

    //点击新增自定义表单“添加”按钮
    public void goToaddFormButton(){
        createFormHandle.goToaddFormButton();
    }

    //进入添加表单Iframe页面
    public void goToaddFormIframe(){
        createFormHandle.goToaddFormIframe();
    }

    //退出添加表单Iframe页面
    public void outaddFormIframe(){
        createFormHandle.outaddFormIframe();
    }

    //添加表单页面“表单标题”字段
    public void createForm(String formSubject){
        createFormHandle.sendkeyformSubject(formSubject);
    }

    //点击“表单别名”字段，根据“表单标题”自动获取该字段值
    public void goToformKey(){
        createFormHandle.clickformKey();
    }

    //点击添加表单页面“搜索”图标
    public void goToserchTableIconButton(){
        createFormHandle.clickserchTableIconButton();
    }

    //进入添加表单时选择表Iframe
    public void goToselectTableIframe(){
        createFormHandle.goToselectTableIframe();
    }

    //退出添加表单时选择表Iframe
    public void outselectTableIframe(){
        createFormHandle.outselectTableIframe();
    }

    //选择表的form
/*    public void goToselectTableForm(){
        createFormHandle.goToselectTableForm();
    }*/

    //添加表单选择表页面查询条件“表名”
    public void goToclickqueryTableName(){createFormHandle.clickqueryTableName();}
    public void createChooseTable(String queryTableName){
        createFormHandle.sendkeyqueryTableName(queryTableName);
    }

    //添加表单选择表页面"查询"按钮
    public void goToserchTableButton(){
        createFormHandle.clickserchTableButton();
    }

    //添加表单选择表页面勾选表
    public void goToselectTable(){
        createFormHandle.clickselectTable();
    }

    //添加表单选择表页面勾选表确定按钮
    public void goTochooseTableButton(){
        createFormHandle.clickchooseTableButton();
    }

    //添加表单页面“下一步”按钮
    public void goTochooseFormNextStepButton(){
        createFormHandle.clickchooseFormNextStepButton();
    }

    //进入选择表单模板Iframe
    public void goTochooseFormTemplateIframe(){
        createFormHandle.goTochooseFormTemplateIframe();
    }

    //退出选择表单模板Iframe
    public void outchooseFormTemplateIframe(){
        createFormHandle.outchooseFormTemplateIframe();
    }

    //选择表单模板“下一步”按钮
    public void goTochooseTemplateButton(){
        createFormHandle.clickchooseTemplateButton();
    }

}
