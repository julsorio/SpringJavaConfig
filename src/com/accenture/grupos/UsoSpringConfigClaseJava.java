package com.accenture.grupos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Clase donde se obtiene el contexto de spring a partir de la clase
 * de configuracion
 * 
 * @author Andrea Ravagli Castillo
 */
public class UsoSpringConfigClaseJava {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(GruposConfig.class);
		Grupo grupo = context.getBean("grupo", Grupo.class);
		
		System.out.println(grupo.toString());
		grupo.getComponentes().forEach(componente -> {
			System.out.println(componente.toString());
		});

	}

}
