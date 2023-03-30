package top.novashen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String testRestFul(Model model, @PathVariable String a, @PathVariable String b) {
        String res = a + b;
        model.addAttribute("msg", "result: " + res);
        return "test";
    }
    @PostMapping("/add/{a}/{b}")
    public String testRestFul2(Model model, @PathVariable String a, @PathVariable String b) {
        String res = a + b;
        model.addAttribute("msg", "result: " + res);
        return "test";
    }
}
