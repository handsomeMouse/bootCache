package com.xu.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class Ke01ServiceImpl extends Basesu implements Ke01Service {
	@Autowired
	private Ke01Repository kp;
	@CachePut(value = "MYKE01CACHES",cacheManager = "redisCacheManagerXU") //,cacheManager = "redisCacheManager"  cacheNames="111111",
//	@Cacheable
	@Override
	public Map<String,Object> findAll1(String key) {
		// TODO Auto-generated method stub
		Long begin = System.currentTimeMillis();
		List<Ke01> ke01s = kp.findAll();
		Long end = System.currentTimeMillis();
		System.out.println(">>>>>>>>>>>>>>花费时长："+(end -begin));
		StringBuffer strb = new StringBuffer();
		Map<String,Object> map = new HashMap<String, Object>();
		Map<String,Object> mapin = new HashMap<String, Object>();
		mapin.put("AAAAA",77777);
		map.put(key,mapin);
		return map;
	}

	@Override
	public Map<String, Object> findAll() {
		for(int i=0;i<100;i++){

			this.findAll1(i+"");
		}
		return null;
	}



}
