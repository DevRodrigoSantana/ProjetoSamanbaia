package com.projeto_samanbaia;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = {"com.projeto_samanbaia", "socket"})
class ProjetoSamanbaiaApplicationTests {

	@Test
	void contextLoads() {
	}

}
