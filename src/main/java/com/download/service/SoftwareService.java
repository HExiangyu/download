package com.download.service;

import com.download.Exception.MsgException;
import com.download.bean.Software;
import com.download.dao.SoftwareDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by Laily on 16/6/2.
 */
@Service
public class SoftwareService {
    @Autowired
    SoftwareDao softwareDao;

    /**
     * 通过软件ident获取软件对象
     * @param ident
     * @return
     */
    public Software getByIdent(String ident){
        return softwareDao.getByIdent(ident);
    }

    /**
     * 检测数据合法性(后台)
     */
    public void validatorForAdmin(String name, String commonName, String ident, String url, String companyName, String remark, String keywaords, String metaDesc, String desc) throws MsgException {
        if(null == name || name.length() < 1){
            throw new MsgException("用户名不能为空");
        }
    }
}
