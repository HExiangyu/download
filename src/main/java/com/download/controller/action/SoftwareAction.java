package com.download.controller.action;

import com.download.bean.JsonData;
import com.download.bean.Software;
import com.download.service.SoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Laily on 16/6/2.
 */
@Controller
@RequestMapping("/software")
public class SoftwareAction{
    @Autowired
    private SoftwareService softwareService;

    /**
     * 展示软件详情
     * @param softwareIdent 软件唯一ident
     * @param map
     * @return
     */
    @RequestMapping("s/{softwareIdent}")
    public String index(@PathVariable("softwareIdent") String softwareIdent, ModelMap map){
        Software software = softwareService.getByIdent(softwareIdent);
        map.addAttribute("software",software);
        return "software/index";
    }

    /**
     * 添加软件页面
     * @return
     */
    @RequestMapping("add")
    public String add(){
        return "software/add";
    }

    /**
     * 快速添加软件处理
     * @param softwareUrl 软件官网网址
     * @return
     */
    @RequestMapping("doAdd")
    @ResponseBody
    public String doAdd(@RequestParam("softwareUrl") String softwareUrl) {
        return JsonData.simpleSuccessJsonReturnDate();
    }
}
