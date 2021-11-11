package com.csy.sec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member")
public class MemberController {

    // login form 을 열기 위한 URL (* 우리가 만든 form 을 열기 위해 method 를 GET 으로 해줘야 한다)
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String login() {
        return "member/login";
    }

}
