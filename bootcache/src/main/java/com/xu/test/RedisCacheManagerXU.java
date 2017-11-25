package com.xu.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@Component()

public class RedisCacheManagerXU implements CacheManager {
@Autowired
private RedisCacheXU redisCache;
private RedisCacheManager re;
//public RedisCacheManagerXU(RedisTemplate redisTemplate){
//    this.redisTemplate = redisTemplate;
//}
    @Override
    public Cache getCache(String s) {
        return redisCache.setRedisCacheName(s);
    }

    @Override
    public Collection<String> getCacheNames() {
    Set<String> set = new HashSet<String>();
    set.add("MYKE01CACHES");
        return set;
    }
}
