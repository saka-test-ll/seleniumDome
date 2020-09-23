package testCase;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import business.*;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginCase extends CaseBase{
    public DriverBase driver;
    public LoginBusiness loginBusiness;
    public HomeBusiness homeBusiness;
    public ProUtil proUtil;
    public HandleCookie handleCookie;

    static Logger logger = Logger.getLogger(LoginCase.class);

    /**
     *  进入网页并窗口最大化
     */
    @BeforeClass
    public void getLoginHome(){
        this.driver = InitDriver("chrome");
        proUtil = new ProUtil("src\\main\\resources\\loginTest.properties");
        loginBusiness = new LoginBusiness(driver);
        homeBusiness = new HomeBusiness(driver);
        handleCookie = new HandleCookie(driver);
        driver.getUrl(proUtil.getPro("url"));
        driver.windowMax();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     *  正向测试用户登录
     */
    @Test
    public void testLogin(){
        String username = proUtil.getPro("userName");
        String password = proUtil.getPro("passWord");
        loginBusiness.login(username,password);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(homeBusiness.assertCurrentUser(proUtil.getPro("expectedName"))){
            logger.info("登录成功" + username);
            handleCookie.writeCookie();
        }else{
            logger.info("登录失败");
        }
    }

    @AfterClass
    public void afterTest() {
            driver.stop();
        }

    }

