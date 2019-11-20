package com.yum.model.sys.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/11 0011 22:33
 */

@Data
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

}
