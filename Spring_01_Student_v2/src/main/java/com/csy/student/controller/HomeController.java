package com.csy.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String home() {
        
        // tiles_layout.xml 에 설정된 name 부분
        return "HOME";
        
    }
}
