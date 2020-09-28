package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.WebElement;

/**
 *  元素层
 */
public class CreateTablePage extends BasePage{

    /**
     * 构造方法
     *
     * @param driver
     */
    public CreateTablePage(DriverBase driver) {
        super(driver);
    }

    //获取菜单栏用户中心Element元素
    public WebElement getFlowManagerMenu(){
        return element(GetByLocator.getLocator("flowManagerMenu"));
    }

    //获取表单管理Element元素
    public WebElement getFormManagerMenu(){
        return element(GetByLocator.getLocator("formManagerMenu"));
    }

    //获取自定义表Element元素
    public WebElement getTableMenu(){
        return element(GetByLocator.getLocator("tableMenu"));
    }

    //获取自定义表Iframe
    public WebElement getTableIframe(){
        return element(GetByLocator.getLocator("tableIframe"));
    }

    //获取自定义表的添加按钮
    public WebElement getAddTableButton(){
        return element(GetByLocator.getLocator("addTableButton"));
    }

    //获取添加自定义表Iframe
    public WebElement getAddTableIframe(){
        return element(GetByLocator.getLocator("addTableIframe"));
    }

    //获取添加自定义表“注释”输入框
    public WebElement getAddTableDesc(){
        return element(GetByLocator.getLocator("addTableDesc"));
    }

    //获取添加自定义表“表名”输入框
    public WebElement getAddTableName(){
        return element(GetByLocator.getLocator("addTableName"));
    }

    //获取添加列Element
    public WebElement getAddTableColumnButton(){
        return element(GetByLocator.getLocator("addTableColumnButton"));
    }

    //获取添加列页面Iframe
    public WebElement getAddTableColumnIframe(){
        return element(GetByLocator.getLocator("addTableColumnIframe"));
    }

    //获取添加列页面“字段描述”输入框
    public WebElement getAddTableColumnFieldDesc(){
        return element(GetByLocator.getLocator("addTableColumnFieldDesc"));
    }

//    //获取添加列页面“字段名称”输入框
//    public WebElement getAddTableColumnFieldName(){
//        return element(GetByLocator.getLocator("addTableColumnFieldName"));
//    }

    //获取添加列字段后的保存按钮
    public WebElement getAddTableColumnSaveButton(){
        return element(GetByLocator.getLocator("addTableColumnSaveButton"));
    }

    //关闭添加列的取消按钮
    public WebElement getGobackTableColumnButton(){
        return element(GetByLocator.getLocator("gobackTableColumnButton"));
    }

    //获取添加自定义表的保存按钮
    public WebElement getAddTableSaveButton(){
        return element(GetByLocator.getLocator("addTableSaveButton"));
    }

}
