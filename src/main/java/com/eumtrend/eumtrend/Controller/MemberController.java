package com.eumtrend.eumtrend.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping(value = "/login")
    public String loginMember() {
        return "/member/memberLoginForm";
    }
}
