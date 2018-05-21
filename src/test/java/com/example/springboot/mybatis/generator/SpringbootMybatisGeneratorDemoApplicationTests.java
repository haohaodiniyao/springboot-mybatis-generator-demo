package com.example.springboot.mybatis.generator;

import org.joda.time.DateTime;
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
		CpsBizGeExample cpsBizGeExample = new CpsBizGeExample();
		cpsBizGeExample.setOrderByClause("opt_date desc");
		CpsBizGeExample.Criteria criteria = cpsBizGeExample.createCriteria();
		criteria.andOptDateEqualTo(new DateTime("2018-05-14").toDate());
		cpsBizGeMapper.selectByExample(cpsBizGeExample);

		//clear
		cpsBizGeExample.clear();
		cpsBizGeExample.setOrderByClause("opt_date asc");
		criteria = cpsBizGeExample.createCriteria();
		criteria.andBizContentEqualTo("111");
		criteria.andOptDateEqualTo(new DateTime("2018-05-12").toDate());
		cpsBizGeMapper.selectByExample(cpsBizGeExample);
	}

}
