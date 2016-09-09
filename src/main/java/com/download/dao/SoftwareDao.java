package com.download.dao;

import com.download.bean.Software;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * Created by Laily on 16/6/2.
 */

@Repository
public interface SoftwareDao {

    @Cacheable(value = "Software", key = "#root.methodName+'_'+#root.args[0]")
    Software getByIdent(String ident);

    @CacheEvict(value = "Software", allEntries = true)
    long save(Software software);
}
