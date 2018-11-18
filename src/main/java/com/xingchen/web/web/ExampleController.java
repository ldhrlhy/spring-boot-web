package com.xingchen.web.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ExampleController {
    @RequestMapping("/string")
    public String string(ModelMap map) {
        map.addAttribute("userName", "xingchen");
        return "string";
    }
    @RequestMapping("/if")
    public String ifunless(ModelMap map) {
        map.addAttribute("flag", "true");
        return "if";
    }
    @RequestMapping("/inline")
    public String inline(ModelMap map) {
        map.addAttribute("userName", "dong");
        return "inline";
    }
    @RequestMapping("/object")
    public String object(HttpServletRequest request) {
        request.setAttribute("request","i am request");
        request.getSession().setAttribute("session","i am session");
        return "object";
    }
}
