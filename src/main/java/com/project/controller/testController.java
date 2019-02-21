package com.project.controller;


import com.project.entity.User;
import com.project.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class testController {

    @Autowired
    TestService testService;
    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        HttpSession session=request.getSession();
        User user=testService.getUserForTest();
        session.setAttribute("userName",user.getUsername());
        return "index";
    }
}
