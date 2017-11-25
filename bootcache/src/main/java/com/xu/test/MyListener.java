package com.xu.test;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Component
public class MyListener implements ApplicationListener<ContextRefreshedEvent> {
//    @Override
//    public void onApplicationEvent(ApplicationEvent event) {
////        applicationEvent.getApplicationContext().getBeansWithAnnotation(TableBind.class);
//        System.out.print("测试成功");
//
//    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

       Map<String,Object> map = contextRefreshedEvent.getApplicationContext().getBeansWithAnnotation(MyAnn.class);
        System.out.print("测试成功");
    }
}
