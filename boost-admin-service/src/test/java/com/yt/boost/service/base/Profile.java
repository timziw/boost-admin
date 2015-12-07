package com.yt.boost.service.base;

import lombok.Getter;

/**
* user:aokage
* time:2014-5-12 18:47
*/
public enum Profile {
    DUBBO("dubbo"),
    MOCK("default"),
    LOCAL("local");

    @Getter
    private String value;

    Profile(String value) {
        this.value = value;
    }
}
