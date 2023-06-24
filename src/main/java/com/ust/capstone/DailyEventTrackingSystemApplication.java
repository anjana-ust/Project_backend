package com.ust.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class DailyEventTrackingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyEventTrackingSystemApplication.class, args);
	}

}
