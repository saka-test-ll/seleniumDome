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
    public void goToformManagerMenu(){
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
    public void createColumn(String addTableColumnFieldDesc){
        createTableHandle.sendkeyaddTableColumnFieldDesc(addTableColumnFieldDesc);
    }
   //点击“字段名称”字段，根据“字段描述”自动获取该字段值
    public void  goToaddTableColumnFieldName(){
        createTableHandle.clickaddTableColumnFieldName();
    }
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
    //添加自定义表成功弹出框的“确定”按钮
    public void goTosaveTableSureButton(){
        createTableHandle.clicksaveTableSureButton();
    }
    //点击自定义表页面“查询”用户按钮
    public void goToqueryTableButton(){
        createTableHandle.clickqueryTableButton();
    }
    //查询条件输入表名
    public void queryTableName(String queryTableNameBox){
        createTableHandle.sendKeyqueryTableNameBox(queryTableNameBox);
    }
    //鼠标悬停到“生成表”按钮
    public void goTomoveGenerate(){
        createTableHandle.movegenerate();
    }
    public void goTomoveGenerate2(){
        createTableHandle.moveGenerate2();
    }
    //鼠标点击“生成表”按钮
    public void goTomoveGenerateButton(){
        createTableHandle.movegeneratebutton();
    }
    public void goTogenerateTable(){
        createTableHandle.clickgenerateTableButton();
    }
    //鼠标点击生成表弹出框的“确定”按钮
    public void goTotableGenerateSureButton(){
        createTableHandle.clicktableGenerateSureButton();
    }
    //点击生成表成功提示框的“确定”按钮
    public void goTotableGenerateSucButton(){
        createTableHandle.clicktableGenerateSucButton();
    }
}