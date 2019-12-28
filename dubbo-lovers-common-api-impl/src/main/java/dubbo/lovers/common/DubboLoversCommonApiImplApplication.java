package dubbo.lovers.common;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "dubbo.lovers.common.api.demo.impl")
@EnableCaching
public class DubboLoversCommonApiImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboLoversCommonApiImplApplication.class, args);
    }

}
