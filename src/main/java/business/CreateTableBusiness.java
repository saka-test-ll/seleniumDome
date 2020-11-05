package business;

import Base.DriverBase;
import Utils.ProUtil;
import handle.CreateTableHandle;
import handle.HomeHandle;

public class CreateTableBusiness {

    public DriverBase driver;
    public ProUtil proUtil;
    public CreateTableHandle createTableHandle;
    public HomeHandle homeHandle;
    public CreateTableBusiness(DriverBase driver) {
        this.driver = driver;
        createTableHandle = new CreateTableHandle(driver);
        homeHandle = new HomeHandle(driver);
    }

    //关闭IM聊天窗口，进入用户管理菜单及Iframe页面
    public void goToCreateTableIframe(){
        homeHandle.clickcloseImWindow();
        createTableHandle.clickflowManagerMenu();
        createTableHandle.clickformManagerMenu();
        createTableHandle.clicktableMenu();
        createTableHandle.goTotableIframe();
    }

    //新增自定义表单
    public void CreateTable(){
        createTableHandle.clickaddTableButton();
        createTableHandle.goToaddTableIframe();
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String tableDesc = proutil.getPro("tableDesc");
        createTableHandle.sendkeyaddTableDesc(tableDesc);
        createTableHandle.clickaddTableName();
        createTableHandle.clickaddTableColumnButton();
        createTableHandle.goToaddTableColumnIframe();
        String addTableColumnFieldDesc = proutil.getPro("tableColumnFieldDesc");
        createTableHandle.sendkeyaddTableColumnFieldDesc(addTableColumnFieldDesc);
        createTableHandle.clickaddTableColumnFieldName();
        createTableHandle.clickaddTableColumnSaveButton();
        createTableHandle.clickgobackTableColumnButton();
        createTableHandle.outaddTableColumnIframe();
        createTableHandle.clickaddTableSaveButton();
        createTableHandle.clicksaveTableSureButton();

    }

    //查询自定义表单
    public void queryTable(){
        createTableHandle.goTotableIframe();
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String queryTableNameBox = proutil.getPro("tableDesc");
        createTableHandle.sendKeyqueryTableNameBox(queryTableNameBox);
        createTableHandle.clickqueryTableButton();
    }

    //生成自定义表单
    public void publishTable(){
        createTableHandle.movegenerate();
        createTableHandle.moveGenerate2();
        createTableHandle.movegeneratebutton();
        driver.implicitlywait();
        createTableHandle.clickgenerateTableButton();
        driver.implicitlywait();
        createTableHandle.clicktableGenerateSureButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        createTableHandle.clicktableGenerateSucButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }
}