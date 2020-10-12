package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *  元素层
 */
public class CreateFormPage extends BasePage {

    /**
     * 构造方法
     *
     * @param driver
     */
    public CreateFormPage(DriverBase driver) {
        super(driver);
    }

    //获取菜单栏流程管理Element元素
    public WebElement getFlowManagerMenuForm() {
        return element(GetByLocator.getLocator("flowManagerMenuform"));
    }

    //获取表单管理Element元素
    public WebElement getFormManagerMenuForm() {
        return element(GetByLocator.getLocator("formManagerMenuform"));
    }

    //获取自定义表单菜单项
    public WebElement getFormMenu(){
        return element(GetByLocator.getLocator("formMenu"));
    }

    //获取自定义表单Iframe
    public WebElement getFormIframe(){
        return element(GetByLocator.getLocator("formIframe"));
    }

    //获取新增自定义表单“添加”按钮
    public WebElement getAddFormButton(){
        return element(GetByLocator.getLocator("addFormButton"));
    }

    //获取添加表单Iframe页面
    public WebElement getAddFormIframe(){
        return element(GetByLocator.getLocator("addFormIframe"));
    }

    //获取添加表单页面“表单标题”字段
    public WebElement getFormSubject(){
        return element(GetByLocator.getLocator("formSubject"));
    }

    //获取添加表单页面“表单别名”字段
    public WebElement getFormKey(){
        return element(GetByLocator.getLocator("formKey"));
    }

    //获取添加表单页面“搜索”图标
    public WebElement getSerchTableIconButton(){
        return element(GetByLocator.getLocator("serchTableIconButton"));
    }

    //获取添加表单时选择表Iframe
    public WebElement getSelectTableIframe(){
        return element(GetByLocator.getLocator("selectTableIframe"));
    }

/*    //获取选择表的form
    public WebElement getSelectTableForm(){
        return element(GetByLocator.getLocator("selectTableForm"));
    }*/

    //添加表单选择表页面查询条件“表名”
    public WebElement getQueryTableName(){
        return element(GetByLocator.getLocator("queryTableName"));
    }

    //添加表单选择表页面"查询"按钮
    public WebElement getSerchTableButton(){
        return element(GetByLocator.getLocator("serchTableButton"));
    }

    //添加表单选择表页面勾选表
    public WebElement getSelectTable(){
        return element(GetByLocator.getLocator("selectTable"));
    }

    //添加表单选择表页面勾选表确定按钮
    public WebElement getChooseTableButton(){
        return element(GetByLocator.getLocator("chooseTableButton"));
    }

    //添加表单页面“下一步”按钮
    public WebElement getChooseFormNextStepButton(){
        return element(GetByLocator.getLocator("chooseFormNextStepButton"));
    }

    //选择表单模板Iframe
    public WebElement getChooseFormTemplateIframe(){
        return element(GetByLocator.getLocator("chooseFormTemplateIframe"));
    }

    //选择表单模板“下一步”按钮
    public WebElement getchooseTemplateButton(){
        return element(GetByLocator.getLocator("chooseTemplateButton"));
    }

}
