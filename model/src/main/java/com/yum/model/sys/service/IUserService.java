package com.yum.model.sys.service;


import com.yum.model.sys.model.User;

import java.util.List;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/11 0011 22:47
 */
public interface IUserService {

    List<User> getAll();

    void register(String userName,String password);

    User getUserById(Long userId);

    void deleteUser(Long userId);

    User update(User user);

    User getUserByUserName(String userName);

    User getUserByUserNameAndPassword(String userName, String password);


}
