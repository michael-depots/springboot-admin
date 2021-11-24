package emp.novabeyond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author ruoyi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EmpApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(EmpApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  EMP启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "==================== START ===================\n");
    }
}
