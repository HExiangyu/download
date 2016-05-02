package com.download.controller.action;

import com.download.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hxy on 16/5/2.
 */

@Controller
@RequestMapping("/action/test")
public class TestAction {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public String login(){
        return "卧槽";
    }


}
