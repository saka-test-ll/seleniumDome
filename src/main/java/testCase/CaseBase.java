package testCase;

import Base.DriverBase;

public class CaseBase {
    public DriverBase driver;

    /**
     *   输入对应浏览器生成对应的driver
     */
    public DriverBase InitDriver(String browser){
        this.driver = new DriverBase(browser);
        return driver;
    }
}
