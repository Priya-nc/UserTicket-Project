
package com.wolken.wolkenProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan("com.wolken.wolkenProject")
@SpringBootApplication
public class WolkenProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WolkenProjectApplication.class, args);
	}

}
