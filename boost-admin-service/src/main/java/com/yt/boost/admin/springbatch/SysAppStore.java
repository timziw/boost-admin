package com.yt.boost.admin.springbatch;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by tim on 2015/12/10.
 */
@Data
public class SysAppStore implements Serializable{

    private Long id;

    private String username;

    private String password;

    private String passwordSalt;
}
