package com.download.controller.page;

import com.download.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

/**
 * Created by hxy on 16/4/30.
 */


@Controller
@RequestMapping("/")
public class HomePage {

    @Resource
    UserService userService;

    @RequestMapping("")
    public String rootIndex(ModelMap map) {
        map.addAttribute("test","index");
        System.out.println( userService.countUser() );
        return "index";
    }

    @RequestMapping("index")
    public String index(ModelMap map) {
        map.addAttribute("test", "index");
        System.out.println(userService.insertUser());
        return "index";
    }

}
