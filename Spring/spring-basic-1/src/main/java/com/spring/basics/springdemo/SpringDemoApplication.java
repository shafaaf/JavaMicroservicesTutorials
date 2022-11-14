package com.spring.basics.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm() );


		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int res = binarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 4);
		System.out.println("res is: " + res);

	}

}
