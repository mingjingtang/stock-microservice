package com.example.stocktransactionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockTransactionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockTransactionServiceApplication.class, args);
	}

}
