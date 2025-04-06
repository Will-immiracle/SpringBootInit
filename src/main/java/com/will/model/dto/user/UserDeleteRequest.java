package com.will.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: UserCenter
 * @description: 删除请求
 * @author: Mr.Zhang
 * @create: 2025-03-26 22:25
 **/
@Data
public class UserDeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}