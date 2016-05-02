package com.download.dao;

import com.download.bean.User;
import org.springframework.stereotype.Repository;


/**
 * Created by hxy on 16/5/2.
 */

@Repository
public interface UserDao {

    long count();

    int delete(long id);

    User findByName(String name);

    long insert(User user);

}
