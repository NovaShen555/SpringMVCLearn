package top.novashen.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.novashen.dao.User;

import java.util.Date;

@Controller
public class JsonController {
    @ResponseBody
    @RequestMapping("/t1")
    public String t1() throws JsonProcessingException {
        User syh = new User("SYH", " LOVE HLT");

        ObjectMapper objectMapper = new ObjectMapper();

        String s = objectMapper.writeValueAsString(syh);


        // System.out.println(s);
        System.out.println(syh);

        return s;

        // return syh.toString();
        // 直接返回了字符串，不过前端更喜欢json对象
    }

    @ResponseBody
    @RequestMapping("/t2")
    public String t2() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();


        Date date = new Date();

        String s = objectMapper.writeValueAsString(date);
        System.out.println(s);

        return s;

        // return syh.toString();
        // 直接返回了字符串，不过前端更喜欢json对象
    }
}
