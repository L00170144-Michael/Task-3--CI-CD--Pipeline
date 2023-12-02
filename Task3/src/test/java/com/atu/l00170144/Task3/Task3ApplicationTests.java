package com.atu.l00170144.Task3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Task3ApplicationTests {

	@Test
	void contextLoads() {
		Task3Application quicktest = new Task3Application();
		String hWorld = "Hello World";
		String helloWorld = quicktest.Hello();
		assertEquals(hWorld, helloWorld);
	}
	
	

}
