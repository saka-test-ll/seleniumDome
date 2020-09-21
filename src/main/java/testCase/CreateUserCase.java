package testCase;

import Base.DriverBase;
import Utils.ProUtil;
import business.CreateUserBusiness;
import org.testng.annotations.*;

public class CreateUserCase extends CaseBase {

    public DriverBase driver;
    public ProUtil proUtil;
    public LoginCase loginCase;
    public CreateUserBusiness createUserBusiness;
    public CreateUserCase(DriverBase driver){
        this.driver = driver;

    }

    @BeforeClass
    public void createUserBeforeClass(){
        this.driver = InitDriver("chrome");
        proUtil = new ProUtil("src\\main\\resources\\loginTest.properties");
        loginCase = new LoginCase();
        createUserBusiness = new CreateUserBusiness();
    }

    @BeforeTest
    public void createUserBeforeTest(){
        //进入添加用户界面、切换iframe页面
        loginCase.testLogin(proUtil.getPro("userName"),proUtil.getPro("passWord"));
        createUserBusiness.goToUserManagerMenu();
        createUserBusiness.goToUserManagerIframeMenu();
    }

    @Test()
    public void addUser(){
        createUserBusiness.goToAddUserManagerMenu();
    }

    @AfterTest
    public void createUserAfterTest(){
        createUserBusiness.outUserManagerIframeMenu();
    }


    @AfterClass
    public void createUserAfterClass(){
        driver.stop();
    }


}
