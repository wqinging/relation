package com.yum.model.sys.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/13 0013 22:24
 */
public class CustomRole implements GrantedAuthority {

    private Role role;

    public CustomRole(Role role){
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role.getRoleName();
    }
}
