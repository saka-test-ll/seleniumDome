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
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //新增自定义表单
    @Test
    public void addTable() {
        createTableBusiness.goToCreateTableIframe();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createTableBusiness.CreateTable();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    //查询、发布自定义表单
    @Test
    public void publishTable(){
        createTableBusiness.queryTable();
        createTableBusiness.publishTable();
    }



   @AfterClass
    public void createTableAfterClass(){
        driver.stop();
    }
}