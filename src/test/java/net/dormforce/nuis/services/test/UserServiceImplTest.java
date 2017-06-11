package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.UserServiceImpl;
import net.dormforce.nuis.support.pojo.User;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ZhangJianshun on 2017/4/21 0021.
 */
public class UserServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private UserServiceImpl userService;

    private User user = null;

    {
        userService = (UserServiceImpl) applicationContext.getBean("userService");
        user = new User();
        user.setDeptId("1");
        user.setEmail("123@sina.com");
        user.setIsManager("Y");
        user.setName("张三");
        user.setTelephone("15200000000");
    }

    @Test
    public void saveUser() throws Exception {
        user.setUserId(2);
        System.out.println(userService.saveUser(user));
    }

    @Test
    public void getUsers() throws Exception {
        System.out.println(userService.getUsers());
    }

    @Test
    public void getUser() throws Exception {
        System.out.println(userService.getUserById(1));
        System.out.println(userService.getUserByName("张三"));
        System.out.println(userService.getUsersByDept(1));
    }

    @Test
    public void removeUser() throws Exception {
        System.out.println(userService.removeUser(2));
    }

    @Test
    public void importUsers() throws Exception {
        List<User> list = new ArrayList<User>();
        user.setUserId(3);
        list.add(user);
        User user2 = new User();
        user2.setDeptId("1");
        user2.setEmail("123344@sina.com");
        user2.setIsManager("Y");
        user2.setName("李四");
        user2.setTelephone("152011111100");
        user2.setUserId(4);
        list.add(user2);
        System.out.println(userService.importUsersFromFile(list));
    }

}