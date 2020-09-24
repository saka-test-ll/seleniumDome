package business;

import Base.DriverBase;
import handle.CreateUserHandle;

public class CreateUserBusiness {

    public CreateUserHandle createUserHandle;

    public CreateUserBusiness(DriverBase driver){
        createUserHandle = new CreateUserHandle(driver);
    }

    /**
     *  点击用户中心
     */
    public void goToUserCenterMenu(){
        createUserHandle.clickuserCenterMenu();
    }

    /**
     *  点击用户管理
     */
    public void goToUserManagerMenu(){
        createUserHandle.clickuserManagerMenu();
    }

    /**
     *  切换进入iframe页面
     */
    public void goToUserManagerIframeMenu(){
        createUserHandle.goToUserManagerIframe();
    }

    /**
     *  切换退出iframe页面
     */
    public void outUserManagerIframeMenu(){
        createUserHandle.outUserManagerIframe();
    }

    /**
     *  进入用户新增界面
     */
    public void goToAddUserManagerMenu(){
        createUserHandle.clickaddUserButton();
    }

    //切换进入新增用户iframe页面
    public void goToAddUserIframe(){createUserHandle.goToAddUserIframe();}

    //切换退出新增用户iframen页面
    public void outAddUserIframe(){createUserHandle.outAddUserFrame();}

    public void goToBasicInfo(){createUserHandle.clickOrgInfo();}


    public void createuser(String account,String passwordin,String fullname){
        createUserHandle.sendKeyAccount(account);
        createUserHandle.sendKeypasswordin(passwordin);
        createUserHandle.sendKeyfullName(fullname);
    }
}
