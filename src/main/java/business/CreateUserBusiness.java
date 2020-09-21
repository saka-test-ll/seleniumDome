package business;

import handle.CreateUserHandle;

public class CreateUserBusiness {

    public CreateUserHandle createUserHandle;

    /**
     *  点击用户中心-用户管理，进入用户管理界面
     */
    public void goToUserManagerMenu(){
        createUserHandle.clickuserCenterMenu();
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
