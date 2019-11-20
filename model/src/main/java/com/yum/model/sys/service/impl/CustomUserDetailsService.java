package com.yum.model.sys.service.impl;

import com.yum.model.sys.model.CustomRole;
import com.yum.model.sys.model.CustomUserDetails;
import com.yum.model.sys.model.Role;
import com.yum.model.sys.model.User;
import com.yum.model.sys.service.IRoleService;
import com.yum.model.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/13 0013 21:55
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Set<GrantedAuthority> authorities = new HashSet<>();
        if(StringUtils.isEmpty(userName)){
            throw new  UsernameNotFoundException("用户名不能为空");
        }
        User user = userService.getUserByUserName(userName);
        if(user == null){
            throw new  UsernameNotFoundException("该用户名不存在");
        }
        List<Role> roles = roleService.getRolesByUserId(user.getId());
        roles.forEach(role -> authorities.add(new CustomRole(role)));
        return new CustomUserDetails(user,authorities);
    }
}
