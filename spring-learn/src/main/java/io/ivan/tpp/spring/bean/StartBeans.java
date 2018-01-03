package io.ivan.tpp.spring.bean;

import io.ivan.tpp.spring.bean.service.HelloService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartBeans {
	public static void main(String[] args) {
		ApplicationContext ctn = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		HelloService helloService = (HelloService)ctn.getBean("helloService");
		helloService.hello("123");
	}
}
