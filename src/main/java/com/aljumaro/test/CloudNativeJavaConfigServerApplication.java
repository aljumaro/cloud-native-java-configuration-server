package com.aljumaro.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudNativeJavaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudNativeJavaConfigServerApplication.class, args);
	}
}
