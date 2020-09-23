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
        proUtil = new ProUtil("src\\main\\resources\\loginTest.properties");
        createUserBusiness = new CreateUserBusiness(driver);
        handleCookie = new HandleCookie(driver);
        driver.getUrl(proUtil.getPro("homeURL"));
        handleCookie.delectCookie();
        handleCookie.setCookie();
        driver.getUrl(proUtil.getPro("homeURL"));
        driver.windowMax();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test()
    public void addUser(){
        //进入添加用户界面、切换iframe页面
        createUserBusiness.goToUserCenterMenu();
        createUserBusiness.goToUserManagerMenu();
//        createUserBusiness.goToUserManagerIframeMenu();
//        createUserBusiness.goToAddUserManagerMenu();
    }

    @AfterTest
    public void createUserAfterTest(){
//        createUserBusiness.outUserManagerIframeMenu();
    }


    @AfterClass
    public void createUserAfterClass(){
        driver.stop();
    }


}
