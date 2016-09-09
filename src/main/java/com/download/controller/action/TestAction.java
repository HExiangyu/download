package com.download.controller.action;

import com.download.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

/**
 *
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
        List<String> list = new ArrayList<>();
        list.add("asd");
        list.add("qweqwe");
        list.add("qweqwe");
        list.add("qweqwe");
        list.add("qweqwe");
        list.add("123dsa");
        return "json date";
    }


}
