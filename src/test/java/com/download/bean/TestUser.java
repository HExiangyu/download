package com.download.bean;

import com.download.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hxy on 16/5/2.
 */
public class TestUser {

    @Test
    public void testFuck(){
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");
        UserService userService=(UserService)ctx.getBean("userService");
        long result  = userService.countUser();
        System.out.println(result);
    }

}
