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
    public void addUser() {
        //进入添加用户界面、切换iframe页面
        createTableBusiness.goToflowManagerMenu();
        driver.implicitlywait();
        createTableBusiness.goTOformManagerMenu();
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
        String filedDesc =proUtil.getPro("tableColumnFieldName");
        createTableBusiness.createColumn(filedDesc);
        driver.implicitlywait();
        createTableBusiness.goToaddTableColumnFieldName();
        driver.implicitlywait();
        createTableBusiness.goToaddTableColumnSaveButton();
        driver.implicitlywait();
        createTableBusiness.goTogobackTableColumnButton();
        driver.implicitlywait();
        createTableBusiness.goToaddTableSaveButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @AfterClass
    public void createTableAfterClass(){
        driver.stop();
    }
}