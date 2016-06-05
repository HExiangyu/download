package com.download.controller.action;

import com.download.bean.JsonData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Laily on 16/6/4.
 */
@Controller
@RequestMapping("admin")
public class AdminAction {
    @RequestMapping("login")
    public String login(){
        return "admin/login";
    }

    @RequestMapping("index")
    public String admin(){
        return "admin/index";
    }

    @RequestMapping("newSoftware")
    public String newSoftware(){
        return "admin/newSoftware";
    }

    @RequestMapping("doAddSoftware")
    @ResponseBody
    public String doAddSoftware(){

        return new JsonData(true,"").toJSONString();
    }
}
