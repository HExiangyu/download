package com.download.controller.action;

import com.download.Exception.MsgException;
import com.download.bean.JsonData;
import com.download.bean.Software;
import com.download.service.SoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by Laily on 16/6/4.
 */
@Controller
@RequestMapping("admin")
public class AdminAction {
    @Autowired
    private SoftwareService softwareService;

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
    public String doAddSoftware(HttpServletRequest request) throws MsgException {
        String name = request.getParameter("name");
        String commonName = request.getParameter("common_name");
        String ident = request.getParameter("ident");
        String url = request.getParameter("url");
        String companyName = request.getParameter("company_name");
        String remark = request.getParameter("remark");
        String keyWords = request.getParameter("keywords");
        String metaDesc = request.getParameter("meta_desc");
        String desc = request.getParameter("description");
        softwareService.validatorForAdmin(name,commonName,ident,url,companyName,remark,keyWords,metaDesc,desc);
        return new JsonData(true,"").toJSONString();
    }

    /**
     * 软件编辑
     */
    @RequestMapping("software_edit/{softwareIdent}")
    public String softwareEdit(@PathVariable("softwareIdent") String ident, ModelMap map){
        Software software = softwareService.getByIdent(ident);
        map.addAttribute("software",software);
        return "admin/software_edit";
    }
}
