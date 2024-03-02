package com.accenture.grupos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GruposConfig {

	@Bean(name = "componente1")
	public Componente getComponente1() {
		return new Componente("James Hetfield", "Voz");
	}
	
	@Bean(name = "componente2")
	public Componente getComponente2() {
		return new Componente("Kirk Hammett", "Guitarra");
	}
	
	@Bean(name = "componente3")
	public Componente getComponente3() {
		return new Componente("Cliff Burton", "Bajo");
	}
	
	@Bean(name = "componente4")
	public Componente getComponente4() {
		return new Componente("Lars Ulrich", "Bateria");
	}
	
	@Bean(name = "grupo")
	public Grupo getGrupo() {
		List<Componente> componentes = new ArrayList<>();
		componentes.add(getComponente1());
		componentes.add(getComponente2());
		componentes.add(getComponente3());
		componentes.add(getComponente4());
		return new Grupo("Metallica", 1981, "Estados Unidos", "Heavy Metal", componentes);
	}
}
