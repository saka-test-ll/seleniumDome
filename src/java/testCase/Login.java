package src.java.testCase;

import src.java.Base.DriverBase;
import src.java.Utils.HandleCookie;
import src.java.Utils.ProUtil;
import business.*;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Login extends CaseBase{
    public DriverBase driver;
    public LoginBusiness loginBusiness;
    public HomeBusiness homeBusiness;
    public ProUtil proUtil;
    public HandleCookie handleCookie;

    static Logger logger = Logger.getLogger(Login.class);

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
     *  测试用户登录
     */
    @Test
    @Parameters({"userName","passWord"})
    public void testLogin(String userName,String passWord){
        loginBusiness.login(userName,passWord);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(homeBusiness.assertCurrentUser(proUtil.getPro("expectedName"))){
            System.out.println("登录成功" + userName);
            handleCookie.writeCookie();
        }else{
            System.out.println("登录失败");
        }
    }

    @AfterClass
    public void afterTest() {
            driver.stop();
        }

    }

