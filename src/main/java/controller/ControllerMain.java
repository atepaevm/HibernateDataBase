package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerMain {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld(ModelMap model){
        model.addAttribute("message","Param-para-pa");
        return "hello";
    }
}
