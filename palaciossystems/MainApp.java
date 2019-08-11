package com.palaciossystems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
		
		Administrador administrador = (Administrador) applicationContext.getBean("admin");
		
		administrador.imprimirDireccion();
		System.out.println(administrador);
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

}
