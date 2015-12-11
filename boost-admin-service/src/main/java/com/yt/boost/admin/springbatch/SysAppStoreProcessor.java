package com.yt.boost.admin.springbatch;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by tim on 2015/12/10.
 */
public class SysAppStoreProcessor  implements ItemProcessor<SysAppStore, SysAppStore> {

    public SysAppStoreProcessor() {

    }

    @Override
    public SysAppStore process(SysAppStore item) throws Exception {
        System.out.println(item.getUsername()); //这里什么都不做,输出一下
        return item;
    }
}
