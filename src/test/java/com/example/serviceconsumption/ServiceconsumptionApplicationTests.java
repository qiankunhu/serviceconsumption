package com.example.serviceconsumption;

import com.example.serviceconsumption.mapper.BumenMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceconsumptionApplicationTests {

	/*@Autowired
	StringRedisTemplate stringRedisTemplate;*/

	@Autowired BumenMapper bumenMapper;

	@Test
	public void contextLoads() {

		/*stringRedisTemplate.opsForValue().set("hqk","这是坤哥");

		System.out.println(stringRedisTemplate.opsForValue().get("hqk"));*/

		System.out.println(bumenMapper.getlistAll());
	}

}
