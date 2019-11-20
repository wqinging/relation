package com.yum.model.sys.dao;

import com.yum.model.sys.model.Role;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/13 0013 22:07
 */
@Repository
public interface RoleDao extends Mapper<Role> {

    @Select("select r.id,r.name from role r,user_role ur where r.id = ur.rid")
    List<Role> getRoleByUserId(Long userId);

}
