package handle;

import Base.DriverBase;
import page.CreateTablePage;
import page.CreateTablePage;

public class CreateTableHandle {

    public DriverBase driver;
    public CreateTablePage createTablePage;

    /**
     * 构造方法
     *
     * @param driver
     */
    public CreateTableHandle(DriverBase driver) {
        this.driver = driver;
        createTablePage = new CreateTablePage(driver);
    }

    //点击流程管理Menu
    public void clickflowManagerMenu() {
        createTablePage.leftClickMouse(createTablePage.getFlowManagerMenu());
    }

    //点击表单管理Menu
    public void clickformManagerMenu(){
        createTablePage.leftClickMouse(createTablePage.getFormManagerMenu());
    }

    //点击自定义表Menu
    public void clicktableMenu(){
        createTablePage.leftClickMouse(createTablePage.getTableMenu());
    }

    //进入自定义表iframe页面
    public void goTotableIframe(){
        createTablePage.findIframeElement(createTablePage.getTableIframe());
    }

    //退出自定义表iframe页面
    public void outtableIframe(){
        driver.outIframeElement();
    }

    //点击自定义表的“添加”按钮
    public void clickaddTableButton(){
        createTablePage.click(createTablePage.getAddTableButton());
    }

    //进入新增自定义表Iframe页面
    public void goToaddTableIframe(){
        createTablePage.findIframeElement(createTablePage.getAddTableIframe());
    }

    //退出新增自定义表iframe页面
    public void outaddTableIframe(){
        driver.outIframeElement();
    }

    //输入“注释”字段
    public void sendkeyaddTableDesc(String tableDesc){
        createTablePage.sendKeys(createTablePage.getAddTableDesc(),tableDesc);
    }

    //点击“表名”字段，根据注释自动获取该字段值
    public void clickaddTableName(){
        createTablePage.leftClickMouse(createTablePage.getAddTableName());
    }

    //点击“添加列”按钮
    public void clickaddTableColumnButton(){
        createTablePage.click(createTablePage.getAddTableColumnButton());
    }

    //进入添加列Iframe页面
    public void goToaddTableColumnIframe(){
        createTablePage.findIframeElement(createTablePage.getAddTableColumnIframe());
    }
    //退出添加自定义列Iframe页面
    public void outaddTableColumnIframe(){
        driver.outIframeElement();
    }
    //输入添加列的”字段描述“字段
    public void sendkeyaddTableColumnFieldDesc(String addTableColumnFieldDesc){
        createTablePage.sendKeys(createTablePage.getAddTableColumnFieldDesc(),addTableColumnFieldDesc);
    }
//    //点击“字段名称”字段，根据“字段描述”自动获取该字段值
//    public void clickaddTableColumnFieldName(){
//        createTablePage.leftClickMouse(createTablePage.getAddTableColumnFieldName());
//    }

    //点击添加列的“保存”按钮
    public void clickaddTableColumnSaveButton(){
        createTablePage.click(createTablePage.getAddTableColumnSaveButton());
    }

    //添加列的“取消”按钮
    public void clickgobackTableColumnButton(){
        createTablePage.click(createTablePage.getGobackTableColumnButton());
    }

    //点击添加自定义表的“保存”按钮
    public void clickaddTableSaveButton(){
        createTablePage.click(createTablePage.getAddTableSaveButton());
    }
}
