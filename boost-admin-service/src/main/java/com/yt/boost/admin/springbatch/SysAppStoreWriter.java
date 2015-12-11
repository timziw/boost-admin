package com.yt.boost.admin.springbatch;

import lombok.Setter;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tim on 2015/12/10.
 */
public class SysAppStoreWriter implements ItemWriter<SysAppStore> {

    @Override
    public void write(List items) throws Exception {
        for (Object item : items) {
            System.out.println(item); //也不做任何事
        }
    }


}
