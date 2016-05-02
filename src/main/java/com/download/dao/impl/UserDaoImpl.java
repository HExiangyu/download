package com.download.dao.impl;

import com.download.bean.User;
import com.download.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * dao的实现
 * Created by hxy on 16/5/2.
 */

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    public CacheManager cacheManager;


    @Autowired
    public UserDao userDao;

    @Override
    @Cacheable(value = "User",key="'count'")
    public long count() {
        return userDao.count();
    }

    @Override
    @CacheEvict(value="User", allEntries=true)
    public long insert(User user){
        user.setRemark("wocao");
        user.setName("name");
        user.setAddr("addr");
        user.setNature("nature sadasd");
        long result =  userDao.insert(user);
        System.out.println(result);
        return result;
    }

    @Override
    @CacheEvict(value="User", allEntries=true)
    public int delete(long id) {
        return userDao.delete(id);
    }

    @Override
    @Cacheable(value = "User",key="'name'+#name")
    public User findByName(String name) {
        return null;
    }

}
