package testCase;

import Base.DriverBase;
import Utils.HandleCookie;
import Utils.ProUtil;
import busession.*;
import org.apache.log4j.Logger;
import org.testng.annotations.*;

public class Login extends CaseBase{
    public DriverBase driver;
    public LoginBusession loginBusession;
    public HomeBusession homeBusession;
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
        loginBusession = new LoginBusession(driver);
        homeBusession = new HomeBusession(driver);
        handleCookie = new HandleCookie(driver);
        driver.getUrl(proUtil.getPro("url"));
        homeBusession.dengLuButtom();
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
        //打印日志
        logger.debug("打印日志");
        loginBusession.login(userName,passWord);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(homeBusession.assertNickName(proUtil.getPro("expectedResults"))){
            System.out.println("登录成功" + userName);
            handleCookie.writeCookie();
        }else{
            System.out.println("登录失败");
        }
    }

    @AfterClass
    public void afterTest(){
        driver.stop();
    }
}
