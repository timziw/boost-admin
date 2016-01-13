package com.yt.boost.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tim on 2015/12/8.
 */
@Controller
public class UserController {

    @RequestMapping(value = "index",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "index";
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public String login(){
        return "login";
    }

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
