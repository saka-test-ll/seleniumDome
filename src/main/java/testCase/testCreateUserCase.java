package testCase;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import business.CreateUserBusiness;
import org.testng.annotations.*;

public class testCreateUserCase extends CaseBase {

    public DriverBase driver;
    public ProUtil proUtil;
    public HandleCookie handleCookie;
    public CreateUserBusiness createUserBusiness;

    @BeforeClass
    public void createUserBeforeClass(){
        this.driver = InitDriver("chrowe");
        driver.implicitlywait();
        proUtil = new ProUtil("src\\main\\resources\\loginTest.properties");
        driver.implicitlywait();
        createUserBusiness = new CreateUserBusiness(driver);
        handleCookie = new HandleCookie(driver);
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
        createUserBusiness.goToUserCenterMenu();
        driver.implicitlywait();
        createUserBusiness.goToUserManagerMenu();
        driver.implicitlywait();
        createUserBusiness.goToUserManagerIframeMenu();
        driver.implicitlywait();
        createUserBusiness.goToAddUserManagerMenu();
        driver.implicitlywait();
        createUserBusiness.goToAddUserIframe();
        driver.implicitlywait();
        createUserBusiness.goToBasicInfo();
        driver.implicitlywait();
        String account = proUtil.getPro("account");
        String passordin = proUtil.getPro("passwordin");
        String fullname = proUtil.getPro("fullname");
        createUserBusiness.createuser(account, passordin, fullname);
        createUserBusiness.goToOrgInfo();
        createUserBusiness.goToelectOrg();
        createUserBusiness.goToAddOrg();
        createUserBusiness.goToSelectPrimaryOrg();
        createUserBusiness.goTosaveUserButton();
        createUserBusiness.goTosaveUserSureButton();
        driver.implicitlywait();
        createUserBusiness.outAddUserIframe();
        driver.implicitlywait();
        createUserBusiness.goToUserManagerIframeMenu();
        driver.implicitlywait();
        String queryAccountBox = proUtil.getPro("account");
        createUserBusiness.queryuser(queryAccountBox);
        driver.implicitlywait();
        createUserBusiness.goTOQueryUser();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @AfterClass
    public void createUserAfterClass(){
        driver.stop();
    }
}
