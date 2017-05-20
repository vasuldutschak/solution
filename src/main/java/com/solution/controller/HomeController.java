package com.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    private static final String HOME_PAGE="index";

    @RequestMapping(value = {"/","/index"})
    public String homePage(){
        return HOME_PAGE;
    }
}
