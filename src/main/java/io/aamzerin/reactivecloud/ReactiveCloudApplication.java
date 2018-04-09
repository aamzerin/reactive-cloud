package io.aamzerin.reactivecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("io.aamzerin.micro.**.service")
public class ReactiveCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveCloudApplication.class, args);
	}
}
