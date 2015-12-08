package com.yt.boost.admin.persistent;

import com.yt.boost.admin.model.User;

/**
 * Created by tim on 2015/12/8.
 */
public interface UserMapper {

    User queryById(Long id);
}
