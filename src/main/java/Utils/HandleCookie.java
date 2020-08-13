package Utils;

import Base.DriverBase;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class HandleCookie {

    public DriverBase driver;
    public ProUtil proUtil;

    public HandleCookie(DriverBase driver){
        this.driver = driver;
        proUtil = new ProUtil("src\\main\\resources\\cookie.properties");
    }

    /**
     *  读取配置文件中的cookie值
     */
    public void setCookie(){
        String value = proUtil.getPro("apsid");
        Cookie cookie = new Cookie("apsid",value,"imooc.com","/",null);
        driver.setCookie(cookie);
    }

    /**
     *  获取cookie内容
     */
    public void writeCookie(){
        Set<Cookie> cookies = driver.getCookie();
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("apsid")){
                proUtil.writePro(cookie.getName(),cookie.getValue());
            }
        }
    }
}
