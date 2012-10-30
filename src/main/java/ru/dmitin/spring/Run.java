package ru.dmitin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class Run {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles("config2");
		ctx.load("app-context.xml");
		ctx.refresh();				
	}
}
