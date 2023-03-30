package top.novashen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tt")
public class HelloController {
    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("msg", "SpringMVC Annotation!SYH LOVE HLT");

        return "test";
    }
}
