package com.yt.boost.admin.persistent;

import com.yt.boost.admin.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * Created by tim on 2015/12/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath:applicationContext-boost-persistent.xml"})
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testUserQuery(){
        User user = userMapper.queryById(1L);
        Assert.notNull(user);
    }
}
