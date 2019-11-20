package com.yum.model.sys.service.impl;

import com.yum.model.sys.dao.RoleDao;
import com.yum.model.sys.model.Role;
import com.yum.model.sys.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/13 0013 22:09
 */
@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> getRolesByUserId(Long userId) {
        return roleDao.getRoleByUserId(userId);
    }
}
