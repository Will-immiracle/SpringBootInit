package com.will.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: GenBI
 * @description: 用户更新个人信息请求
 * @author: Mr.Zhang
 * @create: 2025-04-04 23:53
 **/

@Data
public class UserUpdateMyRequest implements Serializable {

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    private static final long serialVersionUID = 1L;
}