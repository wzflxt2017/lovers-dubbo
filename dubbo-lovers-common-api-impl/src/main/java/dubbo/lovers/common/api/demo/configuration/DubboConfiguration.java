package dubbo.lovers.common.api.demo.configuration;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: wangzefeng
 * @Date: 2019-12-25 22:43
 * @Description:
 */
@Configuration
@EnableDubbo(scanBasePackages = "dubbo.lovers.common.api.demo.impl")
public class DubboConfiguration {

}
