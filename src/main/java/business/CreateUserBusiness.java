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

}
