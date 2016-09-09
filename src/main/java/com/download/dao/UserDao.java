package com.download.dao;

import com.download.bean.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;


/**
 * Created by hxy on 16/5/2.
 */

@Repository
public interface UserDao {

    @Cacheable(value = "User", key = "#root.methodName")
    long count();

    @CacheEvict(value = "User", allEntries = true)
    int delete(long id);

    @Cacheable(value = "User", key = "#root.methodName+'_'+#root.args[0]")
    User findByName(String name);

    @CacheEvict(value = "User", allEntries = true)
    long save(User user);

}
