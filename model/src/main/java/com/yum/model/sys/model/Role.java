package com.yum.model.sys.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/13 0013 22:05
 */
@Data
public class Role {
    @Id
    private Long id;

    private String roleName;

}
