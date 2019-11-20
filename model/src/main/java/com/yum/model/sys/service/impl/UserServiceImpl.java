package com.yum.model.sys.service.impl;

import com.yum.model.sys.dao.UserDao;
import com.yum.model.sys.model.User;
import com.yum.model.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.UUID;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/11 0011 22:51
 */

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.selectAll();
    }

    @Override
    public void register(String userName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        userDao.insert(user);
    }

    @Override
    public User getUserById(Long userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public void deleteUser(Long userId) {
        userDao.deleteByPrimaryKey(userId);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User getUserByUserNameAndPassword(String userName, String password) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("userName",userName)
                .andEqualTo("password",password);
        return userDao.selectOneByExample(example);
    }

    @Override
    public User getUserByUserName(String userName) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("userName",userName);
        return userDao.selectOneByExample(example);
    }
}
