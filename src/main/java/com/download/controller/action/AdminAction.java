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
    /**
     * 登录页面
     * @return
     */
    @RequestMapping("login")
    public String login(){
        return "admin/login";
    }

    /**
     * 首页,即软件列表页
     * @return
     */
    @RequestMapping("index")
    public String admin(){
        return "admin/index";
    }

    /**
     * 新增软件页面
     * @return
     */
    @RequestMapping("newSoftware")
    public String newSoftware(){
        return "admin/newSoftware";
    }

    /**
     * 新增软件处理
     * @return
     */
    @RequestMapping("doAddSoftware")
    @ResponseBody
    public String doAddSoftware(){

        return new JsonData(true,"").toJSONString();
    }
}
