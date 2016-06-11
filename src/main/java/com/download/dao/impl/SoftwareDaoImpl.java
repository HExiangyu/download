package com.download.dao.impl;

import com.download.bean.Software;
import com.download.dao.SoftwareDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Laily on 16/6/2.
 */
@Repository
public class SoftwareDaoImpl implements SoftwareDao{
    @Autowired
    SoftwareDao softwareDao;

    /**
     * 根据软件ident获取相应软件
     * @param ident
     * @return
     */
    @Override
    public Software getByIdent(String ident) {
        return softwareDao.getByIdent(ident);
    }

    @Override
    public long save(Software software) {
        return softwareDao.save(software);
    }
}
