package com.qhieco.commonentity.relational;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 刘江茳 363834586@qq.com
 * @version 2.0.1 创建时间: 2018/2/8 17:46
 * <p>
 * 类说明：
 * 对应用户角色关联表
 */
@Data
@Entity
@Table(name = "b_user_role")
public class UserRoleB {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "web_user_id")
    private Integer webUserId;
}