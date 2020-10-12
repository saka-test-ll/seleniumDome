package testCase;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import business.CreateFormBusiness;
import org.testng.annotations.*;


public class CreateFormCase extends CaseBase {

    public DriverBase driver;
    public ProUtil proUtil;
    public HandleCookie handleCookie;
    public CreateFormBusiness createFormBusiness;


    @BeforeClass
    public void createFormBeforeClass() {
        this.driver = InitDriver("chrowe");
        driver.implicitlywait();
        proUtil = new ProUtil("src\\main\\resources\\loginTest.properties");
        driver.implicitlywait();
        createFormBusiness = new CreateFormBusiness(driver);
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
        createFormBusiness.goToflowManagerMenu();
        driver.implicitlywait();
        createFormBusiness.goToformManagerMenu();
        driver.implicitlywait();
        createFormBusiness.goToformMenu();
        driver.implicitlywait();
        createFormBusiness.goToformIframe();
        driver.implicitlywait();
        createFormBusiness.goToaddFormButton();
        driver.implicitlywait();
        createFormBusiness.goToaddFormIframe();
        driver.implicitlywait();
        String formSubject =proUtil.getPro("formSubject");
        createFormBusiness.createForm(formSubject);
        driver.implicitlywait();
        createFormBusiness.goToformKey();
        driver.implicitlywait();
        createFormBusiness.goToserchTableIconButton();
        driver.implicitlywait();
        createFormBusiness.goToselectTableIframe();
        driver.implicitlywait();
        createFormBusiness.goToclickqueryTableName();
        driver.implicitlywait();
        String queryTableName = proUtil.getPro("tableName");
        createFormBusiness.createChooseTable(queryTableName);
        driver.implicitlywait();
        createFormBusiness.goToserchTableButton();
        driver.implicitlywait();
        createFormBusiness.goToselectTable();
        driver.implicitlywait();
        createFormBusiness.goTochooseTableButton();
        driver.implicitlywait();
        createFormBusiness.goTochooseFormNextStepButton();
        createFormBusiness.goTochooseFormTemplateIframe();
        createFormBusiness.goTochooseTemplateButton();

    }
}