package ru.dmitin.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import ru.dmitin.spring.ClassA;


@Configuration
public class ConfigDefault {

	@Bean
	public ClassA example() {
		System.out.println("default");
		return new ClassA();
	}
}
