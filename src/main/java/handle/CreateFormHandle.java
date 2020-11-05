package handle;

import Base.DriverBase;
import org.openqa.selenium.WebElement;
import page.CreateFormPage;
import page.CreateTablePage;

import java.util.ArrayList;
import java.util.List;

public class CreateFormHandle {

    public DriverBase driver;
    public CreateFormPage createFormPage;

    /**
     * 构造方法
     *
     *
     */
    public CreateFormHandle(DriverBase driver) {
        this.driver = driver;
        createFormPage = new CreateFormPage(driver);
    }

    //点击流程管理Menu
    public void clickflowManagerMenuForm() {
        createFormPage.leftClickMouse(createFormPage.getFlowManagerMenuForm());
    }

    //点击表单管理Menu
    public void clickformManagerMenuForm() {
        createFormPage.leftClickMouse(createFormPage.getFormManagerMenuForm());
    }

    //点击自定义表单Menu
    public void clickformMenu() {
        createFormPage.leftClickMouse(createFormPage.getFormMenu());
    }

    //进入自定义表iframe页面
    public void goToformIframe() {
        createFormPage.findIframeElement(createFormPage.getFormIframe());
    }

    //退出自定义表iframe页面
    public void outformIframe(){
        driver.outIframeElement();
    }

    //点击新增自定义表单“添加”按钮
    public void goToaddFormButton(){
        createFormPage.click(createFormPage.getAddFormButton());
    }

    //进入添加表单Iframe页面
    public void goToaddFormIframe(){
        createFormPage.findIframeElement(createFormPage.getAddFormIframe());
    }

    //退出添加表单Iframe页面
    public void outaddFormIframe(){
        driver.outIframeElement();
    }

    //添加表单页面“表单标题”字段
    public void sendkeyformSubject(String formSubject){
        createFormPage.sendKeys(createFormPage.getFormSubject(),formSubject);
    }

    //点击“表单别名”字段，根据“表单标题”自动获取该字段值
    public void clickformKey(){
        createFormPage.leftClickMouse(createFormPage.getFormKey());
    }

    //点击添加表单页面“搜索”图标
    public void clickserchTableIconButton(){
        createFormPage.click(createFormPage.getSerchTableIconButton());
    }

    //进入添加表单时选择表Iframe
    public void goToselectTableIframe(){
        createFormPage.findIframeElement(createFormPage.getSelectTableIframe());
    }

    //退出添加表单时选择表Iframe
    public void outselectTableIframe(){
        driver.outIframeElement();
    }

    //添加表单选择表页面查询条件“表名”
    public void sendkeyqueryTableName(String queryTableName){
        createFormPage.sendKeys(createFormPage.getQueryTableName(),queryTableName);
    }

    //添加表单选择表页面"查询"按钮
    public void clickserchTableButton(){
        createFormPage.click(createFormPage.getSerchTableButton());
    }

    //添加表单选择表页面勾选表
    public void clickselectTable(){
        createFormPage.leftClickMouse(createFormPage.getSelectTable());
    }

    //添加表单选择表页面勾选表确定按钮
    public void clickchooseTableButton(){
        createFormPage.click(createFormPage.getChooseTableButton());
    }

    //添加表单页面“下一步”按钮
    public void clickchooseFormNextStepButton(){
        createFormPage.click(createFormPage.getChooseFormNextStepButton());
    }

    //进入选择表单模板Iframe
    public void goTochooseFormTemplateIframe(){
        createFormPage.findIframeElement(createFormPage.getChooseFormTemplateIframe());
    }

    //退出选择表单模板Iframe
    public void outchooseFormTemplateIframe(){
        driver.outIframeElement();
    }

    //选择表单模板“下一步”按钮
    public void clickchooseTemplateButton(){
        createFormPage.click(createFormPage.getchooseTemplateButton());
    }

    //表单设计页面将左侧的字段依次添加到表单中
//    List<WebElement> addFieldToForm = new ArrayList<WebElement>();
//    public void findaddFieldToFormElement() {
//        addFieldToForm = createFormPage.getaddFieldToForm();
//    }
//    public void clickaddFieldToForm0(){createFormPage.leftClickMouse(addFieldToForm.get(0));}
//    public void clickaddFieldToForm1(){createFormPage.leftClickMouse(addFieldToForm.get(1));}

    public void clickaddFieldToForm0(){createFormPage.leftClickMouse(createFormPage.getaddFieldToForm().get(0));}
    public void clickaddFieldToForm1(){createFormPage.leftClickMouse(createFormPage.getaddFieldToForm().get(1));}

    //表单设计页面的“保存”按钮
    public void clickFormDesignPagesaveButton(){createFormPage.click(createFormPage.getFormDesignPagesaveButton());}

    //保存表单设计后不再做其他操作的“取消”按钮
    public void clickcancelContinueFormDesignButton(){createFormPage.click(createFormPage.getcancelContinueFormDesignButton());}

    //表单查询条件“表单标题”
    public void sendkeyformSubjectBox(String formSubjectBox){
        createFormPage.sendKeys(createFormPage.getformSubjectBox(),formSubjectBox);
    }

    //表单“查询”按钮
    public void clickqueryFormButton(){
        createFormPage.click(createFormPage.getqueryFormButton());
    }

    //自定义表单的“发布按钮”
    public void movemovePublishForm(){createFormPage.moveToElement(createFormPage.getmovePublishForm());}
    public void movemovePublishForm1(){createFormPage.moveToElement(createFormPage.getmovePublishForm1());}
    public void clickpublishFormButton(){createFormPage.click(createFormPage.getpublishFormButton());}

    //自定义表单是否确认发布提示框的“确定”按钮
    public void clicksurePublishFormButton(){createFormPage.click(createFormPage.getsurePublishFormButton());}

    //发布自定义表单成功提示框的“确定”按钮
    public void clicksurePublishFormSucButton(){createFormPage.click(createFormPage.getsurePublishFormSucButton());}
}
