package com.iranna;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsApplicationTest {
	  public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsApplicationTest.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing");
		logger.info("Test case executing 2nd time...");
		assertEquals(true,true);
	}
	

}
