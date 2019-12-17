package com.xiayu;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

public class GetConfigTest {

    public static void main(String[] args) {
        Config config = ConfigService.getAppConfig();
        String someKey = "sms.enable";
        String value = config.getProperty(someKey, null);
        System.out.println("sms.enable: " + value);
    }
}