package com.xu.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
//@Configuration
//@EnableCaching
public class RedisCacheConfig extends CachingConfigurerSupport {
//    private static final ResourceBundle bundle = ResourceBundle.getBundle("redis");
//
//    private String redisHost = bundle.getString("redis.ip");
//    private int redisPort = Integer.valueOf(bundle.getString("redis.port"));
//    private String redisPassword = bundle.getString("redis.auth");
//    private int expireTime = Integer.valueOf(bundle.getString("redis.cache.expireTime"));
    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.port}")
    private int port;
    @Value("${spring.redis.timeout}")
    private int timeout;
//    @Value("${spring.redis.password}")
//    private String password;
    @Bean
    public JedisConnectionFactory redisConnectionFactory() {
        JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
        // Defaults
        redisConnectionFactory.setHostName(host);
        redisConnectionFactory.setPort(port);
//        redisConnectionFactory.setPassword(password);
        return redisConnectionFactory;
    }

    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory cf) {
        RedisTemplate<String, String> redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(cf);
        return redisTemplate;
    }

    /**
     * 缓存管理器
     * @param redisTemplate
     * @return
     */
    @Bean
    public CacheManager cacheManager(RedisTemplate redisTemplate) {
        //@修改
        RedisCacheManagerXU cacheManager = new RedisCacheManagerXU();
        // Number of seconds before expiration. Defaults to unlimited (0)
//        cacheManager.setDefaultExpiration(expireTime);// Sets the default expire time (in seconds)
        return cacheManager;
    }

    /**
     * @description 自定义的缓存key的生成策略</br>
     *              若想使用这个key</br>
     *              只需要讲注解上keyGenerator的值设置为customKeyGenerator即可</br>
     * @return 自定义策略生成的key
     */
    @Bean
    public KeyGenerator keyGenerator() {
        return new KeyGenerator(){
            @Override
            public Object generate(Object target, java.lang.reflect.Method method, Object... params) {
                StringBuffer sb = new StringBuffer();
                sb.append(target.getClass().getName());
                sb.append(method.getName());
                for(Object obj:params){
                    sb.append(obj.toString());
                }
                return sb.toString();
            }
        };
    }

//    作者：jsondream
//    链接：http://www.jianshu.com/p/268e69f64b66
//    來源：简书
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
