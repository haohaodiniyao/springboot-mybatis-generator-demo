package com.example.springboot.mybatis.generator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MapperScan("com.example.springboot.mybatis.generator")
@SpringBootTest
public class SpringbootMybatisGeneratorDemoApplicationTests {
    @Autowired
	private CpsBizGeMapper cpsBizGeMapper;
	@Test
	public void contextLoads() {
		cpsBizGeMapper.selectByExample(null);
	}

}
