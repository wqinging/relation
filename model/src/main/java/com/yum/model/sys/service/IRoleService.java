package com.yum.model.sys.service;

import com.yum.model.sys.model.Role;

import java.util.List;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/13 0013 22:08
 */
public interface IRoleService {

    List<Role> getRolesByUserId(Long userId);
}
