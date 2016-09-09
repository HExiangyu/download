package com.download.service;

import com.download.bean.User;
import com.download.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * user的service
 * Created by hxy on 16/5/2.
 */

@Service
public class UserService {

    @Autowired
    UserDao userDao;


    public long countUser() {
        return userDao.count();
    }

    public long insertUser(){
        User user= new User();
        user.setRemark("wocao");
        user.setName("name");
        user.setAddr("addr");
        user.setNature("nature sadasd");
        long result =  userDao.save(user);
        System.out.println(result);
        return result;
    }

}
