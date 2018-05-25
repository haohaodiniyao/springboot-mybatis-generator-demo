package com.example.springboot.mybatis.generator;

import com.example.springboot.mybatis.generator.mybatis.CpsBizGeExample;
import com.example.springboot.mybatis.generator.mybatis.CpsBizGeMapper;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisCluster;

import java.io.UnsupportedEncodingException;

@RunWith(SpringRunner.class)
@MapperScan("com.example.springboot.mybatis.generator.mybatis")
@ComponentScan("com.example.springboot.mybatis.generator")
@SpringBootTest
public class SpringbootMybatisGeneratorDemoApplicationTests {
	@Autowired
	private JedisCluster jedisCluster;
    @Autowired
	private CpsBizGeMapper cpsBizGeMapper;
	@Test
	public void contextLoads() {
//		CpsBizGeExample cpsBizGeExample = new CpsBizGeExample();
//		cpsBizGeExample.setOrderByClause("opt_date desc");
//		CpsBizGeExample.Criteria criteria = cpsBizGeExample.createCriteria();
//		criteria.andOptDateEqualTo(new DateTime("2018-05-14").toDate());
//		cpsBizGeMapper.selectByExample(cpsBizGeExample);
//
//		//clear
//		cpsBizGeExample.clear();
//		cpsBizGeExample.setOrderByClause("opt_date asc");
//		criteria = cpsBizGeExample.createCriteria();
//		criteria.andBizContentEqualTo("111");
//		criteria.andOptDateEqualTo(new DateTime("2018-05-12").toDate());
//		cpsBizGeMapper.selectByExample(cpsBizGeExample);


		try {
			jedisCluster.setex("hello123".getBytes("UTF-8"),100,"hello123".getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
