package com.yt.boost.service.base;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
* 测试基类
* Created by tim on 2015/12/7.
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/boost-admin-spring-test-profile.xml")
@ActiveProfiles(profiles = "mock")
public abstract class BaseSpringTest {
    /**
     * 环境变量
     */
    protected static String PROFILE;

    /**
     * mock 响应器
     */
    @Resource
    private TestHelper testHelper;

    @Before
    public void setUp() {
        PROFILE = testHelper.getCurrentProfile();

        MockitoAnnotations.initMocks(this);
        if (Profile.MOCK.getValue().equals(PROFILE)) {
            fullMock();
        }
    }

    public abstract void fullMock();
}
