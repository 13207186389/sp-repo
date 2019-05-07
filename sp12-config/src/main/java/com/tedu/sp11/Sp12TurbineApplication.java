package com.tedu.sp11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;



@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class Sp12TurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp12TurbineApplication.class, args);
	}

}
