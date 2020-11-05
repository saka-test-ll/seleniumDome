package testCase;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import business.CreateUserBusiness;
import org.testng.annotations.*;
import handle.HomeHandle;

public class CreateUserCase extends CaseBase {

    public DriverBase driver;
    public ProUtil proUtil;
    public HandleCookie handleCookie;
    public CreateUserBusiness createUserBusiness;
    public HomeHandle homeHandle;

    @BeforeClass
    public void createUserBeforeClass(){
        this.driver = InitDriver("chrowe");
        driver.windowMax();
        proUtil = new ProUtil("src\\main\\resources\\loginTest.properties");
        createUserBusiness = new CreateUserBusiness(driver);
        handleCookie = new HandleCookie(driver);
        driver.getUrl(proUtil.getPro("homeURL"));
        handleCookie.delectCookie();
        handleCookie.setCookie();
        driver.getUrl(proUtil.getPro("homeURL"));
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //新增用户
    @Test
    public void addUser() {
        //进入添加用户界面、切换iframe页面
        createUserBusiness.goToCreateUserIframe();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.implicitlywait();
        createUserBusiness.createUser();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //查询用户
    @Test
    public void queryUser(){
        createUserBusiness.queryUser();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


//    @AfterClass
//    public void createUserAfterClass(){
//        driver.stop();
//    }
}
