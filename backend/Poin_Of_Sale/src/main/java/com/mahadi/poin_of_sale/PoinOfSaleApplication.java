package com.mahadi.poin_of_sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PoinOfSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoinOfSaleApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("1234"));
	}

}
