package com.xu.test;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@MyAnn
@Service
public class Loder1 extends RedisLoaderService{
    @Override
    public void doLoad() {
        String x = "select 1 from dual";
        //直接返回一个page过的sql
        this.setPageSql(x);

    }
}
