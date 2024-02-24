package com.ma.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MaItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaItemServiceApplication.class, args);
	}

}
