package business;

import Base.DriverBase;
import handle.CreateTableHandle;

public class CreateTableBusiness {

    public CreateTableHandle createTableHandle;

    public CreateTableBusiness(DriverBase driver) {
        createTableHandle = new CreateTableHandle(driver);
    }

    //点击流程管理Menu
    public void goToflowManagerMenu() {
        createTableHandle.clickflowManagerMenu();
    }
    //点击表单管理Menu
    public void goTOformManagerMenu(){
        createTableHandle.clickformManagerMenu();
    }
    //点击自定义表单Menu
    public void goTotableMenu(){
        createTableHandle.clicktableMenu();
    }
    //进入自定义表Iframe
    public void goTotableIframe(){
        createTableHandle.goTotableIframe();
    }
    //退出自定义表Iframe
    public void outtableIframe(){
        createTableHandle.outtableIframe();
    }
    //点击自定义表的“添加”按钮
    public void goToaddTableButton(){
        createTableHandle.clickaddTableButton();
    }
    //进入新增自定义表Iframe页面
    public void goToaddTableIframe(){
        createTableHandle.goToaddTableIframe();
    }
    //退出新增自定义表Iframe页面
    public void outaddTableIframe(){
        createTableHandle.outaddTableIframe();
    }
    //输入“注释”字段
    public void createTable(String tableDesc){
        createTableHandle.sendkeyaddTableDesc(tableDesc);
    }
    //点击“表名”字段，根据注释自动获取该字段值
    public void goToaddTableName(){
        createTableHandle.clickaddTableName();
    }
    //点击“添加列”按钮
    public void goToaddTableColumnButton(){
        createTableHandle.clickaddTableColumnButton();
    }
    //进入添加列Iframe页面
    public void goToaddTableColumnIframe(){
        createTableHandle.goToaddTableColumnIframe();
    }
    //退出添加列Iframe页面
    public void outaddTableColumnIframe(){
        createTableHandle.outaddTableColumnIframe();
    }
    //输入添加列页面的“字段描述”字段
    public void createColumn(String fieldDesc){
        createTableHandle.sendkeyaddTableColumnFieldDesc(fieldDesc);
    }
//    //点击“字段名称”字段，根据“字段描述”自动获取该字段值
//    public void  goToaddTableColumnFieldName(){
//        createTableHandle.clickaddTableColumnFieldName();
//    }
    //添加列的“保存”按钮
    public void goToaddTableColumnSaveButton(){
        createTableHandle.clickaddTableColumnSaveButton();
    }
    //添加列的“取消”按钮
    public void goTogobackTableColumnButton(){
        createTableHandle.clickgobackTableColumnButton();
    }
    //添加自定义表的“保存”按钮
    public void goToaddTableSaveButton(){
        createTableHandle.clickaddTableSaveButton();
    }
}