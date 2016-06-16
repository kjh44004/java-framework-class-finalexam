package com.madogiga.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MIYEON on 2016-06-16.
 */
@Controller
@EnableAutoConfiguration
public class CommentsController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model){
        return "login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signUp(Model model){
        return "signup";
    }
}
