package busession;

import Base.DriverBase;
import Utils.ProUtil;
import handle.LoginHandle;

/**
 *  业务层
 */
public class LoginBusession {
    public LoginHandle loginHandle;

    /**
     *  构造方法
     * @param driver
     */
    public LoginBusession(DriverBase driver){
        loginHandle = new LoginHandle(driver);
    }

    /**
     *  用户登录
     */
    public void login(String userName,String passWord){
        if(loginHandle.assertLoginPage()){
            loginHandle.sendKeyUsername(userName);
            loginHandle.sendKeyPassword(passWord);
            loginHandle.clickAutoSignin();
            loginHandle.clickLoginButton();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("页面不存在或状态不正确");
        }

    }
}
