package com.sathish.devtools;

//https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-devtools.html

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
*
* @author Sathish Kariyanna
*/
@SpringBootApplication
public class DevToolsApplication {

	public static void main(String[] args) {
		//Disabling Restart, If you do not want to use the restart feature
		//System.setProperty("spring.devtools.restart.enabled", "false");
		
		SpringApplication.run(DevToolsApplication.class, args);
	}

}
