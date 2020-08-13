package handle;

import Base.DriverBase;
import page.LoginPage;

/**
 *  操作层
 */
public class LoginHandle {

    public DriverBase driver;
    public LoginPage loginPage;

    /**
     *  构造方法
     * @param driver
     */
    public LoginHandle(DriverBase driver){
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    /**
     *  输入用户名
     */
    public void sendKeyUsername(String userName){
        loginPage.sendKeys(loginPage.getUsernameElement(),userName);
    }

    /**
     *  输入密码
     */
    public void sendKeyPassword(String passWord){
        loginPage.sendKeys(loginPage.getPasswordElement(),passWord);
    }

    /**
     *  点击自动登录
     */
    public void clickAutoSignin(){
        loginPage.click(loginPage.getAutoSigninElement());
    }

    /**
     *  点击登录界面登录按钮
     */
    public void clickLoginButton(){
        loginPage.click(loginPage.getLoginButtonElement());
    }

    /**
     *  判断是否是登录界面
     */
    public boolean assertLoginPage(){
        boolean usernameBoolean = loginPage.assertElementIs(loginPage.getUsernameElement());
        boolean passwordBoolean = loginPage.assertElementIs(loginPage.getPasswordElement());
        boolean autoSigninBoolean = loginPage.assertElementIs(loginPage.getAutoSigninElement());
        boolean loginButtonBoolean = loginPage.assertElementIs(loginPage.getLoginButtonElement());
        boolean asserLogin = usernameBoolean&passwordBoolean&autoSigninBoolean&loginButtonBoolean;
        if(asserLogin == true){
            return true;
        }else{
            return false;
        }

    }
}
