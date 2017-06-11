package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.UserService;
import net.dormforce.nuis.support.dao.UserDao;
import net.dormforce.nuis.support.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by ZhangJianshun on 2017/4/21 0021.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.findUsers();
    }

    @Override
    public User getUserById(int userId) {
        return userDao.findUserById(userId);
    }

    @Override
    public List<User> getUserByName(String name) {
        return userDao.findUserByName(name);
    }

    @Override
    public List<User> getUsersByDept(int deptId) {
        return userDao.findUsersByDept(deptId);
    }

    @Override
    public Boolean saveUser(User user) {
        if(user.getUserId() != null){
            return userDao.updateUser(user);
        }else{
            return userDao.addUser(user);
        }
    }

    @Override
    public Boolean removeUser(int userId) {
        return userDao.deleteUser(userId);
    }

    @Override
    public Boolean importUsersFromFile(List<User> users) {
        return userDao.importUsers(users);
    }


}
