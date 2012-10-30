package ru.dmitin.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import ru.dmitin.spring.ClassA;

@Configuration
@Profile("config2")
public class Config2 {

	@Bean
	public ClassA example() {
		System.out.println("config2");
		return new ClassA();
	}
}
