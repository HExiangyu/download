package com.download.controller.action;

import com.download.bean.Software;
import com.download.service.SoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Laily on 16/6/2.
 */
@Controller
@RequestMapping("/software")
public class SoftwareAction{
    @Autowired
    private SoftwareService softwareService;

    @RequestMapping("index/{softwareIdent}")
    @ResponseBody
    public ModelAndView index(@PathVariable("softwareIdent") String softwareIdent, ModelMap map){
        Software software = softwareService.getByIdent(softwareIdent);
        map.addAttribute("software",software);
        ModelAndView mv = new ModelAndView("software/index");
        return mv;
    }
}
