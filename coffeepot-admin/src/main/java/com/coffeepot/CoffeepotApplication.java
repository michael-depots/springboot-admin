package com.coffeepot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author ruoyi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CoffeepotApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(CoffeepotApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  咖啡壶启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "==================== START ===================\n");
    }
}
