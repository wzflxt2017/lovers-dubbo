package dubbo.lovers.server.demo.configuration;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Auther: wangzefeng
 * @Date: 2019-12-25 22:45
 * @Description:
 */
@Configuration
@EnableDubbo(scanBasePackages = "dubbo.lovers.server.demo.controller")
@ComponentScan(value = {"dubbo.lovers.server.demo.controller"})
public class DubboConfiguration {

}
