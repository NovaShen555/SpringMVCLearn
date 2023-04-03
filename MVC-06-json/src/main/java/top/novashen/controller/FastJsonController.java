package top.novashen.controller;

import com.alibaba.fastjson2.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.novashen.dao.User;

@Controller
public class FastJsonController {
    @ResponseBody
    @RequestMapping("/t3")
    public String t1() {
        User syh = new User("SYH", " LOVE HLT");
        String s = JSON.toJSONString(syh);
        System.out.println(s);
        return s;
    }
}
