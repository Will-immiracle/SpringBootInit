package com.will.model.vo.user;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: GenBI
 * @description: 用户视图（脱敏）
 * @author: Mr.Zhang
 * @create: 2025-04-04 22:43
 **/

@Data
public class UserVO implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}