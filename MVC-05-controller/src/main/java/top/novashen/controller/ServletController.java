package top.novashen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.novashen.dao.User;

@Controller
public class ServletController {
    // http://localhost:8080/ll/t1?name=SYH%20LOVE%20HLT&password=syhlovehlt
    // result: User{name='SYH LOVE HLT', password='syhlovehlt'}
    @RequestMapping("/t1")
    public String test1(User user, Model model) {
        System.out.println(user);
        model.addAttribute("msg", "result: " + user);
        return "test";
    }
}
