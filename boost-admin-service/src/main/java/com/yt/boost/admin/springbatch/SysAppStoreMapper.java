package com.yt.boost.admin.springbatch;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by tim on 2015/12/10.
 */
public class SysAppStoreMapper implements RowMapper<SysAppStore> {

    public SysAppStoreMapper() {
        super();
    }

    @Override
    public SysAppStore mapRow(ResultSet resultSet, int i) throws SQLException {
        SysAppStore sysAppStore = new SysAppStore();
        sysAppStore.setId(resultSet.getLong("id"));
        sysAppStore.setUsername(resultSet.getString("username"));
        sysAppStore.setPassword(resultSet.getString("password"));
        sysAppStore.setPasswordSalt(resultSet.getString("password_salt"));
        return sysAppStore;
    }
}
