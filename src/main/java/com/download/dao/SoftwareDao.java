package com.download.dao;

import com.download.bean.Software;
import org.springframework.stereotype.Repository;

/**
 * Created by Laily on 16/6/2.
 */

@Repository
public interface SoftwareDao {
    Software getByIdent(String ident);
    long save(Software software);
}
