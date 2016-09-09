package com.download.controller.action;

import com.download.Exception.MsgException;
import com.download.bean.JsonData;
import com.download.bean.Software;
import com.download.service.SoftwareService;
import com.download.util.RequestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(AdminAction.class);

    @Autowired
    private SoftwareService softwareService;

    @Autowired
    private RequestUtil requestUtil;

    /**
     * 新增软件处理
     *
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
        softwareService.validatorForAdmin(name, commonName, ident, url, companyName, remark, keyWords, metaDesc, desc);
        return JsonData.simpleSuccessJsonReturnDate();
    }


}
