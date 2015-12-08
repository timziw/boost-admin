package com.yt.boost.admin.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by tim on 2015/12/8.
 */
@Data
public class User implements Serializable{
    private static final long serialVersionUID = 7936737736128948092L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 密码盐值
     */
    private String passwordSalt;
}
