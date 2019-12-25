package dubbo.lovers.common.api.demo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.lovers.common.api.demo.DemoService;

/**
 * @Auther: wangzefeng
 * @Date: 2019-12-25 21:10
 * @Description:
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String helloDubbo() {
        System.out.println("hello dubbo");
        return "hello dubbo";
    }
}
