package com.capitalone.CapitalOne_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class CapitalOneServiceApplication {
	
	int a=1;
	static void test() {
		System.out.println("hello test");
	}

	public static void main(String[] args) {
		SpringApplication.run(CapitalOneServiceApplication.class, args);
		
		System.out.println("hello team");
		test();
	}

}
