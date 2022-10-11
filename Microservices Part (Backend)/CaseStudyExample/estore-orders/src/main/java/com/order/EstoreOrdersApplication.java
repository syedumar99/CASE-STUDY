package com.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.order.controller"})
public class EstoreOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoreOrdersApplication.class, args);
	}

}
