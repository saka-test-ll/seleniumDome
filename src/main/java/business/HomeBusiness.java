package business;

import Base.DriverBase;
import handle.HomeHandle;

public class HomeBusiness {

    public HomeHandle homeHandle;

    public HomeBusiness(DriverBase driver) {
        homeHandle = new HomeHandle(driver);
    }

    /**
     * 判断登录用户名信息
     */
    public boolean assertCurrentUser(String expectedName) {
        String currentUser = homeHandle.getLoginUsername();
        if (currentUser.equals(expectedName)) {
            return true;
        }
        return false;
    }

    //关闭IM聊天窗口
    public void closeIMChat() {
        homeHandle.clickcloseImWindow();
    }
}

