package com.xu.test;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.support.SimpleValueWrapper;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
@Component
public class RedisCacheXU implements Cache{
    @Autowired
    private JedisConnectionFactory jedisConnectionFactory;
    private String name = "DEFAULTNAME";

    public RedisCacheXU setRedisCacheName(String name) {
        this.name = name;
            return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Object getNativeCache() {//?????????忘了干啥的了
        return this;
    }

    @Override
    public ValueWrapper get(Object o) {
        //这个地方写Map解析即可
        SimpleValueWrapper si = new SimpleValueWrapper("我是许关春");
        return si;
    }

    @Override
    public <T> T get(Object o, Class<T> aClass) {
        return null;
    }

    @Override
    public <T> T get(Object o, Callable<T> callable) {
        return null;
    }

    @Override
    public void put(Object o, Object o1) {
        System.out.print("开始进行缓存存储");
        try {
        Jedis jedis =(Jedis)jedisConnectionFactory.getConnection().getNativeConnection();
        Map mapWantJson = (Map)o1;
       Iterator it= mapWantJson.keySet().iterator();
        ObjectMapper mapper = new ObjectMapper();
        while (it.hasNext()) {
            Object key = it.next();
            String x = mapper.writeValueAsString(mapWantJson.get(key));
            mapWantJson.put(key, x);
        }
        jedis.hmset(name,mapWantJson);
        }catch (Exception e){
            //如果存储过程中出现了异常需要写一个报告存入到redis中，这样就不用管别的了
            //这块是重点
        }
    }

    @Override
    public ValueWrapper putIfAbsent(Object o, Object o1) {

        return null;
    }

    @Override
    public void evict(Object o) {

    }

    @Override
    public void clear() {

    }
}
