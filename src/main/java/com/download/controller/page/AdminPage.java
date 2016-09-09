package com.download.controller.page;

import com.download.bean.Software;
import com.download.service.SoftwareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 管理员页面路由
 * <p>
 * Created by hxy on 16/9/9.
 */
@Controller
@RequestMapping("/admin")
public class AdminPage {

    private static final Logger logger = LoggerFactory.getLogger(AdminPage.class);

    @Autowired
    SoftwareService softwareService;


    /**
     * 登录页面
     *
     * @return ModelAndView
     */
    @RequestMapping("login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/login");
        return modelAndView;
    }

    /**
     * 首页,即软件列表页
     *
     * @return ModelAndView
     */
    @RequestMapping("index")
    public ModelAndView admin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }

    /**
     * 新增软件页面
     *
     * @return ModelAndView
     */
    @RequestMapping("newSoftware")
    public ModelAndView newSoftware() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/newSoftware");
        return modelAndView;
    }

    /**
     * 软件编辑
     */
    @RequestMapping("software_edit/{softwareIdent}")
    public ModelAndView softwareEdit(@PathVariable("softwareIdent") String ident, ModelMap map) {
        ModelAndView modelAndView = new ModelAndView();
        Software software = softwareService.getByIdent(ident);
        map.addAttribute("software", software);
        modelAndView.addObject("software",software);
        modelAndView.setViewName("admin/software_edit");
        return modelAndView;
    }

}
