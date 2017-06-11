package net.dormforce.nuis.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import net.dormforce.nuis.support.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2017/4/19 0019.
 */
public interface UserService {

    public List<User> getUsers();

    public User getUserById(int userId);

    public List<User> getUserByName(String name);

    public List<User> getUsersByDept(int deptId);

    public Boolean saveUser(User user);

    public Boolean removeUser(int userId);

    public Boolean importUsersFromFile(List<User> users);
}
