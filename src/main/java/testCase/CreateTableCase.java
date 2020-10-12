package testCase;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import business.CreateTableBusiness;
import org.testng.annotations.*;


public class CreateTableCase extends CaseBase {

    public DriverBase driver;
    public ProUtil proUtil;
    public HandleCookie handleCookie;
    public CreateTableBusiness createTableBusiness;


    @BeforeClass
    public void createTableBeforeClass(){
        this.driver = InitDriver("chrowe");
        driver.implicitlywait();
        proUtil = new ProUtil("src\\main\\resources\\loginTest.properties");
        driver.implicitlywait();
        createTableBusiness = new CreateTableBusiness(driver);
        driver.implicitlywait();
        handleCookie = new HandleCookie(driver);
        driver.implicitlywait();
        driver.getUrl(proUtil.getPro("homeURL"));
        driver.implicitlywait();
        handleCookie.delectCookie();
        driver.implicitlywait();
        handleCookie.setCookie();
        driver.implicitlywait();
        driver.getUrl(proUtil.getPro("homeURL"));
        driver.windowMax();
        driver.implicitlywait();
    }

    @Test()
    public void addTable() {
        //进入添加用户界面、切换iframe页面
        createTableBusiness.goToflowManagerMenu();
        driver.implicitlywait();
        createTableBusiness.goToformManagerMenu();
        driver.implicitlywait();
        createTableBusiness.goTotableMenu();
        driver.implicitlywait();
        createTableBusiness.goTotableIframe();
        driver.implicitlywait();
        createTableBusiness.goToaddTableButton();
        driver.implicitlywait();
        createTableBusiness.goToaddTableIframe();
        driver.implicitlywait();
        String tableDesc = proUtil.getPro("tableDesc");
        createTableBusiness.createTable(tableDesc);
        driver.implicitlywait();
        createTableBusiness.goToaddTableName();
        driver.implicitlywait();
        createTableBusiness.goToaddTableColumnButton();
        driver.implicitlywait();
        createTableBusiness.goToaddTableColumnIframe();
        driver.implicitlywait();
        String addTableColumnFieldDesc =proUtil.getPro("tableColumnFieldDesc");
        createTableBusiness.createColumn(addTableColumnFieldDesc);
        driver.implicitlywait();
        createTableBusiness.goToaddTableColumnFieldName();
        driver.implicitlywait();
        createTableBusiness.goToaddTableColumnSaveButton();
        driver.implicitlywait();
        createTableBusiness.goTogobackTableColumnButton();
        createTableBusiness.outaddTableColumnIframe();
        driver.implicitlywait();
        createTableBusiness.goToaddTableSaveButton();
        driver.implicitlywait();
        createTableBusiness.goTosaveTableSureButton();
        driver.implicitlywait();
        createTableBusiness.outaddTableIframe();
        driver.implicitlywait();
        String queryTableName = proUtil.getPro("tableDesc");
        createTableBusiness.queryTableName(queryTableName);
        driver.implicitlywait();
        createTableBusiness.goToqueryTableButton();
        driver.implicitlywait();
        createTableBusiness.goTomoveGenerate();
        driver.implicitlywait();
        createTableBusiness.goTomoveGenerate2();
        driver.implicitlywait();
        createTableBusiness.goTomoveGenerateButton();
        driver.implicitlywait();
        createTableBusiness.goTogenerateTable();
        driver.implicitlywait();
        createTableBusiness.goTotableGenerateSureButton();
        driver.implicitlywait();
        createTableBusiness.goTotableGenerateSucButton();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


/*    @AfterClass
    public void createTableAfterClass(){
        driver.stop();
    }*/
}