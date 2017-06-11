package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {

    public List<User> findUsers();

    public User findUserById(int userId);

    public List<User> findUserByName(String user);

    public List<User> findUsersByDept(int deptId);

    public Boolean addUser(User user);

    public Boolean updateUser(User user);

    public Boolean deleteUser(int userId);

    public Boolean importUsers(List<User> user);

}