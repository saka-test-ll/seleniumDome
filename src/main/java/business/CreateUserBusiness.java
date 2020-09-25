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

    public void goToBasicInfo(){createUserHandle.clickBasicInfo();}

    public void createuser(String account,String passwordin,String fullname){
        createUserHandle.sendKeyAccount(account);
        createUserHandle.sendKeypasswordin(passwordin);
        createUserHandle.sendKeyfullName(fullname);
    }
    //进入组织信息
    public void goToOrgInfo(){createUserHandle.clickOrgInfo();}
    //选择组织
    public void goToelectOrg(){createUserHandle.clickSelectOrg();}
    //添加组织
    public void goToAddOrg(){createUserHandle.clickaddOrgButton();}
    //选择主组织
    public void goToSelectPrimaryOrg(){createUserHandle.clickSelectPrimaryOrg();}
    //保存新增用户
    public void goTosaveUserButton(){createUserHandle.clicksaveUserButton();}
    //保存用户成功后确定关闭弹出框
    public void goTosaveUserSureButton(){createUserHandle.clicksaveUserSureButton();}

    public void queryuser(String queryAccountBox){createUserHandle.sendKeyqueryAccountBox(queryAccountBox);}

    //查询用户
    public void goTOQueryUser(){createUserHandle.clickQueryUserButton();}

}
