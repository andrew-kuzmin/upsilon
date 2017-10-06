package com.dev.upsilon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UPsilonApplication {

	private final static Logger log = LoggerFactory.getLogger(UPsilonApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UPsilonApplication.class, args);
	}

}