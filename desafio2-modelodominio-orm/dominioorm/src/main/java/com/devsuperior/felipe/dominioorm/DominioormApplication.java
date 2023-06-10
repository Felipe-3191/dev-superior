package com.devsuperior.felipe.dominioorm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.ZoneId;
import java.util.TimeZone;

@SpringBootApplication
public class DominioormApplication {

	public static void main(String[] args) {
		SpringApplication.run(DominioormApplication.class, args);
		Instant moment = Instant.now();
		System.out.println(moment);


		System.out.println(TimeZone.getDefault());
		moment = Instant.parse("2023-06-10T19:15:00Z");
		System.out.println(moment);

	}

}
