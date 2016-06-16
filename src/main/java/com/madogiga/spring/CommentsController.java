package com.madogiga.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MIYEON on 2016-06-16.
 */
@Controller

public class CommentsController {
    private final static Logger logger = LoggerFactory.getLogger(CommentsController.class);

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name", "Seungho!");
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/signup")
    public String signup(){
        return "signup";
    }

}