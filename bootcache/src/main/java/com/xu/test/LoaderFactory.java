package com.xu.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class LoaderFactory implements CommandLineRunner {
    @Autowired
    private  MyListener listener;
    @Override
    public void run(String... strings) throws Exception {
        System.out.print("进入启动加载");
    }
}
