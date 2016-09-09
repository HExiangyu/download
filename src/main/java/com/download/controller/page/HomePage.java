package com.download.controller.page;

import com.download.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * 正常页面路由
 * Created by hxy on 16/4/30.
 */


@Controller
@RequestMapping("/")
public class HomePage {

    @Resource
    UserService userService;

    @RequestMapping("")
    public ModelAndView rootIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("test", "index");
        System.out.println(userService.countUser());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("test", "index");
        System.out.println(userService.insertUser());
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
