package com.yum.model.sys.dao;

import com.yum.model.sys.model.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/11 0011 22:48
 */
@Repository
public interface UserDao extends Mapper<User> {
}
