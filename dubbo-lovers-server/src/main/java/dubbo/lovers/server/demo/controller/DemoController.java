package dubbo.lovers.server.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.lovers.common.api.demo.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: wangzefeng
 * @Date: 2019-12-25 22:38
 * @Description:
 */
@ResponseBody
@RequestMapping("/demo")
@Controller
public class DemoController {

    @Reference
    private DemoService demoService;

    @RequestMapping("/dubbo")
    public String hello(){
        return demoService.helloDubbo();
    }

}
