package com.example.springboot.mybatis.generator;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class UseRedis {
    @Bean
    public JedisCluster jedisCluster() {
        Set<HostAndPort> haps = this.parseHostAndPort();
        GenericObjectPoolConfig genericObjectPoolConfig = createGenericObjectPoolConfig();
        JedisCluster jedisCluster = new JedisCluster(haps, 1000, 3, genericObjectPoolConfig);

        return jedisCluster;
    }


    private GenericObjectPoolConfig createGenericObjectPoolConfig() {
        GenericObjectPoolConfig genericObjectPoolConfig = new GenericObjectPoolConfig();
        genericObjectPoolConfig.setMaxWaitMillis(1500);
        genericObjectPoolConfig.setMaxIdle(10);
        genericObjectPoolConfig.setMinIdle(1);
        genericObjectPoolConfig.setMaxIdle(5);

        return genericObjectPoolConfig;
    }

    private Set<HostAndPort> parseHostAndPort() {
        Set<HostAndPort> hostAndPortSet = new HashSet<HostAndPort>();
        hostAndPortSet.add(new HostAndPort("127.0.0.1", 6380));
//        hostAndPortSet.add(new HostAndPort("127.0.0.1", 6381));
        return hostAndPortSet;
    }
}