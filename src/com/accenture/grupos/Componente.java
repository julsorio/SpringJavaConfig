package com.accenture.grupos;

public class Componente {
	private String nombre;
	private String instrumento;

	public Componente() {
	}

	public Componente(String nombre, String instrumento) {
		this.nombre = nombre;
		this.instrumento = instrumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public String toString() {
		return "Componente " + nombre + " a la " + instrumento;
	}
	
	

}
